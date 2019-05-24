<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
<script src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/site.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/pwdmodify.js"></script>
</head>
<body>
<form id="userForm" name="userForm" action="${pageContext.request.contextPath}/user/updatepwd" method="post" target="_parent">
<input type="hidden" name="usersId" value="${user.usersId }">
<input type="hidden" id="path" value="${pageContext.request.contextPath}">
   <table align="center">
      <tr>
         <td>原密码：</td>
         <td><input class="text-box single-line" id="oldpwd" name="oldpwd" type="password" value="" /><span></span></td>    
       </tr>
       <tr>
         <td>新密码：</td>
         <td><input class="text-box single-line" id="newpwd" name="newpwd" type="password" value="" /><span></span></td>
       </tr>
       <tr>
            <td>确认密码：</td>
         <td><input class="text-box single-line" id="newpwd1" name="newpwd1" type="password" value="" /><span></span></td>
       </tr>
       <tr>
           <td></td>
           <td><input type="button" id="save"  name="save" value="修改密码"></td>
       </tr>
   </table>
</form>
</body>
</html>