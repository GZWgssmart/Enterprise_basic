<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-lg-3 col-md-3 col-sm-4 hidden-xs">
    <div class="list-group">
        <a href="javascript:void(0);" class="list-group-item" style="font-size:16px;font-weight:bold;">系统管理</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">所有新闻</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">所有案例</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">修改密码</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">安全退出</a>
    </div>
</div>

