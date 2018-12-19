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
<h1>所有导师</h1>
<table bgcolor="#f0f8ff" border="1" cellspacing="0">
    <thead>
        <tr>
            <th>导师编号</th>
            <th>导师姓名</th>
            <th>导师密码</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${tutors}" var="t" varStatus="st">
            <tr>
                <td>${t.tutor_id}</td>
                <td>${t.tutor_name}</td>
                <td>${t.tutor_psw}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
