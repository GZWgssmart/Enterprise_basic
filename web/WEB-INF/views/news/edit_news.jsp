<%--
  Created by IntelliJ IDEA.
  User: Wang Genshen
  Date: 2017-07-17
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改新闻</title>
    <%@include file="../master/style.inc.jsp"%>
</head>
<body>
<%@include file="../master/header.jsp"%>
<div class="container">
    <div class="row" style="margin-top: 20px;">
        <%@include file="../master/admin_left_sidebar.jsp"%>
        <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
            <h3>编辑新闻</h3>
            <form id="login">
                <div class="form-group">
                    <input type="text" class="form-control" id="name" name="name" placeholder="请输入登录名">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="password" name="password" placeholder="请输入登录密码">
                </div>
                <a class="btn btn-primary col-xs-12 col-sm-12 col-md-12 col-lg-12" href="javascript:void(0);" onclick="">确定</a>
            </form>
        </div>
    </div>
    <%@include file="../master/footer.jsp"%>
</div>
</body>
<%@include file="../master/script.inc.jsp"%>
</html>
