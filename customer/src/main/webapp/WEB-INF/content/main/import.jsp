<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		
<form action="/mem/importExcel" enctype="multipart/form-data" method="post" target="_parent">
<input name="file" type="file" />
<input  type="submit" value="导入" />  
</form> 
</body>
</html>