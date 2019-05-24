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
           if($("#cardlevelsLevelname").val()==""){
               $.messager.alert("提示","请输入等级名称","warning");
               return false;
               }
           if($("#cardlevelsNeedpoint").val()==""){
               $.messager.alert("提示","请输入所需最大积分","warning");
               return false;
               }
           if($("#cardlevelsPoint").val()==""){
               $.messager.alert("提示","请输入兑换比例","warning");
               return false;
               }
           if($("#cardlevelsPercent").val()==""){
               $.messager.alert("提示","请输入折扣比例","warning");
               return false;
               }
           return true;
          }
    </script>
<form action="${pageContext.request.contextPath}/card/update" method="post" target="_parent">
<input type="hidden" name="cardlevelsId" value="${cardlevels.cardlevelsId }">
   <table align="center">
      <tr>
         <td>等级名称：</td>
         <td><input class="text-box single-line" id="cardlevelsLevelname" name="cardlevelsLevelname" type="text" value="${cardlevels.cardlevelsLevelname }" /></td>
      </tr>
       <tr>
            <td>所需最大积分：</td>
         <td><input class="text-box single-line" id="cardlevelsNeedpoint" name="cardlevelsNeedpoint" type="text" value="${cardlevels.cardlevelsNeedpoint }" /></td>
       </tr>
       <tr>
            <td>兑换比例：</td>
         <td><input class="text-box single-line" id="cardlevelsPoint" name="cardlevelsPoint" type="text" value="${cardlevels.cardlevelsPoint }" /></td>
       </tr>
       <tr>
       <td><p style="color: Red;" >(注: 消费xx人民币自动兑换成1积分,默认: 10RMB=1积分)</p></td>
       </tr>
       <tr>
            <td>折扣比例：</td>
         <td><input class="text-box single-line" id="cardlevelsPercent" name="cardlevelsPercent" type="text" value="${cardlevels.cardlevelsPercent }" /></td>
       </tr>
       <tr>
       <td><p style="color: Red;" >(注: 达到此等级时,所享受的折扣率,如: 0.87表示八折,1表示不打折)</p></td>
       </tr>
       <tr>
           <td></td>
           <td><input type="submit" onclick="return validate()" value="修改"></td>
       </tr>
   </table>
</form>
</body>
</html>