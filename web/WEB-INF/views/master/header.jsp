<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<%=path %>/">百友汇企业服务</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="<%=path %>/">主页</a></li>
                <li><a href="#about">新闻资讯</a></li>
                <li><a href="#contact">成功案例</a></li>
                <li><a href="<%=path %>/front/service">服务项目</a></li>
                <li><a href="<%=path %>/front/about">关于我们</a></li>
                <li><a href="<%=path %>/front/contact">联系我们</a></li>
            </ul>
        </div>
    </div>
</nav>
