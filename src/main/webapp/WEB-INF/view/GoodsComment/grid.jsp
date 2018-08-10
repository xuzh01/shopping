<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<jsp:include page="../common/head.jsp"></jsp:include>
<div id="controlBox" style="background-color:orange">
    <span style="color:white;">订单列表:</span>
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
<div id="cropGrow" style="overflow-y:hidden!important;"></div>
<script>
    var grid;
    var cId
    function intToDate(i){
        var d=new Date(i);
        return d.getFullYear()+"-"+(d.getMonth()+1)+"-"+d.getDate()+" "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
    }
    $(document).ready(function () {
        //配置表格
        grid = $('#grid').edatagrid({
            title: '商品评论清单',
            method: 'post',
            url: '<%=basePath%>GoodsComment/getData',
            saveUrl: '<%=basePath%>GoodsComment/insert',
            updateUrl: '<%=basePath%>GoodsComment/update',
            destroyUrl: '<%=basePath%>GoodsComment/delete',
            border: true,
            rownumbers: true,
            remoteSort: false,
            nowrap: true,
            singleSelect: true,
            fitColumns: true,
            striped: true,
            pagination: true,
            autoSave: true,
            idField: "scommId",
            columns: [[
                {
                    field: 'scommId', title: '评论id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodisId', title: '评论的商品ID', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'scommContent', title: '评论内容', width: 20, sortable: true, align: 'center', editor: {
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
                    field: 'scommMemberid', title: '会员id', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'scommMembername', title: '会员名称', width: 20, sortable: true, align: 'center', editor: {
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
                    field: 'scommTime', title: '评论时间', width: 20, sortable: true, align: 'center',
                    formatter: function (value, row) {
                        return intToDate(value);
                    }
                },
                {
                    field: 'createTime', title: '创建时间', width: 20, sortable: true, align: 'center',
                    formatter: function (value, row)
                    {
                        return intToDate(value);
                    }
                },
                {
                    field: 'updateTime', title: '更新时间', width: 20, sortable: true, align: 'center',
                    formatter: function (value, row)
                    {
                        return intToDate(value);
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
                console.log(row)
                $.messager.show({
                    title: "消息",
                    msg: row.msg
                });
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
                $.post('<%=basePath%>GoodsComment/delete', row, function (data) {
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

