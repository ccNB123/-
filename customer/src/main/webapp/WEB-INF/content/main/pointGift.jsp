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
	      /* function aa() {
		                  } */
	      function screch() {
		      $.getJSON("/mem/screch",{
		    	  memcardsReferercard : $("#MC_CardID2").val()
			      }, function(data) {
				      if(data != null && data.memcardsId != -1){
					      
					      if(data.memcardsState == 130){
					    	  $("#MC_Name1").text(data.memcardsName);
				              $("#MC_CardID1").text(data.cardlevels.cardlevelsLevelname);
				              $("#MC_Point1").text(data.memcardsPoint == null?0:data.memcardsPoint);
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
          
                $(function(){
                  var lastIndex = 0;
                  $("#dg").datagrid(
                   {
                    fitColumns: true,
                    pagination: true, //pagination:如果为true，则在DataGrid控件底部显示分页工具栏。
                    fit: true, //fit:当设置为true的时候面板大小将自适应父容器。。
                    rownumbers: true, //如果为true，则显示一个行号列。
                    
                    onDblClickCell : function(rowIndex, field, value){
                        var selectedRow = $(this).datagrid('getSelected');
                        $("#dg").datagrid('endEdit',lastIndex);
                        $("#dg").datagrid('beginEdit',rowIndex);

                        lastIndex = rowIndex;
                        },
                    url: "/gift/select", //url:设置能够返回JSON数据的Action所对应的路径
                    
                    columns: [ [ {
                            field : 'ck',
                            checkbox : true
                            }, {
                        	field: 'exchanglogsNumber',
    						title: '兑换数量',
    						editor: 'numberbox',
    						width: 150,
    						align: "center"
    					}, {
                    	field: 'exchanggiftsId',
						title: '礼品编号',
						width: 150,
						align: "center",
						formatter: function(value, row) {
							return row.exchanggiftsId;
						}
					}, {
						field: 'exchanggiftsGiftcode',
						title: '礼品代号',
						width: 150,
						align: "center",
						formatter: function(value, row) {
							return row.exchanggiftsGiftcode;
						}
					}, {
						field: 'exchanggiftsGiftname',
						title: '礼品名称',
						width: 150,
						align: "center",
						formatter: function(value, row) {
								return row.exchanggiftsGiftname;
						}
					}, {
						field: 'exchanggiftsPoint',
						title: '所需积分',
						width: 150,
						align: "center",
						formatter: function(value, row) {
							return row.exchanggiftsPoint;
						}
					}, {
						field: 'exchanggiftsInteger',
						title: '礼品数量',
						width: 150,
						align: "center",
						formatter: function(value, row) {
							return row.exchanggiftsInteger;
						}
					}, {
						field: 'exchanggiftsExchangnum',
						title: '已兑换数量',
						width: 150,
						align: "center",
						formatter: function(value, row) {
							return row.exchanggiftsExchangnum;
						}
					}, {
						field: 'exchanggiftsRemark',
						title: '备注',
						width: 150,
						align: "center",
						formatter: function(value, row) {
							return row.exchanggiftsRemark;
						}
					} ] ]          
                  });

                $("#submit").click(function () {
                    //判断是否选中行
                    var row = $("#dg").datagrid("getSelected");
                    if(row == null){
                        $.messager.alert("提示","请选择礼品",warning);
                        return;
                        }
                    //关闭最后编辑的单元格
                    $("#dg").datagrid('endEdit',lastIndex);
                    //定义总积分,用来计算共需要的积分数
                    var Point = 0;

                    //检查会员是否已经查找
                    if($("#MC_Name1").text() == ""){
                        $.messager.alert("提示", "请先查找减积分的会员!", "warning"); 
                        return ;
                        }
                    //获取到所有的行
                    var rows = $("#dg").datagrid("getSelections");

                    //以每一行进行循环
                    for(var i = 0; i < rows.length; i++){
                        //判断当前行的礼品数量是否填写
                        if(rows[i].exchanglogsNumber == null || rows[i].exchanglogsNumber == ""){
                        	$.messager.alert("提示", "请输入兑换礼品数量", "warning");
                        	return ;
                            }
                        
                        //计算该礼品所需要的积分,并累加
                        Point = Point + (rows[i].exchanglogsNumber * rows[i].exchanggiftsPoint);
                        }
                    //判断是否有兑换
                    if(Point > 0){
                        //判断需要兑换的积分是否小于当前用户的积分
                        if(Point <= $("#MC_Point1").text()){
                            $.ajax({
                                cache : false,
                                type : "POST",
                                url : '${pageContext.request.contextPath}/log/addExchang',
                                data : {
                                    rows : JSON.stringify(rows),
                                    memcardsId : $("#MC_ID").val(),
                                    memcardsName : $("#MC_Name1").text(),
                                    memcardsCardid : $("#MC_CardID").val(),
                                    memcardsPoint : $("#MC_Point1").text()
                                },
                                success : function(data){
                                    $("#dg").datagrid('reload');
                                    $("MC_Point1").text($("#MC_Point1").text()-Point);
                                    $.messager.show({
                                        title : "提示",
                                        msg : "兑换成功",
                                        showType : 'fade',
                                        style : {
                                            right : '',
                                            bottom : ''
                                            }
                                        });
                                    }
                                })
                            }else{
                                $.messager.alert("提示","积分不足!","warning");
                                }
                        }
                });//end submit
                }); 
</script>
	<form action="/ExchangLog/Exchanggift" method="post">
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
					<td>等级：<font style="color: Blue"><label id="MC_CardID1"></label></font></td>
				</tr>
				<tr>
					<td>当前积分：
					<font style="color: Blue">
					<labe id="MC_Point1"></label>
					</font>
					</td>
					<td>累计消费：￥<font style="color: Blue">
					<label id="MC_TotalMoney1"></label>
					</font>
					</td>
				</tr>
			</table>
		</fieldset>
		<table id="dg">
		</table>
		<div style="color: red;">
			<p>双击“兑换数量”的单元格可以修改兑换的数量。</p>
			<p>如果还未设置礼品请点击[礼品管理]</p>
		</div>
		<input type="hidden" id="MC_ID" />
		<input type="hidden" id="MC_CardID" />
		<input type="button" id="submit" value="马上兑换" />
	</form>
</body>
</html>