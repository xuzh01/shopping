
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
    <span style="color:white;">日志信息:</span>
    <input id="genderSearch" type="text" placeholder="名称"/>

    <a href="javascript:void(0)" class="easyui-linkbutton c1" iconCls="icon-search" onclick="doSearch()">查询</a>
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
            title: '日志详情',
            method: 'post',
            url: '<%=basePath%>Log/getData',
            border: true,
            rownumbers: true,
            remoteSort: false,
            nowrap: true,
            singleSelect: true,
            fitColumns: true,
            striped: true,
            pagination: true,
            autoSave: true,
            idField: "id",
            columns: [[
                {
                    field: 'id', title: 'id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'adminId', title: '管理员id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'adminName', title: '管理员名字', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'loginIp', title: '登录IP', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'createTime', title: '会员注册时间', width: 20, sortable: true, align: 'center'
                }
            ]],
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
</script>
<jsp:include page="../common/bottom.jsp"></jsp:include>

