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
	<script type="text/javascript">
			function aa() {
				if ($("#MC_Name1").text() == "") {
					$.messager.alert("提示", "请先查找减积分的会员", "warning");
					return false;
				}
				if ($("#CO_GavePoint").val() == "") {
					$.messager.alert("提示", "请输入减积分", "warning");
					return false;
				}
				return true;
			}
			function screch() {
				$.getJSON("/mem/screch",{
			    	  memcardsReferercard : $("#MC_CardID2").val()
				      }, function(data) {
					      if(data != null && data.memcardsId != -1){
						      
						      if(data.memcardsState == 130){
						    	  $("#MC_Name1").text(data.memcardsName);
					              $("#MC_CardID1").text(data.cardlevels.cardlevelsLevelname);
					              $("#MC_Point1").text(data.memcardsPoint);
					              $("#MC_TotalMoney1").text(data.memcardsTotalmoney == null?0:data.memcardsTotalmoney);
					              $("#MC_ID").val(data.memcardsId);
					              $("#MC_CardID").val(data.memcardsCardid);
							      }else{
								      $.messager.alert("提示","该会员已锁定或挂失!","warning");
								      $("#MC_Name1").text("");
								      $("#MC_CardID1").text("");
								      $("#MC_Point1").text("");
								      $("#MC_TotalMoney1").text("");
								      $("#MC_ID").val("");
								      $("#MC_CardID").val("");
								      }
						      } else {
						    	  $.messager.alert("提示","没有找到该会员的信息!","warning");
							      }
					      })
				
			}
		</script>
	<form action="/con/minusPoint" method="post">
		<table style="width: 99%" align="center">
		</table>
		<fieldset>
			<legend>查找会员</legend>
			<table style="width: 99%">
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td><input id="MC_CardID2" type="text" />
					<input type="button" onclick="screch()" value="查找" /></td>
					<td></td>
				</tr>
				<tr>
					<td>姓名：<font style="color: Blue"><label id="MC_Name1"></label></font></td>
					<td>等级：<font style="color: Blue"><label id="MC_CardID1"></label></font></td>
				</tr>
				<tr>
					<td>当前积分：<font style="color: Blue">
					<label id="MC_Point1"></label></font></td>
					<td>累计消费：￥<font style="color: Blue">
					<label id="MC_TotalMoney1"></label></font></td>
				</tr>
			</table>
		</fieldset>
		<fieldset>
			<legend>减积分信息</legend>
			<table>
				<tr>
					<td>扣除积分：</td>
					<td><input class="text-box single-line" data-val="true"
						data-val-number="字段 CO_GavePoint 必须是一个数字。" data-val-required="CO_GavePoint 字段是必需的。"
						id="CO_GavePoint" name="consumeordersGavepoint" type="text" value="" /></td>
				</tr>
				<tr>
					<td>备注：</td>
					<td><input class="text-box single-line" id="CO_Remark" name="consumeordersRemark" type="text" value="" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input data-val="true" data-val-number="字段 MC_ID 必须是一个数字。"
						data-val-required="MC_ID 字段是必需的。"
						id="MC_ID" name="memcardsId" type="hidden" value="" />
						<input id="MC_CardID" name="memcardsCardid" type="hidden" value="" />
						<input id="consumeordersOrdertype" name="consumeordersOrdertype" type="hidden" value="150" /></td>
				</tr>
			</table>
		</fieldset>
		<input type="submit" onclick="return aa()" value="减积分" />
	</form>
</body>
</html>