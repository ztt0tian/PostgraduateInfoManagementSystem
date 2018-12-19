<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lab1203-1
  Date: 2018/12/18
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>新建专业</h1>
<sf:form commandName="specialty" action="addSpecialty" method="post">
    专业名称：<sf:input path="specialty_name"/>
    专业介绍：<sf:input path="specialty_desc"/>
    <input type="submit" value="AddSpecialty"/>
</sf:form>
</body>
</html>
