<%--
  Created by IntelliJ IDEA.
  User: Lab1203-1
  Date: 2018/12/16
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>学生登陆</h1>
${error_msg}
<form action="/student/login" method="post">
    Student ID:<input type="text" name="student_id" required placeholder="学号"/><br/>
    Student Psw:<input type="password" name="student_password" required placeholder="密码"><br/>
    <input type="submit" value="登陆"/>
</form>
</body>
</html>
