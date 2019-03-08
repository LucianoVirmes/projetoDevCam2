package br.com.luciano.controller;

import java.util.List;
import java.util.Random;

import br.com.caelum.vraptor.view.Results;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.luciano.dao.PessoaDAO;
import br.com.luciano.model.Pessoa;

@Resource
public class SorteioController {
	PessoaDAO dao;
	Result result;

	public SorteioController(Result result, PessoaDAO dao) {
		this.dao = dao;
		this.result = result;
	}

	public Pessoa sorteio() {
		List<Pessoa> dados = dao.listarTodos();
		Random random = new Random();
		int index = random.nextInt(dados.size());
		return dados.get(index);

	}

	@Post("sorteio/sortear/chamaSorteio")
	public void listPessoas() {

		if (dao.listarTodos().size() > 0) {

			result.use(Results.json()).withoutRoot().from(sorteio()).exclude("id", "dataNascimento", "dataAdmissao")
					.serialize();
		}
	}

	@Get("sorteio/sortear")
	public void sortear() {

	}

}
