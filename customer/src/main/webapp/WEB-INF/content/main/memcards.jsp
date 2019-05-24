<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="${pageContext.request.contextPath }/css/site.css" rel="stylesheet">
</head>
<body  class="panel-noscroll">
<script src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js"></script>
		<script src="${pageContext.request.contextPath }/easyui/locale/easyui-lang-zh_CN.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/default/easyui.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/icon.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/site.css" />
		<script type="text/javascript">
			$(function() {
				$("#dg").datagrid({
					fitColumns: true,
					toolbar: "#tb", //toolbar:通过选择器指定的工具栏。
					pagination: true, //pagination:如果为true，则在DataGrid控件底部显示分页工具栏。
					fit: true, //fit:当设置为true的时候面板大小将自适应父容器。
					singleSelect: true, //如果为true，则只允许选择一行。
					rownumbers: true, //如果为true，则显示一个行号列。
					url: "/mem/select", //url:设置能够返回JSON数据的Action所对应的路径
					columns: [
						[{
								field: 'memcardsCardid',
								title: '会员卡号',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.memcardsCardid;
								}
							},
							{
								field: 'memcardsName',
								title: '会员姓名',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.memcardsName;
								}
							},
							{
								field: 'memcardsMobile',
								title: '电话',
								width: 150,
								align: "center",
								formatter: function(value, row) {
										return row.memcardsMobile;
								}
							},
							{
								field: 'memcardsTotalmoney',
								title: '累计消费',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.memcardsTotalmoney;
								}
							},
							{
								field: 'memcardsState',
								title: '会员卡状态',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.categories.categoryTitle;
								}
							},
							{
								field: 'memcardsPoint',
								title: '当前积分',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.memcardsPoint;
								}
							},
							{
								field: 'memcardsSex',
								title: '性别',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									if(row.memcardsSex == 1){
										return "女";
										}else{
											return "男";
											}
									
								}
							},
							{
								field: 'memcardsCreatetime',
								title: '登记时间',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									var date = new Date();
									date.setTime(row.memcardsCreatetime);
									return date.getFullYear()+"年"+(date.getMonth()+1)+"月"+date.getDate()+"日";
								}
							},
							{
								field: 'cardlevelsId',
								title: '当前等级',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.cardlevels.cardlevelsLevelname;
								}
							},

						]
					]
				});
				
				$('#dg').datagrid('load');
				
				$(".Insert").click(function() {
					$("#dlg").dialog({
						width: 800,
						height: 600,
						closed: true,
						closable: true,
						modal: true
					}).dialog("setTitle", "添加会员").dialog("open");
					$("#frm1").attr("src", "/mem/toadd");
				});
				
				$(".Delete").click(function() {
					var row = $("#dg").datagrid("getSelected");
					if(row != null) {
						$.messager.confirm("提示", "是否删除该会员信息", function(r) {
							if(r) {
								$.get("/mem/delete", {
									memcardsId: row.memcardsId
								}, function(data) {
									$.messager.alert("提示", data, "info");
									$("#dg").datagrid("reload");
								});
							}
						});
					} else {
						$.messager.alert("提示", "请选择需要删除的行", "warning");
					}
				});
				
				$(".Update").click(function() {
					var row = $("#dg").datagrid("getSelected");
					if(row != null) {
						$("#dlg").dialog({
							width: 800,
							height: 600
						}).dialog("setTitle", "修改会员").dialog("open");
						$("#frm1").attr("src", "/mem/toupdate?memcardsId=" + row.memcardsId);
					} else {
						$.messager.alert("提示", "请选择需要编辑的行", "warning");
					}
				});

				$(".State").click(function() {
					var row = $("#dg").datagrid("getSelected");
					if(row != null) {
						$("#dlg").dialog({
							width: 800,
							height: 600
						}).dialog("setTitle", "挂失/锁定").dialog("open");
						$("#frm1").attr("src", "/mem/tostate?memcardsId=" + row.memcardsId);
					} else {
						$.messager.alert("提示", "请选择需要编辑的行", "warning");
					}
				});

				$(".Mem").click(function() {
					var row = $("#dg").datagrid("getSelected");
					if(row != null) {
						$("#dlg").dialog({
							width: 800,
							height: 600
						}).dialog("setTitle", "会员转账").dialog("open");
						$("#frm1").attr("src", "/mem/tomove?memcardsId=" + row.memcardsId);
					} else {
						$.messager.alert("提示", "请选择需要编辑的行", "warning");
					}
				});

				$(".Card").click(function() {
					var row = $("#dg").datagrid("getSelected");
					if(row != null) {
						$("#dlg").dialog({
							width: 800,
							height: 600
						}).dialog("setTitle", "会员换卡").dialog("open");
						$("#frm1").attr("src", "/mem/toexchange?memcardsId=" + row.memcardsId);
					} else {
						$.messager.alert("提示", "请选择需要编辑的行", "warning");
					}
				});

				$(".Import").click(function() {
					$("#dlg").dialog({
						width: 430,
						height: 200,
						closed: true,
						closable: true,
						modal: true
					}).dialog("setTitle", "导入Excel").dialog("open");
					$("#frm1").attr("src", "/mem/toimport");
				});

				$(".Export").click(function() {
					location="/mem/export";
				});
				
				$(".Search").click(function() {
					$('#dg').datagrid('load', {
						memcardsCardid: $('#txtS_Name').val(),
						memcardsName: $('#txtS_ContactName').val(),
						memcardsMobile: $('#txtS_Address').val(),
						cardlevelsId: $('#cardlevelsId').val(),
						memcardsState: $('#memcardsState').val()
					});
				});
			});
		</script>
		<div class="panel datagrid" style="width: 1800px;">
			<div class="datagrid-wrap panel-body panel-body-noheader" title="" style="width: 1800px; height: 592px;">
				<div id="tb" style="padding:5px;height:auto" class="datagrid-toolbar">
					<div style="margin-bottom:5px">
						<a href="#" class="easyui-linkbutton Insert l-btn l-btn-small" iconcls="icon-add" group="" id="">新增	</a>
						<a href="#" class="easyui-linkbutton Update l-btn l-btn-small" iconcls="icon-edit" group="" id="">修改</a>
						<a href="#" class="easyui-linkbutton Delete l-btn l-btn-small" iconcls="icon-remove" group="" id="">删除</a>
						<a href="#" class="easyui-linkbutton State l-btn l-btn-small" iconcls="icon-lock" group="" id="">挂失/锁定</a>
						<a href="#" class="easyui-linkbutton Mem l-btn l-btn-small" iconcls="icon-undo" group="" id="">会员转账</a>
						<a href="#" class="easyui-linkbutton Card l-btn l-btn-small" iconcls="icon-reload" group="" id="">会员换卡</a>
						<a href="#" class="easyui-linkbutton Export l-btn l-btn-small" iconcls="icon-print" group="" id="">导出Excel</a>
						<a href="#" class="easyui-linkbutton Import l-btn l-btn-small" iconcls="icon-redo" group="" id="">导入Excel</a>
					</div>
					<div>
						会员卡号：<input id="txtS_Name" type="text">
						会员姓名：<input id="txtS_ContactName" type="text">
						电话：<input id="txtS_Address" type="text">
						会员等级:
						<select id="cardlevelsId" name="cardlevelsId">
						<option value="">--请选择--</option>
						<c:forEach items="${cardlevels }" var="car">
							<option value="${car.cardlevelsId }">${car.cardlevelsLevelname }</option>
						</c:forEach>
					    </select>
					        状态:
						<select id="memcardsState" name="memcardsState">
						<option value="">--请选择--</option>
						<c:forEach items="${categoriesList }" var="cat">
							<option value="${cat.categoryId }">${cat.categoryTitle }</option>
						</c:forEach>
					    </select>
					 <a href="#" class="easyui-linkbutton Search l-btn l-btn-small" iconcls="icon-search" group="" id="">查询</span><span class="l-btn-icon icon-search">&nbsp;</span></span>
						</a>
					</div>
				</div>
			<table id="dg" style="display: none;"></table>
			</div>
		</div>
			<div style="display: none;margin: 0 auto;">
				<div id="dlg">
				        <div style="width:800px;height:500px;">
						<iframe id="frm1" width="99%" height="99%" frameborder="0"></iframe>
						</div>
				</div>
			</div>
			
</body>
</html>