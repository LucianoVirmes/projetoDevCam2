package br.com.luciano.controller;

import java.util.List;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
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

	public List<Pessoa> lista() {

		return dao.listar();

	}

	public void adicionapessoa(Pessoa pessoa) {

		if (pessoa.getNome() == null || pessoa.getNome().length() < 3) {
			validator.add(new ValidationMessage("Nome é obrigatório e precisa ter mais de 3 letras", "pessoa.nome"));
		}
		if (pessoa.getDataNascimento() == null) {
			validator.add(new ValidationMessage("A data de nascimento é obrigatória!", "pessoa.dataNascimento"));
		}
		if (pessoa.getDataAdmissao() == null) {
			validator.add(new ValidationMessage("A data de admissão é obrigatória!", "pessoa.dataAdmissao"));
		}
		validator.onErrorRedirectTo(PessoaController.class).formulario();;
		dao.salva(pessoa);
		result.redirectTo(this).lista();
	}
}
