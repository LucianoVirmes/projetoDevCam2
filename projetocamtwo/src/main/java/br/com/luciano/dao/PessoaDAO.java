package br.com.luciano.dao;

import java.util.List;

import br.com.luciano.model.Pessoa;

public interface PessoaDAO extends GenericDAO<Pessoa> {

	List<Pessoa> listaPessoas();

	void demitir(Pessoa dado);

}
