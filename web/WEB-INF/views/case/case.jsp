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
            <h3 class="text-center">${requestScope.aCase.name}</h3>
            <p class="text-center">${requestScope.aCase.createdTime}</p>
            <p>${requestScope.aCase.customer}</p>
            <p>
                <img src="<%=path %>/${requestScope.aCase.image}" class="img-responsive" />
            </p>
            <p>
                ${requestScope.aCase.content}
            </p>
            <hr />
            <a href="btn btn-default">编辑</a>
            <a href="javascript:void(0);" onclick="removeCase(${requestScope.aCase.id});">删除</a>
        </div>

    </div>
    <%@include file="../master/footer.jsp"%>
</div>

</body>
<%@include file="../master/script.inc.jsp"%>
<script src="<%=path %>/js/admin.js"></script>
</html>
