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
    <title>餐饮服务许可证</title>
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
                    <button type="button" class="btn btn-default" data-toggle="offcanvas">所有服务</button>
                </p>
                <h3>餐饮服务许可证</h3>
                <p>申请对象：从事餐饮服务的企业和个人</p>
                <p>所需材料：</p>
                <ol>
                    <li>餐饮服务许可证申请表</li>
                    <li>营业执照副本复印件</li>
                    <li>法人/负责人身份证复印件</li>
                    <li>租赁合同</li>
                    <li>房产证复印件</li>
                    <li>健康证</li>
                    <li>经营场地平面图</li>
                </ol>
            </div>
        </div>
        <%@include file="../master/footer.jsp"%>
    </div>
</div>
</body>
<%@include file="../master/script.inc.jsp"%>
</html>