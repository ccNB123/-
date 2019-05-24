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
					$.messager.alert("提示", "请先查找减积分的会员", "warning");
					return false;
				}
				if ($("#CO_TotalMoney").val() == "") {
					$.messager.alert("提示", "请输入消费金额", "warning");
					return false;
				}
				if ($("#CO_DiscountMoney").val() == "") {
					$.messager.alert("提示", "折后总金额不能为空", "warning");
					return false;
				}
				if ($("#CO_GavePoint").val() == "") {
					$.messager.alert("提示", "累计积分数量不能为空", "warning");
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
								      $("#a").text("");
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
				       $("#CO_CreateTime").text(a);
				             }
		             
		         $(function () {
			           aa();
			           $("#CO_TotalMoney").keyup(function () {
				           var aa = $("#CO_TotalMoney").val() * $("#aa").text();
				           var bb = $("#CO_TotalMoney").val() / 10;
				           $("#CO_DiscountMoney").val(aa);
				           $("#CO_GavePoint").val(parseInt(bb));
				                     });
	                           });
		</script>
	<form action="/con/consume" method="post">
		<input type="hidden" id="aa1" />
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
					<td>消费时间：<label id="CO_CreateTime" name="consumeordersCreatetime"></label></td>
				</tr>
				<tr>
					<td>姓名：<font style="color: Blue"><label id="MC_Name1"></label></font></td>
					<td>等级：<font style="color: Blue"><label id="MC_CardID1"></label>（折扣比例：<label
							id="aa"></label>）</font></td>
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
			<legend>
				<label></label>
			</legend>
			<font style="color:"red">暂无优惠活动</font>
		</fieldset>
		<table>
			<tr>
				<td>输入消费金额：</td>
				<td><input class="text-box single-line" data-val="true"
					data-val-number="字段 CO_TotalMoney 必须是一个数字。"
					data-val-required="CO_TotalMoney 字段是必需的。"
					id="CO_TotalMoney" name="consumeordersTotalmoney" type="text" value="" /></td>
				<td>此处输入金额会按照会员等级自动打折</td>
			</tr>
			<tr>
				<td>折后总金额：</td>
				<td><input class="text-box single-line" data-val="true"
					data-val-number="字段 CO_DiscountMoney 必须是一个数字。"
					data-val-required="CO_DiscountMoney 字段是必需的。"
					id="CO_DiscountMoney" name="consumeordersDiscountmonry" type="text" value="" /></td>
				<td>可自动累计积分数量： <input class="text-box single-line"
					data-val="true" data-val-number="字段 CO_GavePoint 必须是一个数字。"
					data-val-required="CO_GavePoint 字段是必需的。"
					id="CO_GavePoint" name="consumeordersGavepoint" type="text" readonly="readonly" value="" /></td>
			</tr>
			<tr>
				<td>付费方式：<input type="radio" checked="checked" />现金支付
				</td>
				<td>优惠活动：<font style="color: red">暂无</font></td>
			</tr>
		</table>
		<fieldset>
			<legend>说明</legend>
			输入实际的消费金额，系统会自动按照会员等级中的设置按照一定比例计算积分并累计到会员账户<br />
			在“系统管理”》会员等级管理中可以设置RMB和积分的兑换比例<br /> 在“系统管理”》会员等级管理中可以设置是否直接输入折后总金额<br />
			在“系统管理”》会员等级管理中可以设置是否直接输入累计积分数量
		</fieldset>
		<input type="hidden" id="Point" />
		 <input data-val="true" data-val-number="字段 MC_ID 必须是一个数字。" data-val-required="MC_ID 字段是必需的。"
			id="MC_ID" name="memcardsId" type="hidden" value="" />
			<input id="MC_CardID" name="memcardsCardid" type="hidden" value="" />
			<input id="consumeordersOrdertype" name="consumeordersOrdertype" type="hidden" value="150" />
			<input type="submit" onclick="return bb()" value="马上结算" />
	</form>
</body>
</html>