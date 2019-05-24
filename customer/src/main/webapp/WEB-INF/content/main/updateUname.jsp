<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加店铺</title>
<script src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
		<script src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/easyui/themes/icon.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/site.css" />
</head>
<body>

    <script type="text/javascript">
         function validate(){
           if($("#usersLoginname").val()==""){
               $.messager.alert("提示","请输入登录名","warning");
               return false;
               }
           if($("#usersRealname").val()==""){
               $.messager.alert("提示","请输入真实姓名","warning");
               return false;
               }
           if($("#usersTelephone").val()==""){
               $.messager.alert("提示","请输入联系人电话","warning");
               return false;
               }
           if($("#usersRole").val()==""){
               $.messager.alert("提示","请选择角色","warning");
               return false;
               }
           if($("#usersIsdel").val()==""){
        	   $("#usersIsdel").val()==0;
               
               } 
           return true;
          }
    </script>
<form action="${pageContext.request.contextPath}/user/updateuname" method="post" target="_parent">
<input type="hidden" name="usersId" value="${user.usersId }">
   <table align="center">
      <tr>
         <td>登录名：</td>
         <td><input class="text-box single-line" id="usersLoginname" name="usersLoginname" type="text" value="${user.usersLoginname }" /></td>
      </tr>
       <tr>
         <td>真实姓名：</td>
         <td><input class="text-box single-line" id="usersRealname" name="usersRealname" type="text" value="${user.usersRealname }" /></td>
       </tr>
       <tr>
            <td>性别：</td>
         <td><input class="text-box single-line"  name="usersSex"  value="男" type="radio" <c:if test="${user.usersSex.equals('男') }">checked</c:if> />男</td>
         <td><input class="text-box single-line"  name="usersSex"  value="女" type="radio" <c:if test="${user.usersSex.equals('女') }">checked</c:if> />女</td>
       </tr>
       <tr>
            <td>联系电话：</td>
         <td><input class="text-box single-line" id="usersTelephone" name="usersTelephone" type="text" value="${user.usersTelephone }" /></td>
       </tr>
          <tr>
            <td>角色：</td>
         <td>
         <select id="usersRole" name="usersRole">
           <option value="">--请选择--</option>
           <c:forEach items="${categoriesList }" var="c">
                  <option value="${c.categoryId }"
                  <c:if test="${c.categoryId eq user.usersRole }">selected</c:if>
                  >${c.categoryTitle }</option>
           </c:forEach>
         </select>
         </td>
       </tr>
       <tr>
           <td></td>
           <td><input type="submit" onclick="return validate()" value="修改"></td>
       </tr>
   </table>
</form>
</body>
</html>