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

}

function updateCase() {

}

function updateNews() {

}