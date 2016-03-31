<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/3/30
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <script src="/statics/js/artTemplate/dist/template.js" type="text/javascript"></script>

    <link href="/statics/bootstrap-3.3.5/css/bootstrap.css" type="text/css" rel="stylesheet">
    <link href="/statics/bootstrap-3.3.5/css/bootstrap-theme.css" type="text/css"  rel="stylesheet">
    <script src="/statics/js/jquery.min-1.10.js" type="text/javascript"></script>
    <script src="/statics/bootstrap-3.3.5/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
<script id="data-temp" type="text/html">
    <table class="table table-stripped">
        <thead><tr><td>编号</td><td>名称</td><td>发布时间</td><td>首页显示</td></tr></thead>
        {{each data as val i}}
            <tr><td>{{val.classid}}</td><td>{{val.name}}</td><td>{{val.createtime}}</td>
                {{if val.ishome==1}}
                <td class="alert-danger" style="width:100px;">是 </td></tr>
                {{else}}
                <td class="alert-danger" style="width:100px;">否 </td></tr>
               {{/if}}
        {{/each}}
    </table>
</script>
<script>
    function loadData(){
        $.ajax({
            url:"/newsclass/list?name=&pageindex=1&pagesize=15&language=1",
            type:"get",
            success:function(data){
                if(data.resultcode==1){
                    var html=template("data-temp",data);
                    $("#container").html(html);
                }else{
                    alert(data.msg);
                }
            }
        });
    }
    $(function(){
        loadData();
    })
</script>
<div id="container" class="container table-responsive"></div>
</body>
</html>
