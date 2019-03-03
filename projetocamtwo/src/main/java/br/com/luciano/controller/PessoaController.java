package br.com.luciano.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.luciano.dao.PessoaDAO;
import br.com.luciano.model.Pessoa;

@Resource
public class PessoaController {

	private  PessoaDAO dao;
	private  Result result;
	public PessoaController(PessoaDAO dao, Result result) {
		this.dao = dao;
		this.result = result;
	}
	public void formulario() {
		
	}
	
	public List<Pessoa> lista() {
		
		return dao.listar();
		
	}
	
	public void adicionapessoa(Pessoa pessoa) {
		dao.salva(pessoa);
		result.redirectTo(this).lista();
	}

}
