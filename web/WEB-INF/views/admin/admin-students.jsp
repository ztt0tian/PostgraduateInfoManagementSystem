<%--
  Created by IntelliJ IDEA.
  User: Lab1203-1
  Date: 2018/12/20
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8"  language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <title>学生信息管理</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]>
    <script src="/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="/js/ie-emulation-modes-warning.js"></script>
    <script src="/js/admin-course.js"></script>
    <link rel="stylesheet" href="/css/bootstrap-select.min.css">
    <script src="/js/bootstrap-select.min.js"></script>

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
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
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
                <li class="active"><a href="#about">学生管理</a></li>
                <li><a href="/admin/class/showAllClass">班级管理</a></li>
                <li><a href="/admin/tutor/showAllTutor">导师管理</a></li>
                <li><a href="/admin/specialty/showAllSpecialty">专业管理</a></li>
                <li><a href="/admin/rprecordmanage/showAllRPrecord">奖罚管理</a></li>
            </ul>
            <div class="collapse navbar-collapse pull-right">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">${sessionScope.login_admin.admin_name} <span class="caret"></span></a>
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
        <h1 style="display: inline-block">所有学生&nbsp;&nbsp;&nbsp;<a data-toggle="modal" data-target="#newStudent"
                                                                   href="#" title="添加学生"><img src="/images/add.png"></a>
        </h1>
        <div class="modal fade" id="newStudent" tabindex="-1" role="dialog" aria-labelledby="studentInfo"
             aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">新建学生信息</h4>
                    </div>
                    <div class="modal-body">
                        <%--@elvariable id="student" type=""--%>
                        <sf:form commandName="student" method="post" action="/admin/student/addStudent">
                            <div class="form-group">
                                <label>学生编号</label>
                                <sf:input path="student_id" cssClass="form-control"/>
                                <label>学生姓名</label>
                                <sf:input path="name" cssClass="form-control"/>
                                <label>学生班级</label>
                                <sf:select cssClass="form-control" path="class_id" items="${classes}"  itemValue="class_id" itemLabel="class_name"/>
                                <label>学生密码</label>
                                <sf:input path="password" cssClass="form-control" value="123456"/>
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
                <form class="searchForm" id="search-form" action="/admin/student/searchStudent" method="post">
                    <input type="text" class="form-control" placeholder="学生查询" name="keyword" id="search-kw"/>
                </form>
                <span class="input-group-addon"><a href="javascript:void(0);" onclick="searchByKW()" id="search-course"><i
                        class="glyphicon glyphicon-search"><span>搜索</span></i></a></span>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <table class="table">
                <thead>
                <tr>
                    <th>#</th>
                    <th>学生ID</th>
                    <th>姓名</th>
                    <th>密码</th>
                    <th>性别</th>
                    <th>生日</th>
                    <th>手机号</th>
                    <th>地址</th>
                    <th>导师</th>
                    <th>班级</th>
                    <th>专业</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${students}" var="stu" varStatus="st">
                    <tr>
                        <td>${st.index+1}</td>
                        <td>${stu.student_id}</td>
                        <td>${stu.name}</td>
                        <td>${stu.password}</td>
                        <td>${stu.sex}</td>
                        <td><fmt:formatDate value='${stu.birthday}' pattern='yyyy-MM-dd '/></td>
                        <td>${stu.phonenumber}</td>
                        <td>${stu.address}</td>
                        <td><c:forEach items="${tutors}" var="tuto">
                            <c:if test="${tuto.tutor_id==stu.tutor_id}">
                                ${tuto.tutor_name}
                            </c:if>
                        </c:forEach></td>
                        <td><c:forEach items="${classes}" var="clas">
                            <c:if test="${clas.class_id==stu.class_id}">
                                ${clas.class_name}
                            </c:if>
                        </c:forEach></td>
                        <td><c:forEach items="${specialties}" var="speca">
                            <c:if test="${speca.specialty_id==stu.specialty_id}">
                                ${speca.specialty_name}
                            </c:if>
                        </c:forEach></td>
                        <td><a data-toggle="modal" data-target="#${stu.student_id}"><img src="/images/modify.png"></a><a
                                href="/admin/student/deleteStudent?student_id=${stu.student_id}"><img
                                src="/images/delete.png"></a></td>
                        <div class="modal fade" id="${stu.student_id}" tabindex="-1" role="dialog"
                             aria-labelledby="courseInfo" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                            &times;
                                        </button>
                                        <h4 class="modal-title">更新学生信息</h4>
                                    </div>
                                    <div class="modal-body">
                                        <form class="StudentInfoForm" role="form" action="/admin/student/updateStudent" method="post">
                                            <div class="form-group">
                                                <label>学生学号</label>
                                                <input type="number" name="update_stu_id" class="form-control"  readonly="readonly" value="${stu.student_id}">
                                            </div>
                                            <div class="form-group">
                                                <label>学生姓名</label>
                                                <input type="text" name="new_stu_name" class="form-control" value="${stu.name}" required>
                                            </div>
                                            <div class="form-group">
                                                <label>账户密码</label>
                                                <input type="text" name="new_stu_psw" class="form-control" value="${stu.password}">
                                            </div>
                                            <div class="form-group">
                                                <label>性别</label>
                                                <input type="text" name="new_stu_sex" class="form-control" value="${stu.sex}">
                                            </div>
                                            <div class="form-group">
                                                <label>生日</label>
                                                <input type="date"  name="new_stu_birthday" class="form-control" value=<fmt:formatDate value='${stu.birthday}' pattern='yyyy-MM-dd '/>/>
                                            </div>
                                            <div class="form-group">
                                                <label>手机号</label>
                                                <input type="text" name="new_stu_phonenumber" class="form-control" value="${stu.phonenumber}">
                                            </div><div class="form-group">
                                            <label>地址</label>
                                            <input type="text" name="new_stu_address" class="form-control" value="${stu.address}">
                                        </div>

                                            <div class="form-group">
                                                <label>班级</label>
                                                <select id="new_stu_class" name="new_stu_class" class="form-control" data-live-search="true">
                                                    <option value="">--还未选择班级--</option>
                                                    <c:forEach items="${classes}" var="cla" varStatus="st">
                                                        <c:if test="${cla.class_id == stu.class_id}">
                                                            <option class="form-control" value="${cla.class_id}" selected="selected">${cla.class_name}</option>
                                                        </c:if>
                                                        <c:if test="${cla.class_id != stu.class_id}">
                                                            <option class="form-control" value="${cla.class_id}">${cla.class_name}</option>
                                                        </c:if>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <label>导师</label>
                                                <select id="new_stu_tutor" name="new_stu_tutor" class="form-control">
                                                    <option value="">--还未选择导师--</option>
                                                    <c:forEach items="${tutors}" var="tur" varStatus="st">
                                                        <c:if test="${tur.tutor_id == stu.tutor_id}">
                                                            <option class="form-control" value="${tur.tutor_id}" selected="selected">${tur.tutor_name}</option>
                                                        </c:if>
                                                        <c:if test="${tur.tutor_id!=stu.tutor_id}">
                                                            <option class="form-control" value="${tur.tutor_id}">${tur.tutor_name}</option>
                                                        </c:if>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <label>专业</label>
                                                <select id="new_stu_specialty" name="new_stu_specialty" class="form-control">
                                                    <option value="">--还未选择专业--</option>
                                                    <c:forEach items="${specialties}" var="special" varStatus="st">
                                                        <c:if test="${special.specialty_id == stu.specialty_id}">
                                                            <option class="form-control" value="${special.specialty_id}" selected="selected">${special.specialty_name}</option>
                                                        </c:if>
                                                        <c:if test="${special.specialty_id!=stu.specialty_id}">
                                                            <option class="form-control" value="${special.specialty_id}">${special.specialty_name}</option>
                                                        </c:if>
                                                    </c:forEach>
                                                </select>
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
