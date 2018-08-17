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
       onclick="javascript:newRecord();">添加</a>
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

<div id="editContainer" class="easyui-dialog" style="width:800px;height:420px;padding:10px 10px" closed="true"
     buttons="#editContainerButtons">
    <form id="editform" method="post">
        <table>
            <tr>
                <td>商品索引id:</td>
                <td><input name='goodsId' class="easyui-numberbox" required="required"/></td>
                <td>商品名称:</td>
                <td><input name='goodsName' class="easyui-textbox"
                           required="required"/></td>
                <td>商品副标题:</td>
                <td><input name='goodsSubtitle' class="easyui-textbox"
                           required="required"/></td>
            </tr>
            <tr>
                <td>商品分类</td>
                <td><input name='gcId' class="easyui-combobox"
                           panelHeight="auto"
                           data-options=" editable:false,
						      valueField:'catId',
						        textField:'catName',
						        url:'<%=basePath%>GoodsCategory/getAll'"
                           required="required"/></td>
                <td>商品原价:</td>
                <td><input name='goodsPrice' type="number"
                           required="required"/></td>
            </tr>
            <tr>
                <td>商品现价:</td>
                <td><input name='goodsSellPrice' value='0' class="easyui-numberbox"
                           required="required"/></td>
                <td>商品默认封面图片:</td>
                <td><input name='goodsImage' class="easyui-textbox"
                           required="required"/></td>
                <td>商品浏览数:</td>
                <td><input name='goodsClick' type="number"
                /></td>
            </tr>
            <tr>
                <td>商品状态:</td>
                <td><input name='goodsState' value='0' class="easyui-numberbox"
                           required="required"/></td>
                <td>商品推荐:</td>
                <td><input name='goodsCommend' class="easyui-textbox"
                           required="required"/></td>
                <td>商品违规下架原因:</td>
                <td><input name='goodsCloseReason' class="easyui-textbox"/></td>
            </tr>
            <tr>
                <td>评论次数:</td>
                <td><input name='commentNum' value='0' class="easyui-numberbox"
                /></td>
                <td>商品点赞量:</td>
                <td><input name='thumbsUpNum' type="number"
                /></td>
                <td>售出数量:</td>
                <td><input name='salenumNum' type="number"
                /></td>
            </tr>
            <tr>
                <td>商品收藏数量:</td>
                <td><input name='goodsCollectNum' value='0' class="easyui-numberbox"
                /></td>
                <td>是否删除:</td>
                <td><input name='isDel' class="easyui-combobox"
                           data-options="
                           required: true,
                            data: [{key: 1, value: '已删除'}, {key: 0, value: '正常'}],
                            valueField: 'key',
                            textField: 'value',
                            panelHeight: 'auto'"
                           required="required"/></td>
                <td>上传者:</td>
                <td><input name='memberId' class="easyui-combobox"
                           panelHeight="auto"
                           data-options=" editable:false,
						        valueField:'memberId',
						        textField:'memberName',
						        url:'<%=basePath%>Memberinfo/getAll'"
                           required="required"/></td>
            </tr>
            <tr>
                <td>商品库存:</td>
                <td><input name='stock' value='0' class="easyui-numberbox"
                /></td>
            </tr>
        </table>
    </form>
</div>
<div id="editContainerButtons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="optRecord(1)">确定</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel"
       onclick="javascript:$('#editContainer').dialog('close')">取消</a>
</div>

<div id="insertContainer" class="easyui-dialog" style="width:800px;height:420px;padding:10px 10px" closed="true"
     buttons="#insertContainerButtons">
    <form id="insertform" method="post">
        <table>
            <tr>
                <td>商品名称:</td>
                <td><input name='goodsName' class="easyui-textbox"
                           required="required"/></td>
                <td>商品副标题:</td>
                <td><input name='goodsSubtitle' class="easyui-textbox"
                           required="required"/></td>
            </tr>
            <tr>
                <td>商品分类</td>
                <td><input name='gcId' class="easyui-combobox"
                           panelHeight="auto"
                           data-options=" editable:false,
						        valueField:'catId',
						        textField:'catName',
						        url:'<%=basePath%>GoodsCategory/getAll'"
                           required="required"/></td>
                <td>商品原价:</td>
                <td><input name='goodsPrice' type="number"
                           required="required"/></td>
            </tr>
            <tr>
                <td>商品现价:</td>
                <td><input name='goodsSellPrice' value='0' class="easyui-numberbox"
                           required="required"/></td>
                <td>商品默认封面图片:</td>
                <td><input name='goodsImage' class="easyui-textbox"
                           required="required"/></td>
                <td>商品浏览数:</td>
                <td><input name='goodsClick' type="number"
                /></td>
            </tr>
            <tr>
                <td>商品状态:</td>
                <td><input name='goodsState' value='0' class="easyui-numberbox"
                           required="required"/></td>
                <td>商品推荐数:</td>
                <td><input name='goodsCommend' class="easyui-numberbox"
                           required="required"/></td>
                <td>商品违规下架原因:</td>
                <td><input name='goodsCloseReason' class="easyui-textbox"/></td>
            </tr>
            <tr>
                <td>评论次数:</td>
                <td><input name='commentNum' value='0' class="easyui-numberbox"
                /></td>
                <td>商品点赞量:</td>
                <td><input name='thumbsUpNum' type="number"
                /></td>
                <td>售出数量:</td>
                <td><input name='salenumNum' type="number"
                /></td>
            </tr>
            <tr>
                <td>商品收藏数量:</td>
                <td><input name='goodsCollectNum' value='0' class="easyui-numberbox"
                /></td>
                <td>是否删除:</td>
                <td><input name='isDel' class="easyui-combobox"
                           data-options="
                           required: true,
                            data: [{key: 1, value: '已删除'}, {key: 0, value: '正常'}],
                            valueField: 'key',
                            textField: 'value',
                            panelHeight: 'auto'"
                           required="required"/></td>
                <td>上传者:</td>
                <td><input name='memberId' class="easyui-combobox"
                           panelHeight="auto"
                           data-options=" editable:false,
						        valueField:'memberId',
						        textField:'memberName',
						        url:'<%=basePath%>Memberinfo/getAll'"
                           required="required"/></td>
            </tr>
            <tr>
                <td>商品库存:</td>
                <td><input name='stock' value='0' class="easyui-numberbox"
                /></td>
            </tr>
        </table>
    </form>
</div>
<div id="insertContainerButtons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="optRecord(0)">确定</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel"
       onclick="javascript:$('#insertContainer').dialog('close')">取消</a>
</div>


<table id="grid"></table>
<div id="msgBox"></div>
<script>
    var grid;
    var cId;
    var indexGloble;

    function getMenName(id) {
        var rs;
        $.ajax({
            url: "<%=basePath%>Memberinfo/byId?id=" + id,
            async: false,
            contentType: "application/json",
            cache: true,
            type: "GET",
            success: function (data) {
                if (data && data.memberName)
                    rs = data.memberName;
                else rs = "网络出错，请尝试刷新";
            }
        })
        return rs;
    }

    $(document).ready(function () {
        //配置表格
        grid = $('#grid').edatagrid({
            title: '商品信息清单',
            method: 'post',
            url: '<%=basePath%>GoodsInfo/getData',
            <%--saveUrl: '<%=basePath%>GoodsInfo/insert',--%>
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
            cache: false,
            autoSave: true,
            idField: "goodsId",
            columns: [[
                {
                    field: 'goodsId', title: '商品索引id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'goodsName', title: '商品名称', width: 20, sortable: true, align: 'center',
                    formatter: function (value, row) {
                        return '<span title=' + value + '>' + value + '</span>';
                    }
                },
                {
                    field: 'goodsSubtitle', title: '商品副标题', width: 20, sortable: true, align: 'center',
                    formatter: function (value, row) {
                        return '<span title=' + value + '>' + value + '</span>';
                    }
                },
                {
                    field: 'gcId', title: '商品分类id', width: 20, sortable: true, align: 'center'
                },
                {
                    field: 'gcName', title: '商品分类名称', width: 20, sortable: true, align: 'center',
                    formatter: function (value, row) {
                        return '<span title=' + value + '>' + value + '</span>';
                    }
                },
                {
                    field: 'goodsImage', title: '商品默认封面图片', width: 20, sortable: true, align: 'center',
                    editor: {
                        type: 'validatebox',
                        options: {
                            required: false
                        }
                    },
                    formatter: function (value, row) {
                        return '<img  height="35px" src="' + value + '" />';
                    }
                },
                {
                    field: 'isDel', title: '是否删除', width: 20, sortable: true, align: 'center',
                    formatter: function (value, row) {
                        if (value === 1) return "已删除"
                        else return "正常";
                    }
                },
                {
                    field: 'memberId', title: '上传者', width: 20, sortable: true, align: 'center',
                    formatter: function (value, row) {
                        return getMenName(value);
                    }
                },
                {
                    title: '操作', field: 'option', width: 30, align: 'center',
                    formatter: function (value, row, index) {
                        return '<a href="javascript:void(0)" style="background-color:white;border-radius:5px;"  class="easyui-linkbutton" onclick="javascript:showFormEdit(' + index + ')">上传商品封面</a>'
                            + '<a href="javascript:void(0)" style="background-color:white;border-radius:5px;margin-left: 1rem;"  class="easyui-linkbutton" onclick="javascript:editRecord(' + index + ');">编辑商品信息</a>';
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
            onDblClickRow: function (rowIndex, rowData) {
                grid.edatagrid('endEdit', rowIndex);
            },
            onSuccess: function (index, row) {
                $.messager.show({
                    title: "消息",
                    msg: row.msg
                });
                grid.edatagrid("load", {});
            },
            view: detailview,
            detailFormatter: function (index, row) {
                return '<div style="padding:2px"><table id="ddv-' + index + '"></table></div>';
            },
            onExpandRow: function (index, row) {
                $('#ddv-' + index).edatagrid({
                    fitColumns: true,
                    rownumbers: false,
                    data: new Array(row),
                    height: 'auto',
                    autoSave: true,
                    columns: [[
                        {
                            field: 'goodsPrice', title: '商品原价', width: 20, sortable: true, align: 'center',
                            formatter: function (value, row) {
                                return "￥" + parseInt(value) / 100 + "元";
                            }

                        },
                        {
                            field: 'goodsSellPrice',
                            title: '商品现价',
                            width: 20,
                            sortable: true,
                            align: 'center',
                            formatter: function (value, row) {
                                return "￥" + parseInt(value) / 100 + "元";
                            }
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
                            field: 'goodsCloseReason',
                            title: '商品违规下架原因',
                            width: 20,
                            sortable: true,
                            align: 'center'
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
                        }
                    ]],
                    onResize: function () {
                        $('#dg').datagrid('fixDetailRowHeight', index);
                        $('#dg').datagrid('fixRowHeight', index);
                    },
                    onLoadSuccess: function () {
                        setTimeout(function () {
                            $('#dg').datagrid('fixDetailRowHeight', index);
                            $('#dg').datagrid('fixRowHeight', index);
                        }, 0);
                    }
                });
                $('#dg').datagrid('fixDetailRowHeight', index);
                $('#dg').datagrid('fixRowHeight', index);

            }
        });
    });

    function doSearch() {
        grid.edatagrid("load", {
            text: $("#genderSearch").val()
        })
    };

    function deleteRecord(row) {
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

        $('#formEditor').form('submit', {
            url: '<%=basePath%>file/saveImg',
            success: function (result) {
                if (result.code === -1) {
                    $.messager.show({
                        title: "消息",
                        msg: result.msg
                    });
                    return;
                }
                $('#formContainer').dialog('close');
                grid.edatagrid('beginEdit', rowIndex);
                var edt = grid.edatagrid('getEditor', {
                    index: rowIndex,
                    field: 'goodsImage'
                });
                $(edt.target).val(result);
                $('#grid').edatagrid('endEdit', rowIndex);
            }
        })
    }

    //
    // function editRecord(index) {
    //     // $('#editContainer').form("reset");
    //     // $('#formEditor').find('input[name="id"]').val("0");
    //     $('#editContainer').dialog('open').dialog('center').dialog('setTitle', '添加数据');
    // }

    function editRecord(index) {
        var row = grid.datagrid('getRows')[index];
        if (row) {
            $('#editContainer').dialog('open').dialog('center').dialog('setTitle', '编辑数据');
            $('#editform').form('load', row);
        } else {
            $.messager.show({
                title: "消息",
                msg: "请先选择一行数据，然后再尝试点击操作按钮！"
            });
        }
    };

    function optRecord(flag) {
        var urlBase = '<%=basePath%>GoodsInfo/insert';
        var fo = '#insertform';
        if (flag !== 0) {
            urlBase = '<%=basePath%>GoodsInfo/update';
            fo = '#editform';
        }
        $(fo).form('submit', {
            url: urlBase,
            onSubmit: function (param) {
                return $(this).form('validate');
            },
            success: function (result) {
                var result = eval('(' + result + ')');
                if (result.code == 0) {
                    $('#editContainer').dialog('close');
                    $('#insertContainer').dialog('close');
                    grid.edatagrid('reload');
                }
                $.messager.show({
                    title: "消息",
                    msg: result.msg
                });
            }
        })
    };

    function newRecord() {
        $('#insertform')[0].reset();
        // $('#editform').find('input[id="goodsId"]').css("display","none");
        $('#insertContainer').dialog('open').dialog('center').dialog('setTitle', '添加数据');
    }
</script>
<jsp:include page="../common/bottom.jsp"></jsp:include>

