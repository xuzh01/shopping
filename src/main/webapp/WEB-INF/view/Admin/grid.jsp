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
<jsp:include page="../common/head.jsp"></jsp:include>
<style>
</style>
<div id="controlBox" style="background-color:orange">
    <span style="color:white;">管理员管理:</span>
    <input id="genderSearch" type="text" placeholder="名称"/>

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
<table id="grid"></table>
<div id="msgBox"></div>
<div id="cropGrow" style="overflow-y:hidden!important;"></div>
<script>
    var grid;
    var cId;
    $(document).ready(function () {
        //配置表格
        grid = $('#grid').edatagrid({
            title: '管理员信息表',
            method: 'post',
            url: '<%=basePath%>Admin/getData',
            saveUrl: '<%=basePath%>Admin/insert',
            updateUrl: '<%=basePath%>Admin/update',
            destroyUrl: '<%=basePath%>Admin/delete',
            border: true,
            rownumbers: true,
            remoteSort: false,
            nowrap: true,
            singleSelect: true,
            fitColumns: true,
            striped: true,
            pagination: true,
            autoSave: true,
            idField: "adminId",
            columns: [[
                {
                    field: 'adminId', title: '管理员ID', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'adminName', title: '管理员名称', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }

                    }
                },
                {
                    field: 'adminPassword', title: '管理员密码', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    },
                    formatter: function (value, row) {
                        return '密码不予显示';
                    }
                },
                {
                    field: 'adminLoginNum', title: '登录次数', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'adminIsSuper', title: '是否超级管理员', width: 20, sortable: true, align: 'center', editor: {
                        type: 'combobox',
                        options: {
                            required: true,
                            data: [{key: 1, value: '超级管理员'}, {key: 0, value: '普通管理员'}],
                            valueField: 'key',
                            textField: 'value',
                            panelHeight: 'auto'
                        }
                    },
                    formatter: function (value, row) {
                        if (value === 1) return "超级管理员"
                        else return "普通管理员";
                    }
                },
                {
                    field: 'isDisable', title: '是否禁用', width: 20, sortable: true, align: 'center', editor: {
                        type: 'combobox',
                        options: {
                            required: true,
                            data: [{key: 1, value: '禁用'}, {key: 0, value: '正常'}],
                            valueField: 'key',
                            textField: 'value',
                            panelHeight: 'auto'
                        }
                    },
                    formatter: function (value, row) {
                        if (value === 1) return "禁用"
                        else return "正常";
                    }
                },
                {
                    field: 'adminLoginTime', title: '登录时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'createdTime', title: '创建时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'updatedTime', title: '修改时间', width: 20, sortable: true, align: 'center'
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
                $.post('<%=basePath%>Admin/delete', row, function (data) {
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

