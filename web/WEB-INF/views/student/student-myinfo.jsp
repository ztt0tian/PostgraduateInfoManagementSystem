<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
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
    <title>个人信息</title>
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
    <!--[if lt IE 9]>
    <script src="/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="/js/ie-emulation-modes-warning.js"></script>
    <script src="/js/index.js"></script>
    <script src="/js/jquery.min.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
        #hotNeeds ul {
            float: left;
        }
    </style>
</head>

<body background="/images/1.jpg">

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">研究生管理系统</a>
        </div>
        <div class="collapse navbar-collapse pull-right">
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">${sessionScope.login_student.name} <span class="caret"></span></a>
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


    <div class="" align="center">
        <h1>我的信息</h1>
        <div id="" class="" style="width:600px" align="left">
            <ul class="alert alert alert-info" style="width: 600px;font-size: 150%">
                <form action="/student/${student.student_id}/updateStudent" method="post">
                    <label>姓名</label>
                    <input type="text" name="new_stu_name" class="form-control" value="${student.name}" readonly required>
                    <label>学号</label>
                    <input type="number" name="update_stu_id" class="form-control"  readonly="readonly" value="${student.student_id}"></li>
                    <label>账户密码</label>
                    <input type="password" name="new_stu_psw" class="form-control" value="${student.password}">
                    <label>性别</label>
                    <input type="text" name="new_stu_sex" class="form-control" value="${student.sex}">
                    <label>生日</label>
                    <input type="date"  name="new_stu_birthday" class="form-control" value=<fmt:formatDate value='${student.birthday}' pattern='yyyy-MM-dd '/>/>
                    <label>手机号</label>
                    <input type="text" name="new_stu_phonenumber" class="form-control" value="${student.phonenumber}">
                    <label>地址</label>
                    <input type="text" name="new_stu_address" class="form-control" value="${student.address}">
                    <label>班级</label>
                    <select id="new_stu_class" name="new_stu_class" class="form-control" data-live-search="true">
                        <option value="">--还未选择班级--</option>
                        <c:forEach items="${classes}" var="cla" varStatus="st">
                            <c:if test="${cla.class_id == student.class_id}">
                                <option class="form-control" value="${cla.class_id}" selected="selected">${cla.class_name}</option>
                            </c:if>
                            <c:if test="${cla.class_id != student.class_id}">
                                <option class="form-control" value="${cla.class_id}">${cla.class_name}</option>
                            </c:if>
                        </c:forEach>
                    </select>
                    <label>导师</label>
                    <select id="new_stu_tutor" name="new_stu_tutor" class="form-control">
                        <option value="">--还未选择导师--</option>
                        <c:forEach items="${tutors}" var="tur" varStatus="st">
                            <c:if test="${tur.tutor_id == student.tutor_id}">
                                <option class="form-control" value="${tur.tutor_id}" selected="selected">${tur.tutor_name}</option>
                            </c:if>
                            <c:if test="${tur.tutor_id!=student.tutor_id}">
                                <option class="form-control" value="${tur.tutor_id}">${tur.tutor_name}</option>
                            </c:if>
                        </c:forEach>
                    </select>
                    <label>专业</label>
                    <select id="new_stu_specialty" name="new_stu_specialty" class="form-control">
                        <option value="">--还未选择专业--</option>
                        <c:forEach items="${specialties}" var="special" varStatus="st">
                            <c:if test="${special.specialty_id == student.specialty_id}">
                                <option class="form-control" value="${special.specialty_id}" selected="selected">${special.specialty_name}</option>
                            </c:if>
                            <c:if test="${special.specialty_id!=student.specialty_id}">
                                <option class="form-control" value="${special.specialty_id}">${special.specialty_name}</option>
                            </c:if>
                        </c:forEach>
                    </select>
                    <br>
                    <input type="submit" class="btn btn-success center-block" style="width: 150px;height: 35px" value="更新"/>
                </form>

            </ul>
        </div>
    </div>
</div><!-- /.container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="/js/jquery.min.js"><\/script>')</script>
<script src="/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
