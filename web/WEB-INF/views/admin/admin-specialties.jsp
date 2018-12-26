<%--
  Created by IntelliJ IDEA.
  User: Lab1203-1
  Date: 2018/12/20
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/images/favicon.ico">

    <title>专业管理</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="/js/ie-emulation-modes-warning.js"></script>
    <script src="/js/admin-course.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">GMS</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="/admin/course/showAllCourse">课程管理</a></li>
                <li><a href="/admin/student/showAllStudent">学生管理</a></li>
                <li><a href="/admin/class/showAllClass">班级管理</a></li>
                <li><a href="/admin/tutor/showAllTutor">导师管理</a></li>
                <li class="active"><a href="/admin/specialty/showAllSpecialty">专业管理</a></li>
                <li><a href="/admin/rprecordmanage/showAllRPrecord">奖罚管理</a></li>
            </ul>
            <div class="collapse navbar-collapse pull-right">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${sessionScope.login_admin.admin_name} <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">修改信息</a></li>
                            <li><a href="#">切换账号</a></li>
                            <li><a href="#">退出</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<br>
<div class="container theme-showcase" role="main">
    <div class="page-header">
        <h1 style="display: inline-block">所有专业&nbsp;&nbsp;&nbsp;<a data-toggle="modal" data-target="#newSpecialty" href="#" title="添加专业"><img src="/images/add.png"></a></h1>
        <div class="modal fade" id="newSpecialty" tabindex="-1" role="dialog" aria-labelledby="courseInfo" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">新建课程信息</h4>
                    </div>
                    <div class="modal-body">
                        <sf:form commandName="specialty" method="post" action="/admin/specialty/addSpecialty">
                            <div class="form-group">
                                <label>专业名称</label>
                                <sf:input path="specialty_name" cssClass="form-control"/>
                                <label>专业简介</label>
                                <sf:input path="specialty_desc" cssClass="form-control"/>

                            </div>
                            <div class="form-group">
                                <button type="reset" class="btn btn-default">重置</button>
                                <button type="submit" class="btn btn-primary btn-success">添加</button>
                            </div>
                        </sf:form>
                    </div>
                </div>
            </div>
        </div>
        <div class="navbar-right col-sm-4" id="so" style="margin-top: 1.5em">
            <div class="input-group">
                <form class="searchForm" id="search-form" action="#">
                    <input type="text" class="form-control" placeholder="专业查询" name="keyword" id="search-kw"/>
                </form>
                <span class="input-group-addon"><a href="javascript:void(0);" onclick="searchByKW()" id="search-course"><i class="glyphicon glyphicon-search"><span >搜索</span></i></a></span>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <table class="table">
                <thead>
                <tr>
                    <th>#</th>
                    <th>专业ID</th>
                    <th>专业名称</th>
                    <th>专业介绍</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${specialties}" var="sepc" varStatus="st">
                    <tr>
                        <td>${st.index+1}</td>
                        <td>${sepc.specialty_id}</td>
                        <td>${sepc.specialty_name}</td>
                        <td>${sepc.specialty_desc}</td>
                        <td><a data-toggle="modal" data-target="#${sepc.specialty_id}"><img src="/images/modify.png"></a><a href="/admin/specialty/deleteSpecialty?specialty_id=${sepc.specialty_id}"><img src="/images/delete.png"></a></td>
                        <div class="modal fade" id="${sepc.specialty_id}" tabindex="-1" role="dialog" aria-labelledby="courseInfo" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        <h4 class="modal-title">更新专业信息</h4>
                                    </div>
                                    <div class="modal-body">
                                        <form class="SpecialtyInfoForm" role="form" action="/admin/specialty/updateSpecialty" method="post">
                                            <div class="form-group">
                                                <label>专业ID</label>
                                                <input type="number" name="update_specialty_id" class="form-control"  readonly="readonly" value="${sepc.specialty_id}">
                                            </div>
                                            <div class="form-group">
                                                <label>专业名称</label>
                                                <input type="text" name="new_specialty_name" class="form-control" value="${sepc.specialty_name}" required>
                                            </div>
                                            <div class="form-group">
                                                <label>专业介绍</label>
                                                <input type="text" name="new_specialty_desc" class="form-control" value="${sepc.specialty_desc}">
                                            </div>
                                            <div class="form-group">
                                                <button type="reset" class="btn btn-default">重置</button>
                                                <button type="submit" class="btn btn-primary btn-success">更新</button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="/js/jquery.min.js"><\/script>')</script>
<script src="/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
