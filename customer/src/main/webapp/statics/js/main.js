$(function() {
	//在前台自动显示菜单的信息根据用户的信息
	//BindMenuDataGroupType();
	//绑定菜单单击事件
	BindMenuClickHrefEvent();
	//读取动态时间的变化
	ReadDateTimeShow();
	//这里实现对时间动态的变化
	//var setTimeInterval = setInterval(ReadDateTimeShow, 1000);
	//实现Tab布局
	//$("#ttTab").tabs({});

	$(".CloseAll").click(function() {
		$("#ttTab li").each(function(index, obj) {
			//获取所有可关闭的选项卡
			var tab = $(".tabs-closable", this).text();
			$(".easyui-tabs").tabs('close', tab);
		});
	});
	
	$(".ExchangePassword").click(function() {
		$("#dlg").dialog({ width: 400, height: 400 }).dialog("setTitle", "修改密码").dialog("open");
		$("#frm").attr("src", "/user/toupdatepwd");
	});
	$(".ExchangeMessage").click(function() {
		$("#dlg").dialog({ width: 400, height: 400 }).dialog("setTitle", "修改个人资料").dialog("open");
		$("#frm").attr("src", "/user/touname");
	});
	
	var b_c, c;
	$(".ul-menu li").hover(
		function() {
			b_c = $(this).css("background-color");
			$(this).css("background-color", "#34AFFF");
			c = $(this).css("color");
			$(this).css("color", "#ffffff");
			$(this).css("cursor", "pointer");
		},
		function() {
			$(this).css("background-color", b_c);
			$(this).css("color", c);
		}
	);
});
/*//绑定前台菜单栏
function BindMenuDataGroupType() {
	//根据异步读取发送过来的Json字符串
	$.getJSON("/Home/LoadMenuData", {}, function(data) {
		//实现在菜单拦中的显示,遍历节点集合
		for(var i = 0; i < data.length; i++) {
			var groupInfo = data[i]; //拿到组的信息

			//拿到内容的信息,每个菜单项构造成一个p标签
			var strMenuItemHTMl = "";
			for(var j = 0; j < groupInfo.MenuItems.length; j++) {
				var menuItem = groupInfo.MenuItems[j];
				strMenuItemHTMl += '<p><a href="javascript:void(0)" src="' + menuItem.Url + '" class="menuLink">' + menuItem.MenuName + '</a></p>';
			}
			//EasyUI新增节点
			$("#aa").accordion('add', {
				title: groupInfo.GroupName,
				content: strMenuItemHTMl,
				selected: false
			});
			//$("#aa").accordion('select', groupInfo.GroupName);
		}
		//绑定用户单击跳转事件
		BindMenuClickHrefEvent();
	});
}*/
//实现用户单击导航栏跳转页面的方法
function BindMenuClickHrefEvent() {
	$(".ul-menu li a").click(function() {
		//获取按钮里面的Src属性
		var src = $(this).attr("url");
		//将主框架的iframe跳转到菜单指向的地址，$("#frmWorkArea").attr("src", src);
		//Tab页面新增页面标签，每当单击左边的导航栏的时候跳转
		var titleShow = $(this).text();
		var strHtml = '<iframe id="frmWorkArea" width="100%" height="99%" frameborder="0" scrolling="no" src="' + src + '"></iframe>';
		//判断Tab标签中是否有相同的数据标签
		var isExist = $("#ttTab").tabs('exists', titleShow);
		if(!isExist) {
			$("#ttTab").tabs('add', {
				title: titleShow,
				content: strHtml,
				iconCls: 'icon-ok',
				closable: true
			});
		} else {
			$('#ttTab').tabs('select', titleShow);
		}
	});
}
//读取动态时间的变化
function ReadDateTimeShow() {
	var year = new Date().getFullYear();
	var Month = new Date().getMonth() + 1;
	var Day = new Date().getDate();
	var Time = new Date().toLocaleTimeString();
	var AddDate = year + "年" + Month + "月" + Day + "日 " + Time;
	$("#date").text(AddDate);
	setTimeout(ReadDateTimeShow,1000);
}