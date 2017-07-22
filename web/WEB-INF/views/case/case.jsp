<%--
  Created by IntelliJ IDEA.
  User: Wang Genshen
  Date: 2017-07-17
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>案例详情</title>
    <%@include file="../master/style.inc.jsp"%>
</head>
<body>
<%@include file="../master/header.jsp"%>
<div class="container">
    <div class="row" style="margin-top: 20px;">
        <%@include file="../master/admin_left_sidebar.jsp"%>
        <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
            <h3 class="text-center">案例名称</h3>
            <p class="text-center">发布时间</p>
            <p>案例简介</p>
            <p>
                <img src="<%=path %>/images/logo.jpg" class="img-responsive" />
            </p>
            <p>
                案例详情
            </p>
        </div>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <a class="btn btn-primary" href="#">编辑</a>
        </div>
    </div>
    <%@include file="../master/footer.jsp"%>
</div>

</body>
<%@include file="../master/script.inc.jsp"%>
</html>
