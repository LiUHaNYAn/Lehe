<%--
  Created by IntelliJ IDEA.
  User: wanghy
  Date: 2016/3/18
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content=""><title>this is the demo title</title>
</head>
<link type="text/css" href="/statics/css/bootstrap.css"  rel="stylesheet">
<link type="text/css" href="/statics/css/bootstrap-theme.css"  rel="stylesheet">
<script src="/statics/js/jquery.min-1.10.js" type="text/javascript"></script>
<div class="container">
    <form class="form-horizontal">
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">用户名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="username" placeholder="请输入用户名">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="password" placeholder="请输入密码">
            </div>
        </div>
        <div class="form-group">
            <label for="confirmpassword" class="col-sm-2 control-label">确认密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="confirmpassword" placeholder="请输入确认密码">
            </div>
        </div>
        <div class="form-group">
            <label for="telphone" class="col-sm-2 control-label">联系方式</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="telphone" placeholder="请输入手机号码">
            </div>
        </div>
        <div class="form-group">
            <label for="checkcode" class="col-sm-2 control-label">验证码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="checkcode" placeholder="请输入验证码">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="button" class="btn btn-default" onclick="register()">提交</button>
            </div>
        </div>
    </form>
</div>

<body>
<script type="text/javascript">

    function register(){
        var dto={
            username:$("#username").val(),
            password:$("#password").val(),
            confirmpassword:$("#confirmpassword").val(),
            checkcode:$("#checkcode").val(),
            telphone:$("#telphone").val()
        };
        $.ajax({
            url:"/user/register",
            data:dto,
            type:"post",
            success:function(data){
                console.log(data);
            }
        });
    }
</script>
</body>
</html>
