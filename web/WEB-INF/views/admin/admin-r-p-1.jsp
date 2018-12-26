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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/images/favicon.ico">
    <title>奖惩记录</title>
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
                <li><a href="/admin/specialty/showAllSpecialty">专业管理</a></li>
                <li><a href="/admin/rprecordmanage/showAllRPrecord">奖罚管理</a></li>
            </ul>
            <div class="collapse navbar-collapse pull-right">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${sessionScope.login_admin.admin_name} <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">修改信息</a></li>
                            <li><a href="#">切换账号</a></li>
                            <li><a href="/admin/exit">退出</a></li>
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
        <h1 style="display: inline-block">奖惩记录&nbsp;&nbsp;&nbsp;<a data-toggle="modal" data-target="#newRPrecord" href="#" title="添加奖惩记录"><img src="/images/add.png"></a></h1>
        <div class="modal fade" id="newRPrecord" tabindex="-1" role="dialog" aria-labelledby="courseInfo" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">新建奖惩信息</h4>
                    </div>
                    <div class="modal-body">
                            <sf:form modelAttribute="rewardPunishRecord" method="post" action="/admin/rprecordmanage/addRPrecord">
                                <div class="form-group">
                                    <label>学生名称</label>
                                    <sf:select path="student_id" items="${students}"  itemValue="student_id" itemLabel="name" cssClass="form-control" required="required"/>
                                    <label>奖惩名称</label>
                                    <sf:select path="reward_punish_id" items="${rpes}"  itemValue="reward_punish_id" itemLabel="reward_punish_name" cssClass="form-control" />
                                    <label>所处学期</label>
                                    <sf:select path="term_id" items="${terms}"  itemValue="term_id" itemLabel="trem_name" cssClass="form-control"/>
                                    <label>奖惩日期</label>
                                    <input type="date"  name="rprecord_date" class="form-control" value=<fmt:formatDate value='${rewardPunishRecord.rp_record_date}' pattern='yyyy-MM-dd '/>/>
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
                    <input type="text" class="form-control" placeholder="导师查询" name="keyword" id="search-kw"/>
                </form>
                <span class="input-group-addon"><a href="javascript:void(0);" onclick="searchByKW()" id="search-course"><i class="glyphicon glyphicon-search"><span >搜索</span></i></a></span>
            </div>
        </div>
    </div>
    <div class="container col-lg-12">
        <ul class="nav nav-pills nav-stacked col-lg-3">
            <li role="presentation" class="active"><a href="/admin/rprecordmanage/showAllRPrecord">奖惩记录</a></li>
            <li role="presentation"><a href="/admin/rpmanage/showAllRP">奖惩项设置</a></li>
            <li role="presentation"><a href="/admin/term/showAllTerm">学期添加</a></li>
            <li role="presentation"><a href="/admin/rprecordmanage/statistics">统计分析</a></li>
        </ul>
        <div class="row col-lg-9">
            <div class="col-md-12">
                <table class="table">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>奖惩记录编号</th>
                        <th>学生名称</th>
                        <th>奖惩名称</th>
                        <th>所处学期</th>
                        <th>奖惩日期</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${RPrecords}" var="rpre" varStatus="sta">
                            <tr>
                                <td>${sta.index+1}</td>
                                <td>${rpre.rp_record_id}</td>
                                <td><c:forEach items="${students}" var="student">
                                    <c:if test="${student.student_id==rpre.student_id}">
                                        ${student.name}
                                    </c:if>
                                </c:forEach>
                                </td>
                                <td><c:forEach items="${rpes}" var="rp">
                                    <c:if test="${rp.reward_punish_id==rpre.reward_punish_id}">
                                        ${rp.reward_punish_name}
                                    </c:if>
                                </c:forEach>
                                </td>
                                <td><c:forEach items="${terms}" var="term">
                                    <c:if test="${term.term_id==rpre.term_id}">
                                        ${term.trem_name}
                                    </c:if>
                                </c:forEach>
                                </td>
                                <td><fmt:formatDate value='${rpre.rp_record_date}' pattern='yyyy-MM-dd '/></td>
                                <td><a href="/admin/rprecordmanage/deleteRPrecord?rp_record_id=${rpre.rp_record_id}"><img src="/images/delete.png"></a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
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
