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
			function bb() {
				if ($("#MC_Name1").text() == "") {
					$.messager.alert("提示", "请先查找积分返现的会员", "warning");
					return false;
				}
				if ($("#CO_GavePoint").val() == "") {
					alert("请输入减积分");
					return false;
				}
				if ($("#MC_Point1").text() - $("#CO_GavePoint").val() < 0) {
					$.messager.alert("提示", "积分不足", "warning");
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
					              $("#aa").text(data.cardlevels.cardlevelsPercent);
					              $("#MC_Point1").text(data.memcardsPoint);
					              $("#MC_TotalMoney1").text(data.memcardsTotalmoney == null?0:data.memcardsTotalmoney);
					              $("#MC_ID").val(data.memcardsId);
					              $("#MC_CardID").val(data.memcardsCardid);
							      }else{
								      $.messager.alert("提示","该会员已锁定或挂失!","warning");
								      $("#MC_Name1").text("");
								      $("#MC_CardID1").text("");
								      $("#aa").text("");
								      $("#MC_Point1").text("");
								      $("#MC_TotalMoney1").text("");
								      $("#MC_ID").val("");
								      $("#MC_CardID").val("");
								      }
						      } else {
						    	  $.messager.alert("提示","没有找到该会员的信息!","warning");
							      }
					      })
			} //获取当前时间
			       function aa() {
				        var de = new Date();
				        var y = de.getFullYear();
				        var m = de.getMonth() + 1;
				        var d = de.getDate();
				        var h = de.getHours();
				        var mi = de.getMinutes();
				        var s = de.getSeconds();
				        var a = y + '-' + (m < 10 ? ('0' + m) : m) + '-' + (d < 10 ? ('0' + d) : d) + ' ' + (h < 10 ? ('0' + h) : h) + ':' + (mi < 10 ? ('0' + mi) : mi) + ':' + (s < 10 ? ('0' + s) : s);
				        $("#CO_CreateTime").val(a);
				                  }
	                  
	               $(function () {
		                aa();
		                $("#CO_GavePoint").keyup(function () {
			                    var aa = $("#MC_Point1").text() - $("#CO_GavePoint").val();
			                    var bb= $("#CO_GavePoint").val()/10;
			                    $("#CO_Recash").val(bb);
			                    $("#er").val(aa);
			                                  });
                                  });
		</script>
	<form action="/con/updatePoint" method="post">
		<table style="width: 99%">
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
					<td>等级：<font style="color: Blue"><label id="MC_CardID1"></label>
					（折扣比例：<label id="aa"></label>）</font></td>
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
			<legend>积分返现</legend>
			<table>
				<tr>
					<td>兑换日期：</td>
					<td><input class="text-box single-line" data-val="true"
						data-val-date="字段 CO_CreateTime 必须是日期。"
						data-val-required="CO_CreateTime 字段是必需的。"
						id="CO_CreateTime" name="consumeordersCreaterime" type="datetime" value="" /></td>
				</tr>
				<tr>
					<td>兑换积分：</td>
					<td><input class="text-box single-line" data-val="true"
						data-val-number="字段 CO_GavePoint 必须是一个数字。"
						data-val-required="CO_GavePoint 字段是必需的。"
						id="CO_GavePoint" name="consumeordersGavepoint" type="text" value="" /></td>
					<td>积分返现</td>
					<td><input class="text-box single-line" data-val="true"
						data-val-number="字段 CO_Recash 必须是一个数字。"
						data-val-required="CO_Recash 字段是必需的。"
						id="CO_Recash" name="consumeordersRecash" type="text" readonly="readonly" value="" /></td>
				</tr>
				<tr>
					<td>剩余积分：</td>
					<td><input type="text" id="er" name="er" /></td>
				</tr>
			</table>
		</fieldset>
		<fieldset>
			<legend>说明</legend>
			操作过程中，只需输入操作的会员卡号/手机查询对应的会员，再输入兑换积分，系统将自动计算。<br />
			在“管理”》“其他设置”中可以设置会员积分返现的兑换比例。
		</fieldset>
		<input type="hidden" id="Point" />
		 <input data-val="true" data-val-number="字段 MC_ID 必须是一个数字。" data-val-required="MC_ID 字段是必需的。"
			id="MC_ID" name="memcardsId" type="hidden" value="" />
			<input id="MC_CardID" name="memcardsCardid" type="hidden" value="" />
			<input id="consumeordersOrdertype" name="consumeordersOrdertype" type="hidden" value="152" />
			<input type="submit" onclick="return bb()" value="马上返现" />
	</form>
</body>
</html>