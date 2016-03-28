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
    <style>
        .error{
            color: red;
        }

    </style>
</head>
<link type="text/css" href="/statics/css/bootstrap.css"  rel="stylesheet">
<link type="text/css" href="/statics/css/bootstrap-theme.css"  rel="stylesheet">
<script src="/statics/js/jquery.min-1.10.js" type="text/javascript"></script>
<script src="/statics/js/jquery.validate.min.js" type="text/javascript"></script>
<div class="container">
    <form class="form-horizontal" id="form1">
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">用户名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" name="password" id="password" placeholder="请输入密码">
            </div>
        </div>
        <div class="form-group">
            <label for="confirmpassword" class="col-sm-2 control-label">确认密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" name="confirmpassword" id="confirmpassword" placeholder="请输入确认密码">
            </div>
        </div>
        <div class="form-group">
            <label for="telphone" class="col-sm-2 control-label">联系方式</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="telphone" name="telphone" placeholder="请输入手机号码">
            </div>
        </div>
        <div class="form-group">
            <label for="checkcode" class="col-sm-2 control-label">验证码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="checkcode" name="checkcode" placeholder="请输入验证码">
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
        var validate=  $("#form1").validate({
            rules:{
                username:{
                    required:true,
                    rangelength:[3,20]
                },
                password:{
                    required:true,
                    rangelength:[6,20]
                },
                confirmpassword:{
                    required:true,
                    rangelength:[6,20],
                    equalTo:"#password"
                },
                checkcode:{
                    required:true,
                    rangelength:[4,4]
                },telphone:{
                    required:true,
                    rangelength:[11,11]
                }
            },
            messages:
            {
                username:{
                    required:"请输入用户名"  ,
                    rangelength:"用户名长度{0}-{1}"
                }
                ,
                password:{
                    required:"请输入密码",
                    rangelength:"密码长度{0}-{1}"
                },
                confirmpassword:{
                    required:"请输入确认密码",
                    rangelength:"密码长度{0}-{1}",
                    equalTo:"密码输入不一致"
                },
                checkcode:{
                    required:"请输入验证码",
                    rangelength: "验证码长度4"
                },
                telphone:{
                    required:"请输入手机号码",
                    rangelength:"手机号长度11位"
                }
            }});
        if(!validate.form()){
            alert("请输入完整信息");
            return;
        }
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
