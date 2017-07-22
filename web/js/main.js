var contextPath = "";

function checkFile(name, index, type, size) {
    var file = document.getElementsByName(name)[index].files[0];
    if (file != undefined) {
        var fileName = file.name;
        var fileType = fileName.substring(fileName.lastIndexOf('.'), fileName.length);
        var maxSize = size * 1024 * 1024;
        if (file.size >= maxSize) {
            swal("文件大小最大为" + size + "MB", "", "warning");
            return false;
        }
        if (type.indexOf(fileType.toLocaleLowerCase()) < 0) {
            swal("文件后缀只能为" + type, "", "warning");
            return false;
        }
    }
    return true;
}

function login() {
    var name = $("#name").val();
    var password = $("#password").val();
    if(name == null || name.trim() == "") {
        swal("登录名不能为空！", "","error");
        return;
    }
    if(password == null || password.trim() == "") {
        swal("密码不能为空！", "","error");
        return;
    }
    $.post(contextPath + "/admin/login",
        $("#login").serialize(),
        function (data) {
            if(data.error == "登录成功") {
                window.location = contextPath + "../news/admin_list";
                return;
            } else {
                swal(data.error,"","error");
            }
        }, "JSON");
}

function updatePwd() {
    var password = $("#password").val();
    var newPwd = $("#newPwd").val();
    var pwdConfirm = $("#pwdConfirm").val();
    if(password == null || password.trim() == "") {
        swal("原密码不能为空！", "","error");
        return;
    }
    if(newPwd == null || newPwd.trim() == "") {
        swal("新密码不能为空！", "","error");
        return;
    }
    if(pwdConfirm == null || pwdConfirm.trim() == "") {
        swal("确认密码不能为空！", "","error");
        return;
    }
    if(pwdConfirm.toString().length < 6 || pwdConfirm.toString().length > 16){
        swal("密码范围只能在6-16位之间！", "","error");
        return;
    }
    if(newPwd != pwdConfirm) {
        swal("两次密码输入不一致！", "","error");
        return;
    }
    swal({
        title: "确定修改吗？",
        text: "修改后须使用新密码登录！请牢记新密码~",
        type: "warning",
        showCancelButton: true,
        confirmButtonColor: "#DD6B55",
        confirmButtonText: "确定修改！",
        closeOnConfirm: false
    },function(){
        $.post(contextPath + "/admin/update_pwd",
            $("#update").serialize(),
            function (data) {
                if(data.error == "修改成功") {
                    window.location = contextPath + "login_page";
                    return;
                } else {
                    swal(data.error,"","error");
                }
            }, "JSON");
    });
}