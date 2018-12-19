<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lab1203-1
  Date: 2018/12/16
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>新建导师</h1>
<sf:form commandName="tutor" action="addTutor" method="post">
    导师姓名：<sf:input path="tutor_name"/>
    导师密码：<sf:password path="tutor_psw"/>
    <input type="submit" value="AddTutor"/>
</sf:form>
</body>
</html>
