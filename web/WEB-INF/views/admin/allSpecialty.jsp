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
<h1>所有专业</h1>
<table bgcolor="#f0f8ff" border="1" cellspacing="0">
    <thead>
        <tr>
            <th>专业ID</th>
            <th>专业名称</th>
            <th>专业介绍</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${specialties}" var="s" varStatus="st">
            <tr>
                <td>${s.specialty_id}</td>
                <td>${s.specialty_name}</td>
                <td>${s.specialty_desc}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
