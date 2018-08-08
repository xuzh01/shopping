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
    <script type="text/javascript" src="<%=basePath%>js/index.js"></script>
    <style>
        body {
            overflow: hidden;
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
</head>
<script type="text/javascript">
    fn.snow();
</script>
<body>
<div class="easyui-layout" style="width:100%;height: 650px;">
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
                <span>商品销售管理系统</span>
                <ul>
                    <li><span><a href="#">会员管理模块</a></span></li>
                    <li><span><a href="<%=basePath%>ArticleInfo/grid">文章管理模块</a></span></li>
                    <li><span><a href="<%=basePath%>GoodsComment/grid">评论管理模块</a></span></li>
                    <li><span><a href="<%=basePath%>OrderInfo/grid">订单管理模块</a></span></li>
                    <li><span><a href="<%=basePath%>Advertisement/grid">广告管理模块</a></span></li>
                    <li><span><a href="<%=basePath%>GoodsInfo/grid">商品管理模块</a></span></li>
                    <li><span><a href="<%=basePath%>GoodsCategory/grid">类别管理模块</a></span></li>
                    <li><span><a href="#">系统设置模块</a></span></li>
                </ul>
            </li>
        </ul>
    </div>
    <div id="content" region="center" style="padding:5px; height: 100%;">