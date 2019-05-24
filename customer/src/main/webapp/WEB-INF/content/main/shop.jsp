<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
					url: "/shop/select", //url:设置能够返回JSON数据的Action所对应的路径
					columns: [
						[{
								field: 'shopId',
								title: '店铺编号',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.shopId;
								}
							},
							{
								field: 'shopName',
								title: '店铺姓名',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.shopName;
								}
							},
							{
								field: 'categories',
								title: '店铺类别',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									if(row.categories){
										return row.categories.categoryTitle;
										}
									return value;
								}
							},
							{
								field: 'shopContactname',
								title: '联系人',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.shopContactname;
								}
							},
							{
								field: 'shopContacttel',
								title: '联系电话',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.shopContacttel;
								}
							},
							{
								field: 'shopAddress',
								title: '店铺地址',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.shopAddress;
								}
							},
							{
								field: 'shopRemark',
								title: '备注',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.shopRemark;
								}
							},
							{
								field: 'shopIshassetadmin',
								title: '是否已分配管理员',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									if(row.shopIshassetadmin) {
										return "是";
									} else {
										return "否";
									}
								}
							},
							{
								field: 'shopCreatetime',
								title: '加盟时间',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									var date = new Date();
									date.setTime(row.shopCreatetime);
									return date.getFullYear()+"年"+(date.getMonth()+1)+"月"+date.getDate()+"日";
								}
							},

						]
					]
				});
				
				$('#dg').datagrid('load');
				
				$(".Insert").click(function() {
					$("#dlg").dialog({
						width: 600,
						height: 300,
						closed: true,
						closable: true,
						modal: true
					}).dialog("setTitle", "添加店铺").dialog("open");
					$("#frm1").attr("src", "/shop/toadd");
				});
				
				$(".Delete").click(function() {
					var row = $("#dg").datagrid("getSelected");
					if(row != null) {
						$.messager.confirm("提示", "是否删除该条店铺信息", function(r) {
							if(r) {
								$.get("/shop/delete", {
									shopId: row.shopId
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
							width: 600,
							height: 300
						}).dialog("setTitle", "修改店铺").dialog("open");
						$("#frm1").attr("src", "/shop/toupdate?shopId=" + row.shopId);
					} else {
						$.messager.alert("提示", "请选择需要编辑的行", "warning");
					}
				});
				
				$(".AddUser").click(function() {
					var row = $("#dg").datagrid("getSelected");
					if(row != null) {
						if(!row.shopIshassetadmin) {
							$("#dlg").dialog({
								width: 600,
								height: 300
							}).dialog("setTitle", "分配管理员").dialog("open");
							$("#frm1").attr("src", "/shop/toaddUser?shopId=" + row.shopId);
						} else {
							$.messager.alert("提示", "该店铺已分配管理员", "warning");
						}

					} else {
						$.messager.alert("提示", "请选择需要操作的行", "warning");
					}
				});
				$(".Search").click(function() {
					$('#dg').datagrid('load', {
						shopName: $('#txtS_Name').val(),
						shopContactname: $('#txtS_ContactName').val(),
						shopAddress: $('#txtS_Address').val()
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
						<a href="#" class="easyui-linkbutton AddUser l-btn l-btn-small" iconcls="icon-ok" group="" id="">分配管理员	</a>
					</div>
					<div>
						店铺名称：<input id="txtS_Name" type="text">
						联系人：<input id="txtS_ContactName" type="text">
						店铺地址：<input id="txtS_Address" type="text">
						<a href="#" class="easyui-linkbutton Search l-btn l-btn-small" iconcls="icon-search" group="" id="">查询</span><span class="l-btn-icon icon-search">&nbsp;</span></span>
						</a>
					</div>
				</div>
			<table id="dg" style="display: none;"></table>
			</div>
		</div>
			<div style="display: none;margin: 0 auto;">
				<div id="dlg">
				        <div>
				        <div style="width:500px;height:200px;">
						<iframe id="frm1" width="99%" height="99%" frameborder="0"></iframe>
						</div>
				</div>
			</div>
			
</body>
</html>