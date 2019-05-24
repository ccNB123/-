<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加礼品</title>
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
           if($("#exchanggiftsGiftcode").val()==""){
               $.messager.alert("提示","请输入礼品代号","warning");
               return false;
               }
           if($("#exchanggiftsGiftname").val()==""){
               $.messager.alert("提示","请输入礼品名称","warning");
               return false;
               }
           if($("#exchanggiftsPhoto").val()==""){
               $.messager.alert("提示","请选择图片","warning");
               return false;
               }
           if($("#exchanggiftsPoint").val()==""){
               $.messager.alert("提示","请输入所需积分","warning");
               return false;
               }
           if($("#exchanggiftsInteger").val()==""){
               $.messager.alert("提示","请输入礼品数量","warning");
               return false;
               }
           return true;
          }
    </script>
<form action="${pageContext.request.contextPath}/gift/update" method="post" target="_parent" enctype="multipart/form-data">
<input type="hidden" name="exchanggiftsId" value="${exchanggifts.exchanggiftsId }">
   <table align="center">
      <tr>
         <td>礼品代号：</td>
         <td><input class="text-box single-line" id="exchanggiftsGiftcode" name="exchanggiftsGiftcode" type="text" value="${exchanggifts.exchanggiftsGiftcode }" /></td>
      </tr>
       <tr>
            <td>礼品名称：</td>
         <td><input class="text-box single-line" id="exchanggiftsGiftname" name="exchanggiftsGiftname" type="text" value="${exchanggifts.exchanggiftsGiftname }" /></td>
       </tr>
       <tr>
            <td>图片：</td>
         <td><input class="text-box single-line" id="exchanggiftsPhoto" name="file" type="file" value="" /></td>
       </tr>
       <tr>
            <td>所需积分：</td>
         <td><input class="text-box single-line" id="exchanggiftsPoint" name="exchanggiftsPoint" type="text" value="${exchanggifts.exchanggiftsPoint }" /></td>
       </tr>
       <tr>
            <td>礼品数量：</td>
         <td><input class="text-box single-line" id="exchanggiftsInteger" name="exchanggiftsInteger" type="text" value="${exchanggifts.exchanggiftsInteger }" /></td>
       </tr>
       <tr>
            <td>备注：</td>
         <td><input class="text-box single-line" id="exchanggiftsRemark" name="exchanggiftsRemark" type="text" value="${exchanggifts.exchanggiftsRemark }" /></td>
       </tr>
       <tr>
           <td></td>
           <td><input type="submit" onclick="return validate()" value="添加"></td>
       </tr>
   </table>
</form>
</body>
</html>