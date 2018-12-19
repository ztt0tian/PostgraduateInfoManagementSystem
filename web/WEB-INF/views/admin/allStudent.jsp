<%--
  Created by IntelliJ IDEA.
  User: Lab1203-1
  Date: 2018/12/11
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>所有学生</h1>
<table bgcolor="#f0f8ff" border="1" cellspacing="0">
    <thead>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>密码</th>
            <th>所在班级</th>
            <th>专业</th>
            <th>导师</th>
            <th>出生日期</th>
            <th>手机号码</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${students}" var="s" varStatus="st">
            <tr>
                <td>${s.student_id}</td>
                <td>${s.name}</td>
                <td>${s.password}</td>
                <td>${s.class_id}</td>
                <td>${s.specialty_id}</td>
                <td>${s.tutor_id}</td>
                <td>${s.birthday}</td>
                <td>${s.phonenumber}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
