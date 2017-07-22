<%--
  Created by IntelliJ IDEA.
  User: Wang Genshen
  Date: 2017-07-17
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>修改密码</title>
    <%@include file="../master/style.inc.jsp"%>
</head>
<body>
<%@include file="../master/header.jsp"%>
<div class="container">
    <div class="row" style="margin-top: 20px;">
        <%@include file="../master/admin_left_sidebar.jsp"%>
        <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
            <h3 class="text-center">管理员修改密码</h3>
            <form id="update">
                <div class="form-group">
                    <input type="hidden" class="form-control" id="id" name="id" value="${sessionScope.admin.id}" />
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" id="name" name="name" value="${sessionScope.admin.name}" readonly />
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="password" name="password" placeholder="请输入登录密码">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="newPwd" name="newPwd" placeholder="请输入新密码">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="pwdConfirm" name="pwdConfirm" placeholder="请输入确认密码">
                </div>
                <a class="btn btn-primary col-xs-12 col-sm-12 col-md-12 col-lg-12" href="javascript:void(0);" onclick="updatePwd();">确认修改</a>
            </form>
        </div>
    </div>
    <%@include file="../master/footer.jsp"%>
</div>

</body>
<%@include file="../master/script.inc.jsp"%>
</html>
