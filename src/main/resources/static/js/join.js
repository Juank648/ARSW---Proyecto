var joinApi = (function() {

	const PATH = "/project/";

	function _checkCodeValidity(code) {
		console.log("Entra a checkCode");
		if (code == "") {
			console.log("    Entra al primer if");
			$("#msg-warning").text("Inserte un código");
			return false;
		}
		let value = parseInt(code);
		if (Number.isInteger(value)) {
			console.log("    Entra al segundo if");
			$("#msg-warning").text(" ");
			return true;
		}
		else {
			console.log("    Entra al else");
			$("#msg-warning").text("El código debe ser un número de 6 dígitos");
			return false;
		}
	}

	function _getRoomName(code) {
		var promise = $.get(PATH+"room/"+code);
		promise.then(
			function(data) {
				alert("Se ha unido a la sala "+data);
				window.location = "waitingRoom.html";
			},
			function() {
				alert("No ha sido posible conectarse a la sala")
			}
		);
	}

	function joinWithCode(code){
		if (_checkCodeValidity(code)) {
			alert("Se unirá con el código: "+code);
			_getRoomName(code);
		}
	}

	return {
		joinWithCode: joinWithCode
	}

})();