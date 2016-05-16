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

<link href="/statics/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
<link href="/statics/css/font-awesome.min.css?v=4.3.0" rel="stylesheet">

<link href="/statics/css/animate.min.css" rel="stylesheet">
<link href="/statics/css/style.min.css?v=3.2.0" rel="stylesheet">
<script>if(window.top !== window.self){ window.top.location = window.location;}</script>


<body>
<body class="gray-bg">

<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div>
        <div>

            <h1 class="logo-name">好</h1>

        </div>
        <h3>欢迎使用</h3>

        <form class="m-t" role="form" action="/login/login" id="loginform">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="用户名"  name="username" id="username" value="">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" name="password" id="password" placeholder="密码">
            </div>
            <button type="button" class="btn btn-primary block full-width m-b" onclick="login()">登 录</button>

        </form>
    </div>
</div>

<!-- 全局js -->
<script src="/statics/js/jquery-2.1.1.min.js"></script>
<script src="/statics/js/bootstrap.min.js?v=3.4.0"></script>
<script src="/statics/js/jquery.validate.min.js" type="text/javascript"></script>


</body>
<script type="text/javascript">

    function login(){
        var validate=  $("#loginform").validate({
            rules:{
                username:{
                    required:true,
                    rangelength:[3,20]
                },
                password:{
                    required:true,
                    rangelength:[6,20]
                }
            },
            messages:
            {
                username:{
                    required:"请输入用户名"  ,
                    rangelength:"用户名长度{0}-{1}"
                },
                password:{
                    required:"请输入密码",
                    rangelength:"密码长度{0}-{1}"
                }
            }});
        if(!validate.form()){
            alert("请输入完整信息");
            return;
        }
        var dto={
            username:$("#username").val(),
            password:$("#password").val()
        };
        $.ajax({
            url:"/login/login",
            data:dto,
            dataType:"application/json",
            type:"post",
            success:function(data){
                console.log(data);
            }
        });

    }

</script>
</body>
</html>
