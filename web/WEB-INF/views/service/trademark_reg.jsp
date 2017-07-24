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
    <title>商标注册</title>
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
                <h3>商标注册</h3>
                <p>含义：商品生产者和经营者为了使自己生产或经营的商品同其他商品区别开来而使用的一种标记。这种标记通常由文字、图形英文、数字的组合构成。</p>
                <p>所需材料：</p>
                <ol>
                    <li>营业执照副本复印件</li>
                    <li>法人身份证复印件</li>
                    <li>公章</li>
                    <li>商标名称、图片</li>
                </ol>
            </div>
        </div>
        <%@include file="../master/footer.jsp"%>
    </div>
</div>
</body>
<%@include file="../master/script.inc.jsp"%>
</html>