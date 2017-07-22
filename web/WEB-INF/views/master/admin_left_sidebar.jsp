<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-lg-3 col-md-3 col-sm-4 hidden-xs">
    <div class="list-group">
        <a href="javascript:void(0);" class="list-group-item" style="font-size:16px;font-weight:bold;">系统管理</a>
        <a href="<%=path %>/news/admin_list" class="list-group-item <c:if test='${requestScope.admin_page == "news"}'>active</c:if>">所有新闻</a>
        <a href="<%=path %>/case/admin_list" class="list-group-item <c:if test='${requestScope.admin_page == "case"}'>active</c:if>">所有案例</a>
        <a href="<%=path %>/admin/update_page" class="list-group-item <c:if test='${requestScope.admin_page == "pwd"}'>active</c:if>">修改密码</a>
        <a href="<%=path %>/admin/logout" class="list-group-item">安全退出</a>
    </div>
</div>

