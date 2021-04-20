$(document).ready(function () {
    $("#task1").click(function () {
        $.ajax({
            url:"http://127.0.0.1:8080/api/project/task/all",
            type: "GET",
            dataType: "json",
            success: function (response) {
                console.log(response);

            },
            error: function (response){
                console.log("ОШИБКА ОШИБКА ОШИБКА", response);

            }
        });

    });
    $("#createTask").click(async function (){
        let varData = {
            "title": "Machine learning",
            "body": "fdxgchvjhbkjlnkdcblds"
        };
        let response = await fetch ("http://localhost:8080/api/project/tasks", {
            method: "POST",
            headers: {
                "Content-Type": "application/json;charset=utf-8"
            },
            body: JSON.stringify(varData)
        });
        console.log(response)
    });



})