var apiclientAPI = (function () {
    return {
        getAllUsersAPI: function (callback) {
            console.log("Entra a apiclient")
            $.get(
                {
                    url: "/project/users/",
                    contentType: "application/json",
                }
                , function (data){
                    console.log("Obtencion de datos")
                    console.log(data);
                    callback(null, data);
                }).fail(function (error) {
                    alert("No existen los datos")
                }
            );

        }
    }
})