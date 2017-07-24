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
            <form id="editNews" method="post" enctype="multipart/form-data">
                <input type="hidden" class="form-control" id="id" name="id" value="${requestScope.news.id}">
                <div class="form-group">
                    <input type="text" class="form-control" id="title" name="title" value="${requestScope.news.title}">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" id="abstracts" name="abstracts" value="${requestScope.news.abstracts}">
                </div>
                <div class="form-group">
                    <textarea class="form-control" id="content" name="content">${requestScope.news.content}</textarea>
                </div>
                <div class="form-group">
                    <input type="file" class="form-control" id="image" name="image" multiple>
                </div>
                <a class="btn btn-primary col-xs-12 col-sm-12 col-md-12 col-lg-12" href="javascript:void(0);" onclick="updateNews();">确定修改</a>
            </form>
        </div>
    </div>
    <%@include file="../master/footer.jsp"%>
</div>
</body>
<%@include file="../master/script.inc.jsp"%>
<script src="<%=path %>/plugins/jQuery.form.min.js"></script>
<script src="<%=path %>/js/admin.js"></script>
</html>
