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
					url: "/user/select", //url:设置能够返回JSON数据的Action所对应的路径
					columns: [
						[{
								field: 'usersId',
								title: '用户编号',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.usersId;
								}
							},
							{
								field: 'usersLoginname',
								title: '登陆名',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.usersLoginname;
								}
							},
							{
								field: 'usersRealname',
								title: '真实姓名',
								width: 150,
								align: "center",
								formatter: function(value, row) {
										return row.usersRealname;
								}
							},
							{
								field: 'usersSex',
								title: '性别',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.usersSex;
								}
							},
							{
								field: 'usersTelephone',
								title: '联系电话',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.usersTelephone;
								}
							},
							{
								field: 'categories',
								title: '用户角色',
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
								field: 'usersIsdel',
								title: '是否可以删除',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									if(row.usersIsdel == 1){
										return "是";
										}else{
											return "否";
											}
								}
							},

						]
					]
				});
				
				$('#dg').datagrid('load');
				
				$(".Insert").click(function() {
					$("#dlg").dialog({
						width: 500,
						height: 400,
						closed: true,
						closable: true,
						modal: true
					}).dialog("setTitle", "添加用户").dialog("open");
					$("#frm1").attr("src", "/user/toadd");
				});
				
				$(".Delete").click(function() {
					var row = $("#dg").datagrid("getSelected");
					if(row.usersIsdel != 1){
						$.messager.alert("警告", "您选择的用户无法删除", "warning");
						return;
						}
					if(row != null) {
						$.messager.confirm("提示", "你确定要删除选中的信息吗", function(r) {
							if(r) {
								$.get("/user/delete", {
									usersId: row.usersId
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
							width: 500,
							height: 400
						}).dialog("setTitle", "修改用户").dialog("open");
						$("#frm1").attr("src", "/user/toupdate?usersId=" + row.usersId);
					} else {
						$.messager.alert("提示", "请选择需要编辑的行", "warning");
					}
				});
				
				$(".Search").click(function() {
					$('#dg').datagrid('load', {
						usersLoginname: $('#txtS_Name').val(),
						usersRealname: $('#txtS_ContactName').val(),
						usersTelephone: $('#txtS_Address').val()
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
					</div>
					<div>
						登陆名：<input id="txtS_Name" type="text">
						真实姓名：<input id="txtS_ContactName" type="text">
						联系电话：<input id="txtS_Address" type="text">
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
				        <div style="width:400px;height:300px;">
						<iframe id="frm1" width="99%" height="99%" frameborder="0"></iframe>
						</div>
				</div>
			</div>
			
</body>
</html>