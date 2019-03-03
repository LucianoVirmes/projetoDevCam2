package br.com.luciano.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.luciano.dao.PessoaDAO;
import br.com.luciano.model.Pessoa;

@Resource
public class IndexController {
	
	PessoaDAO dao = new PessoaDAO();
	@Get("/")
	public String index() {
		return "ola";
	}
	

}