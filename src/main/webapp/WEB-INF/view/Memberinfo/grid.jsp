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
    <span style="color:white;">用户管理:</span>
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
<div id="formContainer" class="easyui-dialog" style="width:460px;height:150px;padding:10px 10px" closed="true"
     buttons="#formContainerButtons">
    <form id="formEditor" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td> 上传头像:</td>
                <td>
                    <input type="file" id="fuImportMultipleShipmentStatus" name="filePathName"/>
                </td>
            </tr>
        </table>
    </form>
</div>
<div id="formContainerButtons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok"
       onclick="javascript:ImportShipmentStatusList()">开始上传</a>
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
            title: '会员信息清单',
            method: 'post',
            url: '<%=basePath%>Memberinfo/getData',
            saveUrl: '<%=basePath%>Memberinfo/insert',
            updateUrl: '<%=basePath%>Memberinfo/update',
            destroyUrl: '<%=basePath%>Memberinfo/delete',
            border: true,
            rownumbers: true,
            remoteSort: false,
            nowrap: true,
            singleSelect: true,
            fitColumns: true,
            striped: true,
            pagination: true,
            autoSave: true,
            idField: "memberId",
            columns: [[
                {
                    field: 'memberPic', title: '会员头像', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    },
                    formatter: function (value, row) {
                        return '<img  height="35px" src="<%=basePath%>' + value + '" />';
                    }
                },
                {
                    field: 'memberId', title: '会员id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'memberMobile', title: '手机号', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'memberName', title: '会员昵称', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'memberBirthday', title: '生日', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox'
                    }
                },
                {
                    field: 'memberPasswd', title: '会员密码', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox'
                    },
                    formatter: function (value, row) {
                        return '无法查看';
                    }
                },
                {
                    field: 'memberEmail', title: '会员邮箱', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox'
                    }
                },
                {
                    field: 'memberWw', title: '微信OPENDID', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox'
                    }
                },
                {
                    field: 'memberLoginNum', title: '登录次数', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'createTime', title: '会员注册时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'memberLoginTime', title: '当前登录时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'memberOldLoginTime', title: '上次登录时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'memberLoginIp', title: '当前登录ip', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'memberOldLoginIp', title: '上次登录ip', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'isSell', title: '员是否有发布商品权限', width: 20, sortable: true, align: 'center', editor: {
                        type: 'combobox',
                        options: {
                            required: true,
                            data: [{key: true, value: '有'}, {key: 0, value: '无'}],
                            valueField: 'key',
                            textField: 'value',
                            panelHeight: 'auto'
                        }
                    },
                    formatter: function (value, row) {
                        if (value === true) return "有"
                        else return "无";
                    }
                },
                {
                    field: 'memberState', title: '会员的开启状态', width: 20, sortable: true, align: 'center', editor: {
                        type: 'combobox',
                        options: {
                            required: true,
                            data: [{key: true, value: '启用'}, {key: false, value: '禁用'}],
                            valueField: 'key',
                            textField: 'value',
                            panelHeight: 'auto'
                        }
                    },
                    formatter: function (value, row) {
                        if (value === true) return "启用"
                        else return "禁用";
                    }
                },
                {
                    title: '操作', field: 'option', width: 30, align: 'center',
                    formatter: function (value, row, index) {
                        return '<a href="javascript:void(0)" style="background-color:white;border-radius:5px;"  class="easyui-linkbutton" onclick="javascript:showFormEdit(' + index + ')">上传头像</a>';
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
                $.post('<%=basePath%>Memberinfo/delete', row, function (data) {
                    $.messager.show({
                        title: "消息",
                        msg: data.msg
                    });
                    grid.edatagrid('reload');
                });
            }
        });
    };

    function showFormEdit(index, row) {
        indexGloble = index;
        $('#formContainer').dialog('open').dialog('center').dialog('setTitle', '上传头像');
    };

    function ImportShipmentStatusList() {
        var row = grid.edatagrid('getSelected');
        var rowIndex = grid.edatagrid('getRowIndex', row);
        if ($("#fuImportMultipleShipmentStatus").val() == "") {
            $.messager.show({
                title: "消息",
                msg: "请至少选择一个需要上传的文件"
            });
            return;
        }
        // var images = $("#fuImportMultipleShipmentStatus").val().split('\\');
        // var imageName = images[images.length - 1];
        $('#formEditor').form('submit', {
            url: '<%=basePath%>file/saveImg',
            success: function (result) {
                if (result.code === -1) {
                    $.messager.show({
                        title: "消息",
                        msg: "更改失败"
                    });
                    return;
                }
                $('#formContainer').dialog('close');
                $('#grid').edatagrid('beginEdit', rowIndex);
                var edt = $('#grid').edatagrid('getEditor', {
                    index: rowIndex,
                    field: 'memberPic'
                });
                $(edt.target).val(result);
                $('#grid').edatagrid('endEdit', rowIndex);
            }
        })
    }
</script>
<jsp:include page="../common/bottom.jsp"></jsp:include>

