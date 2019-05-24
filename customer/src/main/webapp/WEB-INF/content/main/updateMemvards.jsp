<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="${pageContext.request.contextPath }/css/site.css" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/default/easyui.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/icon.css" />
	<script src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js"></script>
	<script src="${pageContext.request.contextPath }/easyui/locale/easyui-lang-zh_CN.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/site.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/calendar/WdatePicker.js"></script>
</head>
<body>
	<script type="text/javascript">
		function aa() {
			var a = $("#memcardsCardid").val().length;
			if ($("#memcardsCardid").val() == "") {
				$.messager.alert("提示", "请输入六位卡号", "warning");
				return false;
			}
			if ($("#memcardsMobile").val() == "") {
				$.messager.alert("提示", "请输入手机号", "warning");
				return false;
			}
			if ($("#memcardsPassword1").val() == "") {
				$.messager.alert("提示", "请输入卡片密码", "warning");
				return false;
			}
			if ($("#memcardsPassword").val() == "") {
				$.messager.alert("提示", "请输入确认密码", "warning");
				return false;
			}
			return true;
		}
		$(function() {
			$("#sum").click(function() {
				if (aa()) {
					var str = $("#memcardsPassword1").val();
					var str1 = $("#memcardsPassword").val();
					if (str != str1) {
						alert("两次输入不一致");
						return false;
					} else {
						$("form").submit();
					}
				}
			});
		});
		function screch() {
			$.getJSON("/mem/screch", {
				memcardsReferercard : $("#memcardsReferercard").val()
			}, function(data) {
				if (data.memcardsId != -1) {
					$("#memcardsReferername").val(data.memcardsName);
					$("#memcardsId").val(data.memcardsId);
					$("#shopId").val(data.shopId);
					//$("#memcardsReferercard").val(data.memcardsReferercard);
				} else {
					alert("输入的会员卡号或电话有误,请重新输入！");
					$("#memcardsReferername").val("");
					$("#memcardsId").val("");
					$("#shopId").val("");
					$("#memcardsReferercard").val("");
				}
			});
		}
	</script>
	<form action="/mem/update" method="post" target="_parent">
		<fieldset title="会员基本信息">
			<table align="center">
				<tr>
					<td>会员卡号：</td>
					<td><input class="text-box single-line" id="memcardsCardid" name="memcardsCardid" type="text" value="${memcard.memcardsCardid }" /></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>会员姓名：</td>
					<td><input class="text-box single-line" id=memcardsName name="memcardsName" type="text" value="${memcard.memcardsName }" /></td>
					<td>手机号码：</td>
					<td><input class="text-box single-line" id="memcardsMobile" name="memcardsMobile" type="text" value="${memcard.memcardsMobile }" /></td>
				</tr>
				<tr>
					<td>卡片密码：</td>
					<td><input type="password" id="memcardsPassword1" /></td>
					<td>确认密码：</td>
					<td><input id="memcardsPassword" name="memcardsPassword" type="password" /></td>
				</tr>
				<tr>
					<td>会员性别：</td>
					<td>
					<select id="memcardsSex" name="memcardsSex">
					<option value="0" <c:if test="${memcard.memcardsSex.equals('0') }">selected</c:if>>男</option>
					<option value="1" <c:if test="${memcard.memcardsSex.equals('1') }">selected</c:if>>女</option>
					</select>
					</td>
					<td>会员等级：</td>
					<td>
					<select id="cardlevelsId" name="cardlevelsId">
						<option value="">--请选择--</option>
						<c:forEach items="${cardlevels }" var="car">
							<option value="${car.cardlevelsId }"
							<c:if test="${car.cardlevelsId eq memcard.cardlevelsId }">selected</c:if>
							>${car.cardlevelsLevelname }</option>
						</c:forEach>
					</select>
					</td>
				</tr>
				<tr>
					<td>会员生日：</td>
					<td><input checked="True" data-val="true"
						data-val-number="字段 memcardsBirthdaytype 必须是一个数字。"
						data-val-required="memcardsBirthdaytype 字段是必需的。"
						id="memcardsBirthdaytype" name="memcardsBirthdaytype" type="radio" value="0"  <c:if test="${memcard.memcardsBirthdaytype == 0 }">checked</c:if>/> 公历 
						<input id="memcardsBirthdaytype1" name="memcardsBirthdaytype" type="radio" value="1" <c:if test="${memcard.memcardsBirthdaytype == 1 }">checked</c:if> /> 农历</td>
					<td><input class="text-box single-line" data-val="true"
						data-val-number="字段 memcardsBirthdayMonth 必须是一个数字。"
						data-val-required="memcardsBirthdayMonth 字段是必需的。"
						id="memcardsBirthdayMonth" name="memcardsBirthdayMonth" type="number" value="${memcard.memcardsBirthdayMonth }" /> 月</td>
					<td><input class="text-box single-line" data-val="true"
						data-val-number="字段 memcardsBirthdayDay 必须是一个数字。"
						data-val-required="memcardsBirthdayDay 字段是必需的。" id="memcardsBirthdayDay" name="memcardsBirthdayDay" type="number" value="${memcard.memcardsBirthdayDay }" /> 日</td>
				</tr>
				<tr>
					<td><input checked="checked" data-val="true"
						data-val-required="memcardsIspast 字段是必需的。"
						id="memcardsIspast" name="memcardsIspast" type="checkbox" value="" />
						<input name="memcardsIspast" type="hidden" value="" />
					</td>
					<td>设置卡片过期时间（到期则此卡自动失效）</td>
					<td>  
					<input class="Wdate text-box single-line" data-val="true"
						data-val-date="字段 MC_PastTime 必须是日期。"
						data-val-required="MC_PastTime 字段是必需的。" id="memcardsPasttime"
						name="memcardsPasttime" type="datetime" value="<fmt:formatDate value="${memcard.memcardsPasttime }" pattern="yyyy-MM-dd"/>" readonly="readonly" onclick="WdatePicker();"/>
					</td>
					<td></td>
				</tr>
				<tr>
					<td>卡片状态：</td>
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
					<td>卡片付费：</td>
					<td><input class="text-box single-line" data-val="true"
						data-val-number="字段 memcardsMoney 必须是一个数字。"
						data-val-required="memcardsMoney 字段是必需的。" id="memcardsMoney" name="memcardsMoney" type="text" value="${memcard.memcardsMoney }" />
					</td>
				</tr>
				<tr>
					<td colspan="2"><hr /></td>
				</tr>
				<tr>
					<td>积分数量：</td>
					<td><input class="text-box single-line" id="memcardsPoint" name="memcardsPoint" type="text" value="${memcard.memcardsPoint }" /></td>
					<td><input checked="checked" data-val="true"
						data-val-required="memcardsIspointauto 字段是必需的。"
						id="memcardsIspointauto" name="memcardsIspointauto" type="checkbox" value="" />
						<input name="memcardsIspointauto" type="hidden" value="" /></td>
					<td>积分是否可以自动转换成等级？</td>
				</tr>
				<tr>
					<td>推荐人：</td>
					<td><input class="text-box single-line" data-val="true"
						data-val-number="字段 memcardsReferercard 必须是一个数字。"
						data-val-required="memcardsReferercard 字段是必需的。"
						id="memcardsReferercard" name="memcardsReferercard" type="text" value="${memcard.memcardsReferercard }" />
						<input type="button" onclick="screch()" value="查找" /></td>
					<td>推荐人姓名：</td>
					<td><input class="text-box single-line" id="memcardsReferername" name="memcardsReferername" type="text" value="${memcard.memcardsReferername }" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input data-val="true" data-val-number="字段 memcardsId 必须是一个数字。" data-val-required="memcardsId 字段是必需的。"
						id="memcardsId" name="memcardsId" type="hidden" value="${memcard.memcardsId }" />
						<input data-val="true" data-val-number="字段 shopId 必须是一个数字。" data-val-required="shopId 字段是必需的。"
						id="shopId" name="shopId" type="hidden" value="" />
						<!-- <input data-val="true" data-val-date="字段 memcardsCreatetime 必须是日期。" data-val-required="memcardsCreatetime 字段是必需的。"
						id="memcardsCreatetime" name="memcardsCreatetime" type="hidden" value="" /> -->
						<!-- <input id="memcardsPasttime" name="memcardsPasttime" type="hidden" value="" /> -->
						<input type="button" id="sum" value="修改" />
					</td>
					<td></td>
					<td></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>