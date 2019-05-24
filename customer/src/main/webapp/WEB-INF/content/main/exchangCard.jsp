<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="${pageContext.request.contextPath }/css/site.css" rel="stylesheet">
</head>
<body>
	<script src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js"></script>
		<script src="${pageContext.request.contextPath }/easyui/locale/easyui-lang-zh_CN.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/default/easyui.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/icon.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/site.css" />
	<script type="text/javascript">
		function aa() {
			if ($("#oldPwd").val() == "") {
				$.messager.alert("提示", "请输入旧卡卡密码", "warning");
				return false;
			}
			if ($("#MC_CardID").val() == "") {
				$.messager.alert("提示", "请输入新会员卡号", "warning");
				return false;
			}
			if ($("#newPwd").val() == "") {
				$.messager.alert("提示", "请输入新会员卡密码", "warning");
				return false;
			}
			if ($("#MC_Password").val() == "") {
				$.messager.alert("提示", "请输入确认密码", "warning");
				return false;
			}
			return true;
		}
		
		$(function() {
			$("#MC_ID").val($("#MC_ID1").val());
			
			$("#sum").click(function() {
				if (aa()) {
					var str = $("#newPwd").val();
					var str1 = $("#MC_Password").val();
					$.get("/mem/ReloadPwd", {
						memcardsId : $("#MC_ID1").val(),
						memcardsPassword : $("#oldPwd").val()
					}, function(data) {
						if (data == 1) {
							if (str == str1) {
								$("form").submit();
							} else {
								alert("两次输入不一致");
								return false;
							}
						} else {
							alert("旧密码输入错误！");
						}
					});
				}
			});
		});
	</script>
	<form action="/mem/update" method="post" target="_parent">
		<fieldset>
			<legend>会员基本信息</legend>
			<input type="hidden" id="MC_ID1" value="${memcard.memcardsId}" />
			<table align="center">
				<tr>
					<td>会员姓名：</td>
					<td>${memcard.memcardsName }</td>
				</tr>
				<tr>
					<td>会员等级：</td>
					<td>${memcard.cardlevels.cardlevelsLevelname }</td>
				</tr>
				<tr>
					<td>登记日期：</td>
					<td><fmt:formatDate value="${memcard.memcardsCreatetime }" pattern="yyyy-MM-dd"/></td>
				</tr>
			</table>
		</fieldset>
		<fieldset>
			<legend>换卡信息</legend>
			<table align="center">
				<tr>
					<td>请输入此卡密码：</td>
					<td><input id="oldPwd" type="password" /></td>
				</tr>
				<tr>
					<td>新会员卡号：</td>
					<td><input class="text-box single-line" id="MC_CardID"
						name="memcardsCardid" type="text" value="" /></td>
				</tr>
				<tr>
					<td>新会员卡密码：</td>
					<td><input id="newPwd" type="password" /></td>
				</tr>
				<tr>
					<td>确认密码：</td>
					<td><input id="MC_Password" name="memcardsPassword" type="password" /></td>
				</tr>
				<tr>
					<td><input data-val="true" data-val-number="字段 MC_ID 必须是一个数字。"
						data-val-required="MC_ID 字段是必需的。" id="MC_ID" name="memcardsId"
						type="hidden" value="" /></td>
					<td><input type="button" id="sum" value="换卡" /></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>