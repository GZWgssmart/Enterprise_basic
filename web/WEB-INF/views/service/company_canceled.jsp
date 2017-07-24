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
    <title>公司注销</title>
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
                <h3>公司注销</h3>
                <h4>营业执照注销</h4>
                <p>所需材料：营业执照正、副本原件、公章、登报公告</p>
                <h4>组织机构代码证注销</h4>
                <p>所需材料：</p>
                <ol>
                    <li>营业执照注销通知书</li>
                    <li>组织机构代码证正、副本原件</li>
                    <li>公章</li>
                </ol>
                <h4>税务登记证注销</h4>
                <ol>
                    <li>《税务注销登记审批表》</li>
                    <li>《发票领购簿》及未使用的空白发票、未验旧发票存根联原件</li>
                    <li>税务登记证正、副本原件</li>
                    <li>股东会决议</li>
                    <li>注销申请书</li>
                    <li>公章</li>
                    <li>最近3年的账册及原始凭证、财务报表</li>
                    <li>注销清算报告</li>
                </ol>
            </div>
        </div>
        <%@include file="../master/footer.jsp"%>
    </div>
</div>
</body>
<%@include file="../master/script.inc.jsp"%>
</html>