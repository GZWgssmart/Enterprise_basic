<%--
  Created by IntelliJ IDEA.
  User: Wang Genshen
  Date: 2017-07-21
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>企业变更</title>
    <%@include file="../master/style.inc.jsp"%>
</head>
<body>
<%@include file="../master/header.jsp"%>
<div class="container">
    <div class="row-offcanvas row-offcanvas-left" style="margin-top: 20px;">
        <div class="row">
            <%@include file="../master/left_sidebar_canvas.jsp"%>
            <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12 ">
                <p class="visible-xs">
                    <button type="button" class="btn btn-default btn-xs" data-toggle="offcanvas">所有服务</button>
                </p>
                <h3>企业变更</h3>
                <h4>变更法定代表人</h4>
                <ol>
                    <li>营业执照正、副本原件</li>
                    <li>税务登记证正、副本原件</li>
                    <li>组织机构代码证正副本卡</li>
                    <li>公章</li>
                </ol>
                <h4>变更股东、股权</h4>
                <ol>
                    <li>营业执照正、副本原件</li>
                    <li>税务登记证正、副本原件</li>
                    <li>组织机构代码证正副本卡</li>
                    <li>公章</li>
                    <li>全体股东本人携带身份证原件到场签字</li>
                </ol>
                <h4>变更地址</h4>
                <ol>
                    <li>新地址的房屋租赁合同复印件和房产证复印件</li>
                    <li>营业执照正、副本原件</li>
                    <li>组织机构代码证正副本原件</li>
                    <li>税务登记证正、副本原件</li>
                    <li>公章</li>
                    <li>法定代表人身份证复印件</li>
                </ol>
            </div>
        </div>
        <%@include file="../master/footer.jsp"%>
    </div>

</div>
</body>
<%@include file="../master/script.inc.jsp"%>
</html>