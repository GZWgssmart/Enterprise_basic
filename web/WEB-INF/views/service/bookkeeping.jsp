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
    <title>代理记账</title>
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
                <h3>代理记账</h3>
                <p>服务对象：所有行业公司（含小规模纳税人/一般纳税人、赣州本地及异地公司/分公司）</p>
                <p>服务内容：</p>
                <ol>
                    <li>建账报税、零申报税</li>
                    <li>税务违规处理的申请</li>
                    <li>公司账目混乱的清理</li>
                    <li>编制财务报表</li>
                    <li>企业所得税年度汇算清缴</li>
                    <li>税务审计（审计报告）</li>
                    <li>进出口退税办理</li>
                </ol>
            </div>
        </div>
        <%@include file="../master/footer.jsp"%>
    </div>
</div>
</body>
<%@include file="../master/script.inc.jsp"%>
</html>