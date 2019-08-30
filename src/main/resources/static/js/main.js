// 表单提交
function submit_form() {
    let name = $(":input[name='name']").val()
    let age = $(":input[name='age']").val()
    if (name === "" || age === "") {
        alert("名字或年龄未输入")
        return false
    }
    return true
}


//编辑
function edit(uuid, name, age) {
    $("#myModal").modal('show');
    $(":input[name='uuid']").val(uuid)
    $(":input[name='name']").val(name)
    $(":input[name='age']").val(age)
}

//注册
function register(uuid, name, age) {
    $("#myModal").modal('show');
    $(":input[name='uuid']").val(uuid)
    $(":input[name='name']").val(name)
    $(":input[name='age']").val(age)
}



