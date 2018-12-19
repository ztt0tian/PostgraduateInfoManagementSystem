<%--
  Created by IntelliJ IDEA.
  User: Lab1203-1
  Date: 2018/12/11
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>NewClass</title>
</head>
<body>
<h1>新建班级</h1>
<%--@elvariable id="class" type="com.system.model.Class"--%>
<sf:form method="post" commandName="class" action="newClass">
    Class Name:<sf:input path="class_name"/>
    Class nums:<sf:input path="class_nums" />
    <input type="submit" value="CreatNewClass"/>
</sf:form>
</body>
</html>
