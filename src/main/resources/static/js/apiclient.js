var apiclient = (function () {
    return {
        getAllUsers: function (callback) {
            $.get(
                {
                    url: "/project/",
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