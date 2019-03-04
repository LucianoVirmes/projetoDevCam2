package br.com.luciano.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.luciano.model.Pessoa;

@Component
public class PessoaDAO {

	private final EntityManager entityManager;

	public PessoaDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void salva(Pessoa pessoa) {

		entityManager.persist(pessoa);
		entityManager.getTransaction().commit();
	}

	public Pessoa busca(Integer id) {
		Pessoa p = new Pessoa();
		p = entityManager.find(Pessoa.class, id);
		return p;
	}
	public void atualiza(Pessoa pessoa) {
		entityManager.merge(pessoa);
		entityManager.getTransaction().commit();;
	}
	public List<Pessoa> listar() {

		List<Pessoa> lista = entityManager.createQuery("select e from Pessoa e", Pessoa.class).getResultList();
		return lista;
	}

	public void remove(Pessoa pessoa) {
		entityManager.remove(pessoa);
		entityManager.getTransaction().commit();
	}
}
