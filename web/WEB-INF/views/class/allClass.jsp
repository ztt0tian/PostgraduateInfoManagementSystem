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
<h1>所有班级</h1>
<table bgcolor="#f0f8ff" border="1" cellspacing="0">
    <thead>
        <tr>
            <th>class_id</th>
            <th>class_name</th>
            <th>class_num</th>
            <th>class_operate</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${classes}" var="c" varStatus="st">
            <tr>
                <td>${c.class_id}</td>
                <td>${c.class_name}</td>
                <td>${c.class_nums}</td>
                <td><a href="/class/classInfo/${c.class_id}">查</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
