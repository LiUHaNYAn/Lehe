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
    <title>this is the demo title</title>

</head>
<script src="/statics/jquery.min-1.10.js" type="text/javascript"/>
<body>
<script type="text/javascript">
    console.log("this is a demo")
    alert("this is a demo");
$(function(){
    register();
});
    function register(){
        var dto={
            username:"18503292896",
            password:"123456789",
            confirmpassword:"123456789",
            checkcode:"123456",
            telphone:"15803695693"
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
