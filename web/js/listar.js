$(document).ready(function (idPet){   
    let urlBusca = `${window.location.origin}/jsonPet/listar`;
    $.getJSON(urlBusca, function(response){
        if (response !== null || response !== undefined) {
            var listaPet = response;
            console.log(listaPet);
        } else {
        }
    });
    $.post("listarPet", {idPet:idPet});
});


