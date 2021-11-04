var appAPI = ( function () {

    return {
        getUsers: function () {
            apiclientAPI.getAllUsersAPI(function (error,data){
                console.log(data);
                console.log("Datos Obtenidos");
            })
        }
    }
})