<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js"></script>
		<script src="${pageContext.request.contextPath }/easyui/locale/easyui-lang-zh_CN.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/default/easyui.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/easyui/themes/icon.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/site.css" />
		<script src="${pageContext.request.contextPath }/js/main.js"></script>
</head>
<body  class="easyui-layout">
<div data-options="region:'north',border:false" style="height: 60px; background: #2E70CC;padding:10px;  color: #ffffff">
			<div style="float: left;"> <img alt="" src="${pageContext.request.contextPath }/img/logo.png" width="120px" height="40px" /></div>
			<div style="float: left; font-size: 14px; padding-left: 30px; padding-top: 15px;"> 会员消费积分管理平台&nbsp;&nbsp;&nbsp;&nbsp; 当前用户:${LOGIN.usersLoginname } </div>
			<div class="link" style="float: right;font-size: 14px; padding-right:100px; padding-top: 10px;background: #2E70CC;">
				<span id="date"></span>
				<a href="#" class="easyui-linkbutton CloseAll" data-options="plain:true,iconCls:'icon_Delete'">关闭全部</a>
				<a href="#" class="easyui-menubutton" data-options="menu:'#mm1',iconCls:'icon_Person2'">账号管理</a>
			</div>
			<div id="mm1" style="width: 150px;">
				<div data-options="iconCls:'icon_PersonEdit'">
					<a href="#" class="ExchangeMessage">修改个人资料</a>
				</div>
				<div class="menu-sep"> </div>
				<div data-options="iconCls:'icon_Edit'">
					<a href="#" class="ExchangePassword">修改密码</a>
				</div>
				<div class="menu-sep"> </div>
				<div data-options="iconCls:'icon-back'">
					<a href="${pageContext.request.contextPath }/user/logout">退出系统</a>
				</div>
			</div>
		</div>
		<div data-options="region:'west',split:true,title:'菜单导航'" style="width: 180px;">
			<div class="easyui-accordion" data-options="fit:true,border:false">
				<div title="系统管理" style="padding: 10px;">
					<ul class='ul-menu'>
						<li>
							<a url="${pageContext.request.contextPath }/user/toshop">店铺管理</a>
						</li>
						<li>
							<a url="${pageContext.request.contextPath }/card/tocard">会员等级管理</a>
						</li>
					</ul>
				</div>
				<div title="用户管理" style="padding: 10px;">
					<ul class='ul-menu'>
						<li>
							<a url="${pageContext.request.contextPath }/user/touser">用户列表</a>
						</li>
					</ul>
				</div>
				<div title="礼品管理" style="padding: 10px;">
					<ul class='ul-menu'>
						<li>
							<a url="${pageContext.request.contextPath }/gift/togift">礼品列表</a>
						</li>
					</ul>
				</div>
				<div title="会员管理" style="padding: 10px;">
					<ul class='ul-menu'>
						<li>
							<a url="${pageContext.request.contextPath }/mem/tomem">会员列表</a>
						</li>
					</ul>
				</div>
				<div title="会员消费" style="padding: 10px;">
					<ul class='ul-menu'>
						<li>
							<a url="${pageContext.request.contextPath }/con/toconsume">快速消费</a>
						</li>
						<li>
							<a url="${pageContext.request.contextPath }/con/tominus">会员减积分</a>
						</li>
						<li>
							<a url="${pageContext.request.contextPath }/con/tocon">消费历史记录</a>
						</li>
					</ul>
				</div>
				<div title="积分兑换" style="padding: 10px;">
					<ul class='ul-menu'>
						<li>
							<a url="${pageContext.request.contextPath }/gift/topointExchang">积分兑换礼品</a>
						</li>
						<li>
							<a url="${pageContext.request.contextPath }/con/topointMoney">积分返现</a>
						</li>
						<li>
							<a url="${pageContext.request.contextPath }/log/tologs">兑换历史记录</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div data-options="region:'center'" style="overflow: hidden;">
			<div id="ttTab" class="easyui-tabs tabs-container" data-options="tools:'#tab-tools',border:false,fit:true" style="overflow: hidden; width: 1738px; height: 492px;">
				
			</div>
		</div>
		<div data-options="region:'south',border:false" style="height: 40px; padding: 10px; background: #2E70CC; text-align: center; color: #ffffff"> 版权所有 @copy 2017 会员消费积分管理平台 </div>
		<div id="dlg" class="easyui-dialog" data-options="modal:true,closed:true"> <iframe id="frm" width="99%" height="98%" frameborder="0" scrolling="no"></iframe> </div>
</body>
</html>