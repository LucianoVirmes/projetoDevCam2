package br.com.luciano.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.luciano.dao.PessoaDAO;
import br.com.luciano.model.Pessoa;

@Resource
public class PessoaController {

	private PessoaDAO dao;
	private Result result;
	private Validator validator;

	public PessoaController(PessoaDAO dao, Result result, Validator validator) {
		this.dao = dao;
		this.result = result;
		this.validator = validator;
	}

	public void formulario() {

	}
	@Post
	public void altera(Pessoa pessoa) {
		dao.valida(pessoa);
		validator.onErrorRedirectTo(this).edita(pessoa.getId());
		dao.atualiza(pessoa);
		result.redirectTo(this).lista();
	}

	@Get
	public List<Pessoa> lista() {

		return dao.listar();

	}
	@Post
	public void adicionapessoa(Pessoa pessoa) {
		// valida os dados que o usuário digitar
		dao.valida(pessoa);
		validator.onErrorRedirectTo(this).formulario();
		// se passar do validador salva

		dao.salva(pessoa);
		result.redirectTo(this).lista();
	}
	
	public void remove(Integer id) {
		Pessoa pessoa = dao.busca(id);
		dao.remove(pessoa);
		result.nothing();
	}

	public Pessoa edita(Integer id) {

		return dao.busca(id);

	}
}
