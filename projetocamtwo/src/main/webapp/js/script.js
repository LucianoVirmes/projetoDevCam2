// ajax para remover pessoa
function remover(id) {
    // método get que recebe o id da pessoa
    $.get('/vraptor03/pessoa/lista/remocao/' + id, function() {
        // coloca a pessoa como hide ao remover.
        $('#pessoa-' + id).hide();
    	alert('Pessoa removida com sucesso!');
        
    });


}