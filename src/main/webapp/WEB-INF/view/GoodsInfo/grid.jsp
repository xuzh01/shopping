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
<div id="formContainer" class="easyui-dialog" style="width:460px;height:150px;padding:10px 10px" closed="true"
     buttons="#formContainerButtons">
    <form id="formEditor" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td> 上传商品封面:</td>
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
<script>
    var grid;
    var cId;
    $(document).ready(function () {
        //配置表格
        grid = $('#grid').edatagrid({
            title: '商品信息清单',
            method: 'post',
            url: '<%=basePath%>GoodsInfo/getData',
            saveUrl: '<%=basePath%>GoodsInfo/insert',
            updateUrl: '<%=basePath%>GoodsInfo/update',
            destroyUrl: '<%=basePath%>GoodsInfo/delete',
            border: true,
            rownumbers: true,
            remoteSort: false,
            nowrap: true,
            singleSelect: true,
            fitColumns: true,
            striped: true,
            pagination: true,
            autoSave: true,
            idField: "goodsId",
            columns: [[
                {
                    field: 'goodsId', title: '商品索引id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsName', title: '商品名称', width: 20, sortable: true, align: 'center', editor: {
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
                    field: 'goodsSubtitle', title: '商品副标题', width: 20, sortable: true, align: 'center', editor: {
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
                    field: 'gcId', title: '商品分类id', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'gcName', title: '商品分类名称', width: 20, sortable: true, align: 'center', editor: {
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
                    field: 'goodsPrice', title: '商品原价', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'goodsSellPrice', title: '商品现价', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'goodsImage', title: '商品默认封面图片', width: 20, sortable: true, align: 'center', editor: {
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
                    field: 'goodsClick', title: '商品浏览数', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsState', title: '商品状态', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'goodsCommend', title: '商品推荐', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'goodsCloseReason', title: '商品违规下架原因', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
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
                    field: 'isDel', title: '是否删除', width: 20, sortable: true, align: 'center', editor: {
                        type: 'combobox',
                        options: {
                            required: true,
                            data: [{key: 1, value: '删除'}, {key: 0, value: '正常'}],
                            valueField: 'key',
                            textField: 'value',
                            panelHeight: 'auto'
                        }
                    },
                    formatter: function (value, row) {
                        if (value === 1) return "已删除"
                        else return "正常";
                    }
                },
                {
                    field: 'memberId', title: '上传者', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'stock', title: '商品库存', width: 20, sortable: true, align: 'center', editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    }
                },
                {
                    field: 'updateTime', title: '商品修改时间', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'createTime', title: '商品上传时间', width: 20, sortable: true, align: 'center'
                },
                {
                    title: '操作', field: 'option', width: 30, align: 'center',
                    formatter: function (value, row, index) {
                        return '<a href="javascript:void(0)" style="background-color:white;border-radius:5px;"  class="easyui-linkbutton" onclick="javascript:showFormEdit(' + index + ')">上传商品封面</a>';
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
                $.post('<%=basePath%>GoodsInfo/delete', row, function (data) {
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
        $('#formContainer').dialog('open').dialog('center').dialog('setTitle', '上传商品封面');
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
                    field: 'goodsImage'
                });
                $(edt.target).val(result);
                $('#grid').edatagrid('endEdit', rowIndex);
            }
        })
    }
</script>
<jsp:include page="../common/bottom.jsp"></jsp:include>

