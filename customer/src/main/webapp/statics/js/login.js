$(function() {

	$("#login").dialog({
		title: "登录后台",
		width: 300,
		height: 180,
		modal: true,
		iconCls: 'icon-lock',
		buttons: "#btn",
	});
	
	$("#username").validatebox({
		required : true,
		missingMessage : '请输入用户名',
		invalidMessage : '用户名不能为空',
	});
	$("#password").validatebox({
		required : true,
		missingMessage : '请输入密码',
		invalidMessage : '密码不能为空',
	});
	
	$("#btn a").click(function(){
		if(!$("#username").validatebox("isValid")){
			$("#username").focus();
			return false;
		}
		if(!$("#password").validatebox("isValid")){
			$("#password").focus();
			return false;
		}
		return  true;
		//window.location.href="user/login?usersLoginname="+$("#username").val()+"&usersPassword="+$("#password").val();
	});
})