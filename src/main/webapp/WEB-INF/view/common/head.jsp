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
<div class="easyui-layout" style="width:100%;height: 630px;">
    <div id="north" region="north" title="" style="height: 30px;background-color: #00b7ee">
        <div style="line-height: 25px;float: left">商品销售管理系统</div>
        <div style="float: right; line-height: 25px">
            <li style="display: inline">欢迎您***</li>&nbsp;&nbsp;&nbsp;
            <li style="display: inline"><a href="#">修改密码</a></li>&nbsp;&nbsp;&nbsp;
            <li style="display: inline"><a href="#">退出登录</a></li>
        </div>
    </div>
    <div region="west" split="true" title="操作菜单" style="width:150px; height: 100%">
        <ul class="easyui-tree">
            <li>
                <span>会员管理模块</span>
                <ul>
                    <li><span>会员增加</span></li>
                    <li><span>会员删除</span></li>
                    <li><span>会员修改</span></li>
                    <li><span>会员查询</span></li>
                </ul>
            </li>
            <li>
                <span>文章管理模块</span>
                <ul>
                    <li><span>文章增加</span></li>
                    <li><span>文章删除</span></li>
                    <li><span>文章修改</span></li>
                    <li><span>文章查询</span></li>
                </ul>
            </li>
            <li>
                <span>评论管理模块</span>
                <ul>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                </ul>
            </li>
            <li>
                <span>订单管理模块</span>
                <ul>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                </ul>
            </li>
            <li>
                <span>广告管理模块</span>
                <ul>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                </ul>
            </li>
            <li>
                <span>商品管理模块</span>
                <ul>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                </ul>
            </li>
            <li>
                <span>类别管理模块</span>
                <ul>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                </ul>
            </li>
            <li>
                <span>系统设置模块</span>
                <ul>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                    <li><span>***</span></li>
                </ul>
            </li>

        </ul>
    </div>