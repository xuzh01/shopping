<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<jsp:include page="../common/head.jsp"></jsp:include>
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
                <td> 上传文章2图片:</td>
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
    function show(i,z) {
        console.log(i+"   "+z)
        var z= encodeURI("<%=basePath%>Edit?articleId="+i+"&&articleContent="+z);
        window.location.href=z;
    }
    $(document).ready(function () {
        //配置表格
        grid = $('#grid').edatagrid({
            title: '文章清单',
            method: 'post',
            url: '<%=basePath%>ArticleInfo/getData',
            saveUrl: '<%=basePath%>ArticleInfo/insert',
            updateUrl: '<%=basePath%>ArticleInfo/update',
            destroyUrl: '<%=basePath%>ArticleInfo/delete',
            border: true,
            rownumbers: true,
            remoteSort: false,
            nowrap: true,
            singleSelect: true,
            fitColumns: true,
            striped: true,
            cache: false,
            pagination: true,
            autoSave: true,
            idField: "articleId",
            columns: [[
                {
                    field: 'articleId', title: '索引id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'articlePicUrl', title: '文章图片', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    },
                    formatter: function (value, row) {
                        return '<img  height="35px" src="' + value + '" />';
                    }
                },
                {
                    field: 'articleShow', title: '是否显示', width: 20, sortable: true, align: 'center', editor: {
                        type: 'combobox',
                        options: {
                            required: true,
                            data: [{key: true, value: '是'}, {key: false, value: '否'}],
                            valueField: 'key',
                            textField: 'value',
                            panelHeight: 'auto'
                        }
                    }, formatter: function (value, row) {
                        if (value === true) return "是";
                        else return "否";
                    }
                },
                {
                    field: 'articleTitle', title: '标题', width: 20, sortable: true, align: 'center', editor: {
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
                    field: 'amountOfReading', title: '阅读量', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'articleContent', title: '内容', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    },
                    formatter: function (value, row) {
                        console.log(value)
                        return '<span><xmp>' + value + '</xmp></span>';
                    }
                },
                {
                    field: 'createTime', title: '创建时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'updateTime', title: '更新时间', width: 20, sortable: true, align: 'center'
                },
                {
                    title: '操作', field: 'option', width: 30, align: 'center',
                    formatter: function (value, row, index) {
                        return '<a href="javascript:void(0)" style="background-color:white;border-radius:5px;"  class="easyui-linkbutton" onclick="javascript:showFormEdit(' + index + ')">上传文章图片</a>';
                    }
                },{
                    title: '编辑', field: 'sss', width: 30, align: 'center',
                    formatter: function (value,row) {
                        return '<a href="javascript:void(0)" style="background-color:white;border-radius:5px;"  class="easyui-linkbutton" onclick="javascript:show('+row.articleId+',\''+row.articleContent+'\')">编辑</a>';
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
                $.post('<%=basePath%>ArticleInfo/delete', row, function (data) {
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
        $('#formContainer').dialog('open').dialog('center').dialog('setTitle', '上传文章图片');
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
                    field: 'articlePicUrl'
                });
                $(edt.target).val(result);
                $('#grid').edatagrid('endEdit', rowIndex);
            }
        })
    }
</script>
<jsp:include page="../common/bottom.jsp"></jsp:include>

