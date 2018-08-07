<%--
  Created by IntelliJ IDEA.
  User: cgg
  Date: 2018/8/6
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>ext/easyui/themes/metro-orange/easyui.css?t=34355">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>ext/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>ext/easyui/themes/color.css">
    <script type="text/javascript" src="<%=basePath%>ext/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>ext/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>ext/easyui/plugins/jquery.edatagrid.js"></script>
    <script type="text/javascript" src="<%=basePath%>ext/easyui/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
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
<div id="cropGrow" style="overflow-y:hidden!important;"></div>
<script>
    var grid;
    var cId;
    $(document).ready(function () {
        //配置表格
        grid = $('#grid').edatagrid({
            title: '商品信息清单',
            height: 600,
            method: 'post',
            url: '<%=basePath%>GoodsInfo/getData',
            saveUrl: '<%=basePath%>GoodsInfo/insert',
            updateUrl: '<%=basePath%>GoodsInfo/update',
            destroyUrl: '<%=basePath%>GoodsInfo/delete',
            border: false,
            rownumbers: true,
            remoteSort: true,
            nowrap: false,
            singleSelect: true,
            fitColumns: true,
            striped: true,
            pagination: false,
            autoSave: true,
            idField: "ID",
            columns: [[
                {
                    field: 'goodsId', title: '商品索引id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsName', title: '商品名称', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsSubtitle', title: '商品副标题', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'gcId', title: '商品分类id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'gcName', title: '商品分类名称', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsPrice', title: '商品原价', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsSellPrice', title: '商品现价', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsImage', title: '商品默认封面图片', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsClick', title: '商品浏览数', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsState', title: '商品状态', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsCommend', title: '商品推荐', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsCloseReason', title: '商品违规下架原因', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'commentNum', title: '评论次数', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'thumbsUpNum', title: '商品点赞量', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'salenumNum', title: '售出数量', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsCollectNum', title: '商品收藏数量', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'isDel', title: '是否删除', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'memberId', title: '上传者', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'stock', title: '商品库存', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'updateTime', title: '商品修改时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'createTime', title: '商品上传时间', width: 20, sortable: true, align: 'center'
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
                $.post('<%=basePath%>GoodsCategory/delete', row, function (data) {
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
</body>
</html>

