var roomApp = (function(){

	var isCharacterSelected = false;

	function getReady() {
		if ($("#inputName").val() == null || ($("#inputName").val()).length == 0) {
			alert("Debe ingresar un nombre");
		}
		else if (isCharacterSelected == false) {
			alert("Debe seleccionar un ávatar");
		}
		else {
			// Redirect
		}
	}

	return {
		getReady: getReady
	};

})();