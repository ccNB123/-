<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="${pageContext.request.contextPath}/css/site.css" rel="stylesheet" /> 
</head>
<body>
<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/default/easyui.css" />
<link href="${pageContext.request.contextPath}/easyui/themes/icon.css" rel="stylesheet" type="text/css" />
<script src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js"></script>
<script src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
<script type="text/javascript">
			function aa() {
				if ($("#TL_TransferMoney").val() == "") {
					$.messager.alert("提示", "请输入转账金额", "warning");
					return false;
				}
				if($("#memcardsMoney").text() - $("#TL_TransferMoney").val() < 0){
					$.messager.alert("提示", "余额不足", "warning");
					return false;
				}
				return true;
			}
			
			$(function() {
				$("#TL_FromMC_ID").val($("#id1").val());
				$("#TL_FromMC_CardID").val($("#MC_CardID").text());
			});
			
			function screch() {
				$.getJSON("/mem/screch", {
					memcardsReferercard : $("#MC_CardID2").val()
				}, function(data) {
					if (data.memcardsId != -1) {
						$("#MC_CardID1").text(data.memcardsCardid);
						$("#MC_Name1").text(data.memcardsName);
						$("#MC_Point1").text(data.memcardsPoint == null?0:data.memcardsPoint);
						$("#MC_TotalMoney1").text(data.memcardsTotalmoney == null?0:data.memcardsTotalmoney);
						$("#memcardsMoney1").text(data.memcardsMoney == null?0:data.memcardsMoney);
						$("#TL_ToMC_ID").val(data.memcardsId);
						$("#TL_ToMC_CardID").val(data.memcardsCardid);
					} else {
						alert("输入的会员卡号或手机号有误,请重新输入！");
						$("#MC_CardID1").text("");
						$("#MC_Name1").text("");
						$("#MC_Point1").text("");
						$("#MC_TotalMoney1").text("");
						$("#memcardsMoney1").text("");
						$("#TL_ToMC_CardID").val("");
					}
				});
			}
		</script>
	<form action="/mem/addTransfer" method="post" target="_parent">
		<fieldset>
			<legend>转出会员</legend>
			<input type="hidden" id="id1" value="${memcard.memcardsId}" />
			<table style="width: 99%">
				<tr>
					<td>卡号：<label id="MC_CardID">${memcard.memcardsCardid }</label></td>
					<td>姓名：<label id="MC_Name">${memcard.memcardsName }</label></td>
				</tr>
				<tr>
					<td>账号积分：<label id="MC_Point">${memcard.memcardsPoint == null?0:memcard.memcardsPoint }</label></td>
					<td>账号余额：<label id="memcardsMoney">${memcard.memcardsMoney == null?0:memcard.memcardsMoney }</label></td>
					<td>累计消费：￥<label id="MC_TotalMoney">${memcard.memcardsTotalmoney == null?0:memcard.memcardsTotalmoney }</label></td>
				</tr>
			</table>
		</fieldset>
		<table style="width: 99%">
			<tr>
				<td>点击获取当前输入会员信息</td>
				<td></td>
			</tr>
			<tr>
				<td><input id="MC_CardID2" type="text" placeholder="请输入会员卡号或手机号" /><input type="button" onclick="screch()" value="查找" /></td>
				<td></td>
			</tr>
		</table>
		<fieldset>
			<legend>装入会员</legend>
			<table style="width: 99%">
				<tr>
					<td>卡号：<label id="MC_CardID1"></label></td>
					<td>姓名：<label id="MC_Name1"></label></td>
				</tr>
				<tr>
					<td>账号积分：<label id="MC_Point1"></label></td>
					<td>账号余额：<label id="memcardsMoney1"></label></td>
					<td>累计消费：￥<label id="MC_TotalMoney1"></label></td>
				</tr>
			</table>
		</fieldset>
		<table>
			<tr>
				<td>转账金额：</td>
				<td><input class="text-box single-line" data-val="true"
					data-val-number="字段 TL_TransferMoney 必须是一个数字。" data-val-required="TL_TransferMoney 字段是必需的。"
					id="TL_TransferMoney" name="transferlogsTransfermoney" type="text" value="" /></td>
			</tr>
			<tr>
				<td>操作备注：</td>
				<td><input class="text-box single-line" id="TL_Remark" name="transferlogsRemark" type="text" value="" /></td>
			</tr>
			<tr>
				<td><input data-val="true"
					data-val-number="字段 TL_FromMC_ID 必须是一个数字。" data-val-required="TL_FromMC_ID 字段是必需的。" 
					id="TL_FromMC_ID" name="transferlogsFrommcId" type="hidden" value="" />
					<input id="TL_FromMC_CardID" name="transferlogFrommcCardid" type="hidden" value="${memcard.memcardsCardid }" />
					<input data-val="true" data-val-number="字段 TL_ToMC_ID 必须是一个数字。" data-val-required="TL_ToMC_ID 字段是必需的。"
					id="TL_ToMC_ID" name="transferlogsTomcId" type="hidden" value="" />
					<input id="TL_ToMC_CardID" name="transferlogsTomcCardid" type="hidden" value="" />
				</td>
				<td><input type="submit"  onclick="return aa()" value="转账" /></td>
			</tr>
		</table>
	</form>
</body>
</html>