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
    <span style="color:white;">商品类别:</span>
    <input id="genderSearch" type="text"/>

    <a href="javascript:void(0)" class="easyui-linkbutton c1" iconCls="icon-search" onclick="doSearch()">查询</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c2" iconCls="icon-add"
       onclick="javascript:grid.edatagrid('addRow');">添加</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c4" iconCls="icon-edit"
       onclick="javascript:grid.edatagrid('editRow');">编辑</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c3" iconCls="icon-remove"
       onclick="javascript:grid.edatagrid('cancelRow')">取消</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c5" iconCls="icon-cancel"
       onclick="javascript:grid.edatagrid('deleteRow');">删除</a>
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
            title: '商品类型清单',
            height: 600,
            method: 'post',
            url: '<%=basePath%>GoodsCategory/getData',
            saveUrl: '<%=basePath%>GoodsCategory/save',
            updateUrl: '<%=basePath%>GoodsCategory/update',
            destroyUrl: '<%=basePath%>GoodsCategory/delete',
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
                    field: 'catId', title: 'ID', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'catName', title: '分类名称', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'sort', title: '排序', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'description', title: '描述', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'isOffline', title: '类名是否禁用', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'createdTime', title: '创建时间', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'updatedTime', title: '更新时间', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
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
            }
        });
    });


</script>
</body>
</html>

