<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改店铺</title>
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
           if($("#shopName").val()==""){
               $.messager.alert("提示","请输入店铺名称","warning");
               return false;
               }
           if($("#shopCategory").val()==""){
               $.messager.alert("提示","请选择店铺类型","warning");
               return false;
               }
           if($("#shopContactname").val()==""){
               $.messager.alert("提示","请输入联系人姓名","warning");
               return false;
               }
           if($("#shopContacttel").val()==""){
               $.messager.alert("提示","请输入联系人电话","warning");
               return false;
               }
           if($("#shopAddress").val()==""){
               $.messager.alert("提示","请输入店铺地址","warning");
               return false;
               }
           return true;
          }
    </script>
<form action="${pageContext.request.contextPath}/shop/update" method="post" target="_parent">
   <input type="hidden" name="shopId" value="${shop.shopId }">
   <table align="center">
      <tr>
         <td>店铺名称：</td>
         <td><input class="text-box single-line" id="shopName" name="shopName" type="text" value="${shop.shopName }" /></td>
      </tr>
       <tr>
         <td>店铺类型：</td>
         <td>
         <select id="shopCategory" name="shopCategoryId">
           <option value="">--请选择--</option>
           <c:forEach items="${categoriesList }" var="c">
                  <option value="${c.categoryId }"
                  <c:if test="${c.categoryId eq shop.shopCategoryId }">selected</c:if>
                  >${c.categoryTitle }</option>
           </c:forEach>
         </select>
         </td>
       </tr>
       <tr>
            <td>联系人：</td>
         <td><input class="text-box single-line" id="shopContactname" name="shopContactname" type="text" value="${shop.shopContactname }" /></td>
       </tr>
       <tr>
            <td>联系电话：</td>
         <td><input class="text-box single-line" id="shopContacttel" name="shopContacttel" type="text" value="${shop.shopContacttel }" /></td>
       </tr>
          <tr>
            <td>店铺选址：</td>
         <td><input class="text-box single-line" id="shopAddress" name="shopAddress" type="text" value="${shop.shopAddress }" /></td>
       </tr>
        <tr>
            <td>备注：</td>
         <td><input class="text-box single-line" id="shopRemark" name="shopRemark" type="text" value="${shop.shopRemark }" /></td>
       </tr>
       <tr>
           <td></td>
           <td><input type="submit" onclick="return validate()" value="修改"></td>
       </tr>
   </table>
</form>
</body>
</html>