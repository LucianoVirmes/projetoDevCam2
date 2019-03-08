function remover(id) {
	// método get que recebe o id da pessoa
	$.get('/vraptor03/pessoa/lista/remocao/' + id, function() {
		// coloca a pessoa como hide ao remover.
		$('#pessoa-' + id).hide();
		alert('Pessoa removida com sucesso!');

	});

}

function sortear() {
	$.ajax({
		method : "post",
		url : "/vraptor03/sorteio/sortear/chamaSorteio", // Url para acessar
		// a ação

		success : function(retorno) { // Se não houve erro, alterar o texto
			// escrito no elemento 'paragrafo'
			var pessoa = JSON.parse(JSON.stringify(retorno));
			$('#divTextoSorteio').html("");
			$('#divTextoSorteio').append(pessoa.nome);
		},
		error : function() {
			alert("Não há pessoas cadastradas!")
		}
	});
}