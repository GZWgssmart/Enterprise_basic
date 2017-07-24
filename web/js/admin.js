var contextPath = "";

/**
 * 做管理员添加案例新闻和修改案例新闻用的js
 */

function addCase() {
    var name = $("#name").val();
    var customer = $("#customer").val();
    var content = $("#content").val();
    if(name == null || name.trim() == "") {
        swal("案例名称不能为空！", "","error");
        return;
    }
    if(customer == null || customer.trim() == "") {
        swal("客户名称不能为空！", "","error");
        return;
    }
    if(content == null || content.trim() == "") {
        swal("案例详情不能为空！", "","error");
        return;
    }
    $("#addCase").on('click', function() {
        $("#addCase").ajaxSubmit({
            type: 'post',
            url: contextPath+'/case/add',
            dataType : 'json',
            data: $("#addCase").serialize(),
            success: function(data) {
                if(data.error == "添加成功") {
                    window.location = contextPath + "/case/admin_list";
                } else {
                    swal(data.error,"","error");
                }
            },
            error: function(data) {
                swal(data.error,"","error");
            }
        });
        return false; // 阻止表单自动提交
    });
}

function addNews() {
    var title = $("#title").val();
    var abstracts = $("#abstracts").val();
    var content = $("#content").val();
    if(title == null || title.trim() == "") {
        swal("新闻标题不能为空！", "","error");
        return;
    }
    if(abstracts == null || abstracts.trim() == "") {
        swal("新闻摘要不能为空！", "","error");
        return;
    }
    if(content == null || content.trim() == "") {
        swal("新闻详情不能为空！", "","error");
        return;
    }
    $("#addNews").on('click', function() {
        $("#addNews").ajaxSubmit({
            type: 'post',
            url: contextPath+'/news/add',
            dataType : 'json',
            data: $("#addNews").serialize(),
            success: function(data) {
                if(data.error == "添加成功") {
                    window.location = contextPath + "/news/admin_list";
                } else {
                    swal(data.error,"","error");
                }
            },
            error: function(data) {
                swal(data.error,"","error");
            }
        });
        return false; // 阻止表单自动提交
    });
}

function updateCase() {

}

function updateNews() {

}

function removeNews(id) {
    swal({
        title: "确定删除吗？",
        type: "warning",
        showCancelButton: true,
        confirmButtonColor: "#DD6B55",
        confirmButtonText: "确定删除！",
        closeOnConfirm: false
    },function(){
        $.post(contextPath + "/news/remove",
            {'id':id },
            function (data) {
                if(data.error == "删除成功") {
                    window.location = contextPath + "admin_list";
                    return;
                } else {
                    swal(data.error,"","error");
                }
            }, "JSON");
    });
}

function removeCase(id) {
    swal({
        title: "确定删除吗？",
        type: "warning",
        showCancelButton: true,
        confirmButtonColor: "#DD6B55",
        confirmButtonText: "确定删除！",
        closeOnConfirm: false
    },function(){
        $.post(contextPath + "/case/remove",
            {'id':id },
            function (data) {
                if(data.error == "删除成功") {
                    window.location = contextPath + "admin_list";
                    return;
                } else {
                    swal(data.error,"","error");
                }
            }, "JSON");
    });
}