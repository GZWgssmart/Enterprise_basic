<%--
  Created by IntelliJ IDEA.
  User: Wang Genshen
  Date: 2017-07-17
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>所有案例</title>
    <%@include file="../master/style.inc.jsp"%>
</head>
<body>
<%@include file="../master/header.jsp"%>
<div class="container">
    <div class="row" style="margin-top: 20px;">
        <%@include file="../master/left_sidebar.jsp"%>
        <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
            <h3>所有案例</h3>

            <a href="#">
                <div class="row" style="margin-bottom: 15px;">
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                        <img src="<%=path%>/images/logo.jpg" class="img-responsive" style="max-width:100px;max-height: 100px;" />
                    </div>
                    <div class="col-lg-7 col-md-7 col-sm-7 col-xs-6">
                        <p>公司名称</p>
                        <small>案例简介</small>
                    </div>
                    <div class="col-lg-2 col-md-2 col-sm-2 col-xs-3">
                        发布时间
                    </div>
                </div>
            </a>
            <hr />

            <a href="#">
                <div class="row" style="margin-bottom: 15px;">
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                        <img src="<%=path%>/images/logo.jpg" class="img-responsive" style="max-width:100px;max-height: 100px;" />
                    </div>
                    <div class="col-lg-7 col-md-7 col-sm-7 col-xs-6">
                        <p>公司名称</p>
                        <small>案例简介</small>
                    </div>
                    <div class="col-lg-2 col-md-2 col-sm-2 col-xs-3">
                        发布时间
                    </div>
                </div>
            </a>
            <hr />

            <a href="#">
                <div class="row" style="margin-bottom: 15px;">
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                        <img src="<%=path%>/images/logo.jpg" class="img-responsive" style="max-width:100px;max-height: 100px;" />
                    </div>
                    <div class="col-lg-7 col-md-7 col-sm-7 col-xs-6">
                        <p>公司名称</p>
                        <small>案例简介</small>
                    </div>
                    <div class="col-lg-2 col-md-2 col-sm-2 col-xs-3">
                        发布时间
                    </div>
                </div>
            </a>
            <hr />

            <div class="row">
                <nav aria-label="..." class="text-center">
                    <ul class="pager">
                        <li><a href="#">上一页</a></li>
                        <li><a href="#">下一页</a></li>
                    </ul>
                </nav>
            </div>

        </div>
    </div>
</div>
<%@include file="../master/footer.jsp"%>
</body>
<%@include file="../master/script.inc.jsp"%>
</html>
