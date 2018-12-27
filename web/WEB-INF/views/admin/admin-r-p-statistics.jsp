<%--
  Created by IntelliJ IDEA.
  User: Lab1203-1
  Date: 2018/12/20
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/images/favicon.ico">
    <title>各班奖惩统计情况</title>
    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]>
    <script src="/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="/js/ie-emulation-modes-warning.js"></script>
    <script src="/js/admin-course.js"></script>
    <script src="http://echarts.baidu.com/build/dist/echarts.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>


<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">GMS</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="/admin/course/showAllCourse">课程管理</a></li>
                <li><a href="/admin/student/showAllStudent">学生管理</a></li>
                <li><a href="/admin/class/showAllClass">班级管理</a></li>
                <li><a href="/admin/tutor/showAllTutor">导师管理</a></li>
                <li><a href="/admin/specialty/showAllSpecialty">专业管理</a></li>
                <li class="active"><a href="/admin/rprecordmanage/showAllRPrecord">奖罚管理</a></li>
            </ul>
            <div class="collapse navbar-collapse pull-right">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">${sessionScope.login_admin.admin_name}<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">修改信息</a></li>
                            <li><a href="#">切换账号</a></li>
                            <li><a href="#">退出</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<br>
<div class="container theme-showcase" role="main">
    <div class="page-header">
        <h1 style="display: inline-block">班级奖惩统计分析</h1>
        <div class="navbar-right col-sm-4" id="so" style="margin-top: 1.5em">
            <div class="input-group">
                <form class="searchForm" id="search-form" action="#">
                    <input type="text" class="form-control" placeholder="特定班级奖惩查询" name="keyword" id="search-kw"/>
                </form>
                <span class="input-group-addon"><a href="javascript:void(0);" onclick="searchByKW()" id="search-course"><i
                        class="glyphicon glyphicon-search"><span>搜索</span></i></a></span>
            </div>
        </div>
    </div>
    <div class="container col-md-12">
        <ul class="nav nav-pills nav-stacked col-md-3">
            <li role="presentation"><a href="/admin/rprecordmanage/showAllRPrecord">奖惩记录</a></li>
            <li role="presentation"><a href="/admin/rpmanage/showAllRP">奖惩项设置</a></li>
            <li role="presentation"><a href="/admin/term/showAllTerm">学期信息</a></li>
            <li role="presentation" class="active"><a href="#">统计分析</a></li>
        </ul>
        <div id="main" class="col-md-9" style="height: 600px"></div>
        <script type="text/javascript">
            // 路径配置
            require.config({
                paths: {
                    echarts: 'http://echarts.baidu.com/build/dist'
                }
            });

            // 使用
            require(
                [
                    'echarts',
                    'echarts/chart/bar' // 使用柱状图就加载bar模块，按需加载
                ],
                function (ec) {
                    // 基于准备好的dom，初始化echarts图表
                    var myChart = ec.init(document.getElementById('main'));
                    var dataClasses = [];//x轴
                    var dateRPcount = [0,10,20,30,40,50];//y轴
                    var dateofClassR = [];//各班奖记录
                    var dateofClassP = [];//各班惩记录
                    //总计
                    myChart.showLoading();    //数据加载完之前先显示一段简单的loading动画
                    $.ajax({
                        type: 'post',
                        async : true,
                        url : "/admin/rprecordmanage/getJsonData",
                        data : {},
                        dataType : "json",
                        success : function(result) {
                            //请求成功时执行该函数内容，result即为服务器返回的json对象
                            if (result) {
                                for(var i=0;i<result.length;i++){
                                    dataClasses.push(result[i].class_name);    //挨个取出班级并填入班级数组
                                    dateofClassR.push(result[i].class_R_count);
                                    dateofClassP.push(result[i].class_P_count);
                                }
                                var data3 = function() {
                                    var datas = [];
                                    for (var i = 0; i < dateofClassR.length; i++) {
                                        datas.push(dateofClassR[i]+dateofClassP[i]);
                                    }
                                    return datas;
                                }();
                                myChart.hideLoading();    //隐藏加载动画
                                myChart.setOption({
                                    title:{
                                        text: '各班奖惩统计',
                                        left: 'center',
                                        top: 'top',
                                    },
                                    tooltip: {
                                        trigger: 'axis',
                                        axisPointer: {
                                            type: 'shadow'
                                        }
                                    },
                                    legend: {
                                        orient:'horizontal',
                                        x: 'center',
                                        y: 'top',
                                        data:['惩','奖']
                                    },
                                    grid: {
                                        left: '3%',
                                        right: '4%',
                                        bottom: '3%',
                                        containLabel: true
                                    },
                                    xAxis : [
                                        {
                                            type : 'category',
                                            data: dataClasses,
                                        }
                                    ],
                                    yAxis : [
                                        {
                                            type: 'value',
                                            date: dateRPcount
                                        }
                                    ],
                                    series : [
                                        {
                                            name:'惩',
                                            type:'bar',
                                            stack:'sum',
                                            itemStyle:{
                                                normal:{
                                                    label: {
                                                        show: true,		//开启显示
                                                        position: 'inside',	//在上方显示
                                                        textStyle: {	    //数值样式
                                                            color: 'black',
                                                            fontSize: 16
                                                        }
                                                    },
                                                    color:'#ff3333'
                                                }
                                            },
                                            data:dateofClassR
                                        },
                                        {
                                            name:'奖',
                                            type:'bar',
                                            stack:'sum',
                                            barWidth : 60,
                                            itemStyle:{
                                                normal:{
                                                    label: {
                                                        show: true,		//开启显示
                                                        position: 'inside',	//在上方显示
                                                        textStyle: {	    //数值样式
                                                            color: 'black',
                                                            fontSize: 16
                                                        }
                                                    },
                                                    color:'#003300'
                                                }
                                            },
                                            data:dateofClassP
                                        },
                                        {
                                            name: '总计',
                                            type: 'bar',
                                            stack: 'sum',
                                            label: {
                                                normal: {
                                                    offset:['50', '80'],
                                                    show: true,
                                                    position: 'insideBottom',
                                                    formatter:'{c}',
                                                    textStyle:{ color:'#000' }
                                                }
                                            },
                                            itemStyle:{
                                                normal:{
                                                    color:'rgba(128, 128, 128, 0)'
                                                }
                                            },
                                            data: data3
                                        }
                                    ]
                                });
                            }
                        },
                        error : function(errorMsg) {
                            //请求失败时执行该函数
                            alert("图表请求数据失败!");
                            myChart.hideLoading();
                        }
                    })
                }
            );
        </script>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="/js/jquery.min.js"><\/script>')</script>
<script src="/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
