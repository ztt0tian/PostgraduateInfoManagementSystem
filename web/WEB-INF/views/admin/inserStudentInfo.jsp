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
<h1>新建学生</h1>
<sf:form commandName="student" action="addStudent" method="post">
    学号：<sf:input path="student_id"/>
    姓名：<sf:input path="name"/>
    密码：<sf:password path="password"/>
    性别：<sf:radiobutton path="sex" value="M" label="男"/><sf:radiobutton path="sex" value="F" label="女"/>
    班级：<sf:select path="class_id" items="${classes}"  itemValue="class_id" itemLabel="class_name">
</sf:select>
    <input type="submit" value="AddStudent"/>
</sf:form>
</body>
</html>
