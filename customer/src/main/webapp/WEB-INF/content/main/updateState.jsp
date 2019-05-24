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
           if($("#memcardsCardid").val()==""){
               $.messager.alert("提示","请输入会员卡号","warning");
               return false;
               }
           if($("#memcardsState").val()==""){
               $.messager.alert("提示","请选择会员卡状态","warning");
               return false;
               }
           return true;
          }
    </script>
<form action="${pageContext.request.contextPath}/mem/updateState" method="post" target="_parent">
<input type="hidden" name="memcardsId" value="${memcard.memcardsId }">
   <table align="center">
      <tr>
         <td>会员卡号：</td>
         <td><input class="text-box single-line" id="memcardsCardid" name="memcardsCardid" type="text" value="${memcard.memcardsCardid }" /></td>
      </tr>
       <tr>
         <td>状态：</td>
         <td>
         <select id="memcardsState" name="memcardsState">
						<option value="">--请选择--</option>
						<c:forEach items="${categoriesList }" var="cat">
							<option value="${cat.categoryId }"
							<c:if test="${cat.categoryId eq memcard.memcardsState }">selected</c:if>
							>${cat.categoryTitle }</option>
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