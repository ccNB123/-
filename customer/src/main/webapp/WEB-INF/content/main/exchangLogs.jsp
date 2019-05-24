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
	        $(function () {
		                  $("#dg").datagrid({
			                                fitColumns: true,
			                                pagination: true, //pagination:如果为true，则在DataGrid控件底部显示分页工具栏。
			                                fit: true, //fit:当设置为true的时候面板大小将自适应父容器。
			                                singleSelect: true, //如果为true，则只允许选择一行。
			                                rownumbers: true, //如果为true，则显示一个行号列。
			                                url: "/log/select", //url:设置能够返回JSON数据的Action所对应的路径
			                                columns: [ [ {
				                                 field: 'exchanglogsId',
				                                 title: '兑换编号',
				                                 width: 50,
				                                 align: "center",
				                                 formatter: function (value, row) {
					                                        return row.exchanglogsId;
					                                                                 }
                                                             },
                                                 { field: 'memcardsCardid',
                                                   title: '会员卡号',
                                                   width: 150,
                                                   align: "center",
                                                   formatter: function (value, row) {
                                                              return row.memcardsCardid;
                                                                                   }
                                                    },
                                                 { field: 'memcardsName',
                                                   title: '会员姓名',
                                                   width: 150,
                                                   align: "center",
                                                   formatter: function (value, row) {
                                                              return row.memcardsName;
                                                                                   }
                                                    },
                                                 { field: 'exchanggiftsGiftname',
                                                   title: '礼品名称',
                                                   width: 150,
                                                   align: "center",
                                                   formatter: function (value, row) {
                                                              return row.exchanggiftsGiftname;
                                                                                   }                  
                                                    },                  
                                                 { field: 'exchanglogsPoint',
                                                   title: '所需积分',
                                                   width: 150,
                                                   align: "center",
                                                   formatter: function (value, row) {
                                                              return row.exchanglogsPoint;
                                                                                    }                  
                                                     },                  
                                                 { field: 'exchanglogsNumber',
                                                   title: '兑换数量',
                                                   width: 100,
                                                   align: "center",
                                                   formatter: function (value, row) {
                                                              return row.exchanglogsNumber;
                                                                                    }                  
                                                     },                  
                                                 { field: 'exchanglogsCreatetime',
                                                   title: '兑换时间',
                                                   width: 150,
                                                   align: "center",
                                                   formatter: function (value, row) {
                                                	var date = new Date();
                   									date.setTime(row.exchanglogsCreatetime);
                   									return date.getFullYear()+"年"+(date.getMonth()+1)+"月"+date.getDate()+"日";
                                                                                    }                  
                                                     }              
                                          ]]          
                          });

		                  $("#dg").load();
                              $(".Search").click(function () {
                                        $('#dg').datagrid('load', {
                                        	memcardsCardid: $('#txtMC_CardIDMC_Mobile').val()
                                                              });
                                                  });
                                    });
              </script>
	<fieldset>
		<legend>查询</legend>
		<div>
			会员电话/卡号：<input id="txtMC_CardIDMC_Mobile" type="text" />
			 <a href="#" class="easyui-linkbutton Search" iconCls="icon-search">查询</a>
		</div>
	</fieldset>
	<fieldset title="消费记录列表" style="height: 420px;">
		<legend>兑换记录列表</legend>
		<table id="dg">
		</table>
	</fieldset>
	<div id="dlg" class="easyui-dialog"
		data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true">
		<iframe id="frm1" width="99%" height="99%" frameborder="0"></iframe>
	</div>
</body>
</html>