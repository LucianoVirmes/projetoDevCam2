package br.com.luciano.dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.luciano.model.Pessoa;

@Component
public class PessoaDAO {

	private final EntityManager entityManager;
	private final Validator validator;

	public PessoaDAO(EntityManager entityManager, Validator validator) {
		this.entityManager = entityManager;
		this.validator = validator;
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
		entityManager.getTransaction().commit();
	}

	public List<Pessoa> listar() {
		List<Pessoa> lista = entityManager.createQuery("select e from Pessoa e", Pessoa.class).getResultList();
		return lista;
	}

	public void remove(Pessoa pessoa) {
		entityManager.remove(pessoa);
		entityManager.getTransaction().commit();
	}

	public void valida(Pessoa pessoa) {
		if (pessoa.getNome() == null || pessoa.getNome().length() < 3) {
			validator.add(new ValidationMessage("Nome é obrigatório e precisa ter mais de 3 letras", "pessoa.nome"));
		}
		if (pessoa.getDataNascimento() == null || pessoa.getDataNascimento().toString().length() > 28 ) {
			validator.add(new ValidationMessage("Preencha a data de nascimento com uma data válida!", "pessoa.dataNascimento"));
		}
		if (pessoa.getDataAdmissao() == null || pessoa.getDataAdmissao().toString().length() > 28) {
			validator.add(new ValidationMessage("Preencha a data de admissão com uma data válida!!", "pessoa.dataAdmissao"));
		}
		System.out.println();
		System.out.println();
	}
}
