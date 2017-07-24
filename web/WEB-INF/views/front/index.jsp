<%--
  Created by IntelliJ IDEA.
  User: Wang Genshen
  Date: 2017-07-17
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>赣州市百友汇企业服务有限公司</title>
    <%@include file="../master/style.inc.jsp" %>
</head>
<body>
<%@include file="../master/header.jsp" %>

<div class="container">
    <div class="row" style="margin-top: 20px;">
        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
            <div class="thumbnail">
                <a href="<%=path %>/service/comreg">
                    <img src="<%=path %>/images/company.jpg" alt="公司注册" class="img-responsive img-rounded">
                </a>
                <div class="caption">
                    <h3 class="text-center"><a href="<%=path %>/service/comreg">公司注册</a></h3>
                </div>
            </div>
        </div>
        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
            <div class="thumbnail">
                <a href="<%=path %>/service/bookkeep">
                    <img src="<%=path %>/images/fee.jpg" alt="代理记账" class="img-responsive img-rounded">
                </a>
                <div class="caption">
                    <h3 class="text-center"><a href="<%=path %>/service/bookkeep">代理记账</a></h3>
                </div>
            </div>
        </div>
        <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
            <div class="thumbnail">
                <a href="<%=path %>/service/trademark_reg">
                    <img src="<%=path %>/images/brand.jpg" alt="商标注册" class="img-responsive img-rounded">
                </a>
                <div class="caption">
                    <h3 class="text-center"><a href="<%=path %>/service/trademark_reg">商标注册</a></h3>
                </div>
            </div>
        </div>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <p class="text-center"><a href="<%=path %>/front/service" class="btn btn-primary">更多服务项目……</a></p>
        </div>

    </div>

    <div class="row">
        <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
            <h4>
                <span style="font-weight: bold;">新闻资讯</span>
                <a href="<%=path%>/news/list" class="pull-right">更多新闻...</a>
            </h4>
            <c:forEach items="${requestScope.newsPager.results }" var="news" varStatus="status">
                <a href="<%=path%>/news/detail?id=${news.id}">
                    <div class="row" style="margin-bottom: 15px;">
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                            <img src="<%=path%>/${news.image }" class="img-responsive" style="max-width:100px;max-height: 100px;"/>
                        </div>
                        <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
                            <p>${news.title }</p>
                            <small>${news.abstracts }</small>
                        </div>
                    </div>
                </a>
            </c:forEach>

        </div>

        <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
            <h4>
                <span style="font-weight: bold;">成功案例</span>
                <a href="<%=path%>/case/list" class="pull-right">更多案例...</a>
            </h4>
            <c:forEach items="${requestScope.casePager.results }" var="aCase" varStatus="status">
                <a href="<%=path%>/case/detail?id=${aCase.id}">
                    <div class="row" style="margin-bottom: 15px;">
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                            <img src="<%=path%>/${aCase.image }" class="img-responsive" style="max-width:100px;max-height: 100px;"/>
                        </div>
                        <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
                            <p>${aCase.name }</p>
                            <small>${aCase.customer }</small>
                        </div>
                    </div>
                </a>
            </c:forEach>

        </div>
    </div>

    <%@include file="../master/footer.jsp" %>
</div>

</body>
<%@include file="../master/script.inc.jsp" %>
</html>
