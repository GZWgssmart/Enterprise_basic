<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-lg-3 col-md-3 col-sm-4 hidden-xs">
    <div class="list-group">
        <a href="javascript:void(0);" class="list-group-item" style="font-size:16px;font-weight:bold;">服务项目</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "service"}'>active</c:if>">公司注册</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">代理记账</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">乱账整理</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">公司注销</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">进口权认定</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">企业变更</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">商标注册</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">食品流通许可证</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">一般纳税人认定</a>
        <a href="<%=path %>/service/comreg" class="list-group-item <c:if test='${requestScope.page == "#"}'>active</c:if>">餐饮服务许可证</a>
    </div>
</div>

