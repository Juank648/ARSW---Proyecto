var app = ( function () {

    return {
        getUsers: function () {
            apiclient.getAllUsers(function (error,data){
                console.log(data);
                console.log("Datos Obtenidos");
            })
        }
    }
})