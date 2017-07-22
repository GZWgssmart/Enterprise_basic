<%--
  Created by IntelliJ IDEA.
  User: Wang Genshen
  Date: 2017-07-17
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>管理员登录</title>
    <%@include file="../master/style.inc.jsp"%>
</head>
<body>
    <div class="container">
        <div class="row" style="margin-top: 100px;">
            <div class="col-lg-offset-3 col-lg-6 col-md-offset-3 col-md-6 col-sm-offset-2 col-sm-8 col-xs-12">
                <h3 class="text-center">管理员登录</h3>
                <form id="login">
                    <div class="form-group">
                        <input type="text" class="form-control" id="name" name="name" placeholder="请输入登录名">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="password" name="password" placeholder="请输入登录密码">
                    </div>
                    <a class="btn btn-primary col-xs-12 col-sm-12 col-md-12 col-lg-12" href="javascript:void(0);" onclick="login();">登录</a>
                </form>
            </div>
        </div>
    </div>
</body>
<%@include file="../master/script.inc.jsp"%>
</html>
