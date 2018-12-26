<%--
  Created by IntelliJ IDEA.
  User: Lab1203-1
  Date: 2018/12/25
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/images/favicon.ico">

    <title>登录</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/css/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="/js/ie-emulation-modes-warning.js"></script>
    <script src="/js/index.js"></script>
    <script src="/js/jquery.min.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body background="/images/bj.jpg">

<div class="container">
    <br>
    <div align="center">
        <img src="/images/logo-w.png">
    </div>
    <br><br><br>
    <form class="form-signin" id="form-signin" method="post" action="">
        <h2 class="form-signin-heading" >
            <font color="white">请登录</font>
        </h2>
        <label for="inputInfo" class="sr-only">登录账户</label>
        <input type="text" id="inputInfo" name="login_info" class="form-control" placeholder="学生为学号,管理员为户名" required autofocus>
        <br>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="login_psw" class="form-control" placeholder="密码" required>
        <div class="checkbox">
            <font color="white">
                <label>
                    <input type="radio" value="student" name="role" onclick="javascript:void $('#form-signin').attr('action','/student/student_login');
                                                                                              $('#inputInfo').attr('type','number')" required >学生
                </label>
                <label>
                    <input type="radio" value="admin" name="role" onclick="javascript:void $('#form-signin').attr('action','/admin/admin_login')
$('#inputInfo').attr('type','text')" required>管理员
                </label>
                <label>
                    <a href="javascript:void alert('暂未开发')">忘记密码?</a>
                </label>
            </font>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
        <br>
    </form>

</div> <!-- /container -->

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="/js/ie10-viewport-bug-workaround.js"></script>


</body>
</html>
