<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lab1203-1
  Date: 2018/12/25
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    // 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    // 将 "项目路径basePath" 放入pageContext中，待以后用EL表达式读出。
    pageContext.setAttribute("basePath", basePath);
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/images/favicon.ico">
    <title>我的课程</title>
    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <script src="/js/ie-emulation-modes-warning.js"></script>
    <script src="/js/admin-course.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/css/signin.css" rel="stylesheet">
    <link href="/css/dashboard.css" rel="stylesheet">
    <link href="/css/starter-template.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="/js/ie-emulation-modes-warning.js"></script>
    <script src="/js/index.js"></script>
    <script src="/js/jquery.min.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
        #hotNeeds ul{float:left;}
    </style>
</head>

<body background="/images/5.jpg">

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">研究生管理系统</a>
        </div>
        <div class="collapse navbar-collapse pull-right">
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${sessionScope.login_student.name} <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">修改信息</a></li>
                        <li><a href="${basePath}index.jsp">切换账号</a></li>
                        <li><a href="/student/exit">退出</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <h1 style="display: inline-block">选课&nbsp;&nbsp;&nbsp;<a data-toggle="modal" data-target="#newStuCour" href="#" title="选课"><img src="/images/add.png"></a></h1>
    <div class="modal fade" id="newStuCour" tabindex="-1" role="dialog" aria-labelledby="courseInfo" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title">新建课程信息</h4>
                </div>
                <div class="modal-body">
                    <sf:form commandName="stuCourRKey" method="post" action="/student/${sessionScope.login_student.student_id}/addCourse">
                        <div class="form-group">
                            <label>课程</label>
                            <sf:select cssClass="form-control" path="course_id" items="${unselected_courses}"  itemValue="course_id" itemLabel="course_name"/>
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
    <div class="row col-lg-12">
        <table class="table">
            <thead>
            <tr>
                <th>#</th>
                <th>课程名称</th>
                <th>任课老师</th>
                <th>起止周</th>
                <th>上课时间</th>
                <th>上课地点</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${courses}" var="cour" varStatus="sta">
                <tr>
                    <td>${sta.index+1}</td>
                    <td>${cour.course_name}</td>
                    <td>${cour.course_teacher}</td>
                    <td>${cour.course_week}</td>
                    <td>${cour.course_start_time}--${cour.course_end_time}</td>
                    <td>${cour.course_address}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div><!-- /.container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="/js/jquery.min.js"><\/script>')</script>
<script src="/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
