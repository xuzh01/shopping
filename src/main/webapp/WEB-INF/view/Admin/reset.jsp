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
    <meta charset="utf-8">
    <meta name="author" content="Kodinger">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>重置</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/my-login.css">
    <script type="text/javascript" src="<%=basePath%>js/index.js"></script>
    <style>
        body {
            overflow: hidden;
            background-image: url("<%=basePath%>img/xue.jpg");
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
</head>
<script type="text/javascript">
    fn.snow();
</script>
<body class="my-login-page">
<section class="h-100">
    <div class="container h-100">
        <div class="row justify-content-md-center align-items-center h-100">
            <div class="card-wrapper">
                <div class="brand">
                    <img src="<%=basePath%>img/logo.jpg">
                </div>
                <div class="card fat">
                    <div class="card-body">
                        <h4 class="card-title">Reset Password</h4>
                        <form action="<%=basePath%>reset/resetPwd" method="post">
                            <div class="form-group">
                                <label for="new-password">New Password</label>
                                <input id="new-password" type="password" class="form-control" name="password" required
                                       autofocus data-eye>
                                <div class="form-text text-muted">
                                    Make sure your password is strong and easy to remember
                                </div>
                            </div>
                            <div class="form-group no-margin">
                                <button id="ResetPwd" type="submit" class="btn btn-primary btn-block">
                                    Reset Password
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="footer">
                    Copyright &copy;商品销售管理系统 by 徐真华&昌国根&李芳洋
                </div>
            </div>
        </div>
    </div>
</section>

<script src="<%=basePath%>js/jquery.min.js"></script>
<script src="<%=basePath%>bootstrap/js/bootstrap.min.js"></script>
<script src="<%=basePath%>js/my-login.js"></script>
<script>
</script>
</body>
</html>