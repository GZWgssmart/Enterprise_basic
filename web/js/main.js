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
        swal("名称不能为空！", "","error");
        return;
    }
    if(password == null || password.trim() == "") {
        swal("密码不能为空！", "","error")
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
            $("#error").text(data.error);
        }, "JSON");
}