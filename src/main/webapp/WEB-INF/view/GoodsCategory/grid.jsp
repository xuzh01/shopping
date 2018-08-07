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

    <a href="javascript:void(0)" class="easyui-linkbutton c2" iconCls="icon-add" onclick="javascript:newRecord()">添加</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c4" iconCls="icon-edit"
       onclick="javascript:editRecord()">编辑</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c3" iconCls="icon-remove"
       onclick="javascript:grid.edatagrid('cancelRow')">取消</a>

    <a href="javascript:void(0)" class="easyui-linkbutton c5" iconCls="icon-cancel" onclick="javascript:deleteRecord()">删除</a>
</div>
<div id="formContainer" class="easyui-dialog" style="width:800px;height:420px;padding:10px 10px" closed="true"
     buttons="#formContainerButtons">
    <form id="formEditor">
        <table>
            <tr>
                <td>ID:</td>
                <td><input name='id' value='0' class="easyui-numberbox"
                           required="required"/></td>
                <td>种子ID:</td>
                <td><input name='cId' type="number"
                           required="required"/></td>
            </tr>
            <tr>
                <td><label>种子名称</label></td>
                <td><input name='caption' class="easyui-textbox"
                           required="required"/></td>
                <td>X季作物:</td>
                <td><input name='harvestNum' class="easyui-numberbox"
                           required="required"/></td>
            </tr>
            <tr>
                <td>种子等级:</td>
                <td><input name='cropLevel' class="easyui-numberbox"
                           required="required"/></td>
                <td>种子类型:</td>
                <td><input name='type' class="easyui-combobox"
                           panelHeight="auto"
                           data-options=" editable:false,
						        valueField:'code',
						        textField:'caption',
						        url:'<%=basePath%>codeSeedType/data'"
                           required="required"/></td>
            </tr>
            <tr>
                <td>可获经验:</td>
                <td><input name='exp' class="easyui-numberbox"
                           required="required"/></td>
                <td>每季成熟所需时间:</td>
                <td><input name='matureTime' class="easyui-numberbox"
                           required="required"/></td>
            </tr>
            <tr>
                <td>每季成熟可获收:</td>
                <td><input name='output' class="easyui-numberbox"
                           required="required"/></td>
                <td>种子采购价:</td>
                <td><input name='price' class="easyui-numberbox"
                           required="required"/></td>
            </tr>
            <tr>
                <td>每个收获的果实:</td>
                <td><input name='price4UnitSale' class="easyui-numberbox"
                           required="required"/></td>
                <td>土地需求:</td>
                <td><input name='landRequirement' class="easyui-combobox"
                           panelHeight="auto"
                           data-options=" editable:false,
						        valueField:'code',
						        textField:'caption',
						        url:'<%=basePath%>codeLandRequire/data'"
                           class="easyui-textbox" required="required"/></td>
                </td>
            </tr>
            <tr>
                <td>每季成熟可获积分:</td>
                <td><input name='score' class="easyui-numberbox"
                           required="required"/></td>
                <td>提示信息:</td>
                <td><input name='tip' class="easyui-textbox"
                           required="required"/></td>
            </tr>
        </table>
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
            title: '种子清单',
            height: 600,
            method: 'post',
            url: '<%=basePath%>GoodsCategory/getData',
            saveUrl: '<%=basePath%>seed/save',
            updateUrl: '<%=basePath%>seed/save',
            destroyUrl: '<%=basePath%>seed/delete',
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
                {field: 'cat_id', title: 'ID', width: 20, sortable: true, align: 'center'},
                {field: 'cat_name', title: '分类名称', width: 20, sortable: true, align: 'center'},
                {field: 'sort', title: '排序', width: 20, sortable: true, align: 'center'},
                {field: 'description', title: '描述', width: 20, sortable: true, align: 'center'},
                {field: 'is_offline', title: '类名是否禁用', width: 20, sortable: true, align: 'center'},
                {field: 'created_time', title: '创建时间', width: 20, sortable: true, align: 'center'},
                {field: 'updated_time', title: '更新时间', width: 20, sortable: true, align: 'center'},
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
            onSelect: function (rowIndex, rowData) {
                cId = rowData.cId;
            },
            onSuccess: function (index, row) {
                $.messager.show({
                    title: "消息",
                    msg: row.msg
                });
            },
            onDblClickRow: function (rowIndex, rowData) {
                grid.datagrid("endEdit", rowIndex);
            }
        });
        grid.datagrid("getPager").pagination({
            pageSize: 5,
            pageList: [5, 10, 15, 20]
        });
        grid.datagrid("resize", {
            height: ($(window).height() - 36)
        });

    });


</script>
</body>
</html>

