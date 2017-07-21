<%--
  Created by IntelliJ IDEA.
  User: Wang Genshen
  Date: 2017-07-17
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
  <head>
    <title>****有限公司</title>
    <%@include file="../master/style.inc.jsp"%>
  </head>
  <body>
  <%@include file="../master/header.jsp"%>

  <div class="container">
    <div class="row">
      <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
        <div class="thumbnail">
          <img src="<%=path %>/images/company.jpg" alt="公司注册" class="img-responsive img-rounded">
          <div class="caption">
            <h3>公司注册</h3>
            <p>...</p>
          </div>
        </div>
      </div>
      <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
        <div class="thumbnail">
          <img src="<%=path %>/images/fee.jpg" alt="代理记账" class="img-responsive img-rounded">
          <div class="caption">
            <h3>代理记账</h3>
            <p>...</p>
          </div>
        </div>
      </div>
      <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
        <div class="thumbnail">
          <img src="<%=path %>/images/brand.jpg" alt="商标注册" class="img-responsive img-rounded">
          <div class="caption">
            <h3>商标注册</h3>
            <p>...</p>
          </div>
        </div>
      </div>
      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <p class="text-center"><a href="<%=path %>/front/service" class="btn btn-primary">更多服务项目……</a></p>
      </div>

    </div>
  </div>

  <%@include file="../master/footer.jsp"%>
  </body>
<%@include file="../master/script.inc.jsp"%>
</html>
