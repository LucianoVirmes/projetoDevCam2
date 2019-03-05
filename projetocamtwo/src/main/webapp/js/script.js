function remover(id) {
    $.get('remove?id=' + id, function() {
    	$('#pessoa-' + id).hide();
    	alert('Pessoa removida com sucesso!');
        
    });
}