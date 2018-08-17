<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/8/11
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <script src="../../../js/jquery.min.js"></script>
    <style type="text/css">
        body,html,div{
            width:100%;
        }
    </style>
</head>
<body>
<div>
<!-- 加载编辑器的容器 -->
<script id="container" name="content" type="text/plain" style="width:98%;height:500px;">

</script>
    </div>
<!-- 配置文件 -->
<script type="text/javascript" src="../../../utf8-jsp/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="../../../utf8-jsp/ueditor.all.js"></script>
<!-- 实例化编辑器 -->

<input type="button" style="position: absolute; left: 50%" id="test" value="提交">
<script type="text/javascript">
    var ue = UE.getEditor('container');
    var a=document.location.href;
    var con=a.split("?")[1];
    var articleId= con.split("&&")[0].split("=")[1];
    var Cont=con.split("&&")[1].split("=")[1];
    UE.getEditor("container").setContent(Cont);
    $('#test').click(function () {
        var htm=UE.getEditor('container').getContent()
        console.log(htm);
        $.ajax({
            url:"ArticleInfo/updateCont",
            type:"post",
            data:{"Content":htm,"articleId":articleId},
            success:function () {
                console.log("保存成功");
            },
            error:function () {
                console.log("传送失败")
            }
        })
    })
</script>
</body>
</html>