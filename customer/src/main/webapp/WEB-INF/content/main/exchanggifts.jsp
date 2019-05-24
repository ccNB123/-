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
					url: "/gift/select", //url:设置能够返回JSON数据的Action所对应的路径
					columns: [
						[{
								field: 'exchanggiftsId',
								title: '礼品编号',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.exchanggiftsId;
								}
							},
							{
								field: 'exchanggiftsGiftcode',
								title: '礼品代号',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.exchanggiftsGiftcode;
								}
							},
							{
								field: 'exchanggiftsGiftname',
								title: '礼品名称',
								width: 150,
								align: "center",
								formatter: function(value, row) {
										return row.exchanggiftsGiftname;
								}
							},
							{
								field: 'exchanggiftsPoint',
								title: '所需积分',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.exchanggiftsPoint;
								}
							},
							{
								field: 'exchanggiftsInteger',
								title: '礼品数量',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.exchanggiftsInteger;
								}
							},
							{
								field: 'exchanggiftsExchangnum',
								title: '已兑换数量',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.exchanggiftsExchangnum;
								}
							},
							{
								field: 'exchanggiftsRemark',
								title: '备注',
								width: 150,
								align: "center",
								formatter: function(value, row) {
									return row.exchanggiftsRemark;
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
					}).dialog("setTitle", "添加礼品").dialog("open");
					$("#frm1").attr("src", "/gift/toadd");
				});
				
				$(".Delete").click(function() {
					var row = $("#dg").datagrid("getSelected");
					if(row != null) {
						$.messager.confirm("提示", "是否删除该礼品信息", function(r) {
							if(r) {
								$.get("/gift/delete", {
									exchanggiftsId: row.exchanggiftsId
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
						}).dialog("setTitle", "修改礼品").dialog("open");
						$("#frm1").attr("src", "/gift/toupdate?exchanggiftsId=" + row.exchanggiftsId);
					} else {
						$.messager.alert("提示", "请选择需要编辑的行", "warning");
					}
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