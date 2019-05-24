<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js"></script>
		<script src="${pageContext.request.contextPath }/easyui/locale/easyui-lang-zh_CN.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/default/easyui.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/icon.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/login.css" />
		<script src="${pageContext.request.contextPath }/js/login.js"></script>
</head>
<body>
<div id="login">
<form action="${pageContext.request.contextPath}/user/login" id="userForm" method="post" onsubmit="return validate()">   
            <font style="color: red;">${msg }</font>    
			<p>用户名<input type="text" id="username" name="usersLoginname" placeholder="请输入用户名" class="textbox"/></p>
			<p>密&nbsp;&nbsp;&nbsp;&nbsp;码<input type="password" placeholder="请输入密码" id="password" name="usersPassword" class="textbox"/></p>
		<p style="text-align:center;"><input type="submit" value="登录"></p>
</form>
</div>
</body>
</html>