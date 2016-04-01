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
    <link href="/statics/css/animate.min.css" rel="stylesheet">
    <link href="/statics/css/style.min.css?v=3.2.0" rel="stylesheet">
</head>


<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInUp">
    <div class="row">
        <div class="col-sm-12">

            <div class="ibox">
                <div class="ibox-title">
                    <h5>所有类别</h5>
                    <div class="ibox-tools">
                        <a href="projects.html" class="btn btn-primary btn-xs">创建新类别</a>
                    </div>
                </div>
                <div class="ibox-content">
                    <div class="row m-b-sm m-t-sm">

                        <div class="col-md-11">
                            <form class="form-inline" id="condition">
                                <div class="col-md-4">
                                            <input type="hidden" name="pageindex" id="pageindex" value="1">
                                            <input type="hidden" name="pagesize" id="pagesize" value="15">
                                            <input type="hidden" name="language" id="language" value="1">
                                        <div class="form-group">
                                            <label for="name">标题</label>
                                            <input name="name" type="text" class="form-control" id="name" placeholder="请输入标题">
                                        </div>
                                    </div>
                                <div class="col-md-4">    <button type="button" class="btn btn-sm btn-primary"  onclick=" loadData()"> 搜索</button></div>
                            </form>
                        </div>
                    </div>

                    <div class="project-list" id="container">

                        <table class="table table-hover table-bordered">
                            <thead>
                            <tr>
                                <td class="project-status">
                                            <span class="label label-primary">编号</span>
                                </td>
                                <td class="project-title">
                                    名称
                                </td>
                                <td class="project-completion">
                                    创建时间
                                </td>
                                <td class="project-people">
                                 首页显示
                                </td>
                                <td class="project-actions">
                                    操作
                                </td>
                            </tr>
                            </thead>

                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script id="data-temp" type="text/html">
    <table class="table table-hover table-bordered">
        <thead>
        <tr>

            <td class="project-status">
                <span class="label label-primary">编号</span>
            </td>
            <td class="project-title">
                名称
            </td>
            <td class="project-completion">
                创建时间
            </td>
            <td class="project-people">
                首页显示
            </td>
            <td class="project-actions">
                操作
            </td>
        </tr>
        </thead>
        <tbody>
        {{each data as val i}}
        <tr>
            <td class="project-status">
                <span class="label label-primary">{{val.classid}}</span>
            </td>
            <td class="project-title">
                {{val.name}}
            </td>
            <td class="project-completion">
                {{val.createtime}}
            </td>
            {{if val.ishome==1}}
            <td style="width:100px;">是 </td>
            {{else}}
            <td style="width:100px;">否 </td>
            {{/if}}

            <td class="project-actions">
                <a href="projects.html#" class="btn btn-white btn-sm"><i class="fa fa-folder"></i> 查看 </a>
                <a href="projects.html#" class="btn btn-white btn-sm"><i class="fa fa-pencil"></i> 编辑 </a>
            </td>
        </tr>
        {{/each}}
        </tbody>
    </table>

</script>
<script>
    function loadData(){
        $.ajax({
            url:"/newsclass/list?"+$("#condition").serialize(),
            type:"get",
            success:function(data){
                if(data.resultcode==1){
                    var html=template("data-temp",data);
                    $("#container").html(html);
                }else{
                    $('#myModal').modal({
                        show: true,
                    })
                }
            }
        });
    }
    $(function(){
        loadData();
    })
</script>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">提示信息</h4>
            </div>
            <div class="modal-body">
               操作成功
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="errorModel" tabindex="-1" role="dialog" aria-labelledby="errorModelLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="errorModelLabel">提示信息</h4>
            </div>
            <div class="modal-body">
                操作失败
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
</html>
