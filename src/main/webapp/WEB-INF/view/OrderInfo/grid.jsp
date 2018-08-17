<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<jsp:include page="../common/head.jsp"></jsp:include>

<div id="controlBox" style="background-color:orange">
    <span style="color:white;">商品信息:</span>
    <input id="genderSearch" type="text" placeholder="名称，类名状态（未写）"/>

    <a href="javascript:void(0)" class="easyui-linkbutton c1" iconCls="icon-search" onclick="doSearch()">查询</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c2" iconCls="icon-add"
       onclick="javascript:grid.edatagrid('addRow');">添加</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c4" iconCls="icon-edit"
       onclick="javascript:grid.edatagrid('editRow');">编辑</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c3" iconCls="icon-remove"
       onclick="javascript:grid.edatagrid('cancelRow')">取消</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c5" iconCls="icon-cancel"
       onclick="javascript:deleteRecord();">删除</a>
</div>
<div id="formContainer" class="easyui-dialog" style="width:800px;height:420px;padding:10px 10px" closed="true"
     buttons="#formContainerButtons">
    <form id="formEditor">
    </form>
</div>
<div id="formContainerButtons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveRecord()">确定</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel"
       onclick="javascript:$('#formContainer').dialog('close')">取消</a>
</div>
<table id="grid"></table>
<div id="msgBox"></div>
<div id="window" class="easyui-window" title="订单详情" style="width: 800px; height: 500px;" data-options="resizable:false,closed:true,modal:true">
    <iframe id="OrderInfoGoods" src="<%=basePath%>OrderInfoGoods/grid"
            width="100%" height="99%" frameborder="0" scrolling="no"></iframe>
</div>
<div id="cropGrow" style="overflow-y:hidden!important;"></div>

<script>

    function show(i) {
        $('#OrderInfoGoods').attr('src',"<%=basePath%>OrderInfoGoods/grid?orderid="+i);
        $('#window').window('open');
    }

    var grid;
    var cId;
    $(document).ready(function () {
        //配置表格
        grid = $('#grid').edatagrid({
            title: '订单清单',
            method: 'post',
            url: '<%=basePath%>OrderInfo/getData',
            saveUrl: '<%=basePath%>OrderInfo/insert',
            updateUrl: '<%=basePath%>OrderInfo/update',
            destroyUrl: '<%=basePath%>OrderInfo/delete',
            border: true,
            rownumbers: true,
            cache: false,
            remoteSort: false,
            nowrap: true,
            singleSelect: true,
            fitColumns: true,
            striped: true,
            pagination: true,
            autoSave: true,
            idField: "orderId",
            columns: [[
                {
                    field: 'orderId', title: '订单索引id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'orderSn', title: '订单编号', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    },
                    formatter: function (value, row) {
                        return '<span title=' + value + '>' + value + '</span>';
                    }
                },
                {
                    field: 'buyerId', title: '买家id', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    },
                    formatter: function (value, row) {
                        return '<span title=' + value + '>' + value + '</span>';
                    }
                },
                {
                    field: 'buyerName', title: '买家姓名', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'buyerTel', title: '买家的联系电话', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true,
                        }
                    },
                    formatter: function (value, row) {
                        return '<span title=' + value + '>' + value + '</span>';
                    }
                },
                {
                    field: 'addTime', title: '订单生成时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'paymentCode', title: '支付方式名称代码', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'paymentTime', title: '付款时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'finnshedTime', title: '订单完成时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'orderAmount', title: '订单总价格', width: 20, sortable: true, align: 'center'
                },{
                    field: 'orderState', title: '订单状态', width: 20, sortable: true, align: 'center',editor: {
                        type:'combobox',
                        options: {
                            required: true,
                            data: [{key: 0, value: '已取消'}, {key: 10, value: '未付款'},{key: 20, value: '已付款'},{key: 30, value: '已发货'},{key: 40, value: '已收货'}],
                            valueField: 'key',
                            textField: 'value',
                            panelHeight: 'auto'
                        }},
                    formatter: function (value, row) {
                        if (value === 0) return "已取消";
                        else if(value==10) return "未付款";
                        else if(value==20) return "已付款";
                        else if (value==30) return "已发货";
                        else if (value==40) return "已收货";
                        else return "未知";
                    }
                },{
                    field: 'createdTime', title: '创建时间', width: 20, sortable: true, align: 'center'
                },{
                    field: 'updatedTime', title: '修改时间', width: 20, sortable: true, align: 'center'
                },{
                    field: '操作', title: '操作', width: 20, sortable: true, align: 'center',
                    formatter:function (value,row) {
                        return "<a href='javascript:void(0)' style='background-color:white;border-radius:5px;'  class='easyui-linkbutton' onclick='javascript:show("+row.orderSn+")'>查看详情</a>";
                    }
                }
            ]],
            destroyMsg: {
                norecord: {
                    title: '警告',
                    msg: '首先需要选中记录，然后在点击删除按钮'
                },
                confirm: {
                    title: '确认',
                    msg: '是否删除选中记录?'
                }
            },
            onSuccess: function (index, row) {
                $.messager.show({
                    title: "消息",
                    msg: row.msg
                });
                grid.edatagrid("load",{ });
            }
        });
    });



    function doSearch() {
        grid.datagrid("load", {
            text: $("#genderSearch").val()
        })
    };

    function deleteRecord() {
        var row = grid.edatagrid('getSelected');
        $.messager.confirm('删除', '确认删除该记录?', function (r) {
            if (r) {
                $.post('<%=basePath%>OrderInfo/delete', row, function (data) {
                    $.messager.show({
                        title: "消息",
                        msg: data.msg
                    });
                    grid.edatagrid('reload');
                });
            }
        });
    };
</script>
<jsp:include page="../common/bottom.jsp"></jsp:include>

