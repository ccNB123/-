<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
		<script src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/icon.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/site.css" />

</head>
<body>
      <script type="text/javascript">
function aa()
if($("#U_ LoginName").val() =="") { $.messager.alert("提示", "请输入用户名"， "warning"); return false; }
return true;

}</script>
<form action="/shop/addUser" method="post" target="_parent">
 <input type= "hidden" name="shopId" value="${shop.shopId }"/>
<table align="center">
<tr>
<td>用户名: </td>
<td><input class="text-box single-line" id="U_ LoginName" name="usersLoginname" type="text" value="" /></td></tr><tr>
    </tr>  
    <tr>
        <td><input data-val="true" data-val -number="字段S_ ID必须是-个数字。" data-val-required="S_ ID字段是必需的。" id="S_ID" name="S_ID" type="hidden" value="1"></td>
        <td><input type="submit" onclick="return aa()" value="分配店长的账号"/></td>
</tr>
</table>
<p style="color: Red;" >账号的默认密码为: 123456</p>
</body>
</html>