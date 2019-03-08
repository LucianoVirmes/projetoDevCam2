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
