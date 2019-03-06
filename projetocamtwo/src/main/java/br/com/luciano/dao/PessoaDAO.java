package br.com.luciano.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.luciano.model.Pessoa;

@Component
public class PessoaDAO extends GenericDAO<Pessoa> {

	private final Validator validator;

	public PessoaDAO(Validator validator) {

		this.validator = validator;
	}

	public void salva(Pessoa pessoa) {
		salvar(pessoa);
	}

	public Pessoa busca(Integer id) {
		conectar();

		try {
			return em.find(Pessoa.class, id);

		} catch (Exception e) {
			return null;
		} finally {
			desconectar();
		}

	}

	public void atualiza(Pessoa pessoa) {
		
		conectar();
		
		try {
			em.merge(pessoa);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		} finally {
			desconectar();
		}

	}

	public List<Pessoa> listarTodos() {
		return listar(Pessoa.listarTodas, Pessoa.class);

	}

	public void remove(Pessoa pessoa) {
		excluir(pessoa.getCodigo(), Pessoa.class);
	}

	public void valida(Pessoa pessoa) {
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		System.out.println(date);
		// se nome não for nullo e não possuir menos de 3 ou mais de 40 carácteres
		if (pessoa.getNome() == null || pessoa.getNome().length() < 3 || pessoa.getNome().length()> 40) {
			validator.add(new ValidationMessage("Nome é obrigatório e precisa ter mais de 3 letras e menos de 40!", "pessoa.nome"));
		}
		// se data não for nula  e maior que 28 carácteres (contando dias, horas e minutos, dias da semana...
				// mas na tela mostra apenas dia mes ano)
		if (pessoa.getDataNascimento() == null || pessoa.getDataNascimento().after(date)) {
			validator.add(new ValidationMessage("Preencha a data de nascimento com uma data válida!",
					"pessoa.dataNascimento"));
		}
		// se data não for nula  e maior que 28 carácteres (contando dias, horas e minutos, dias da semana...
				// mas na tela mostra apenas dia mes ano)
		if (pessoa.getDataAdmissao() == null || pessoa.getDataAdmissao().after(date)) {
			validator.add(
					new ValidationMessage("Preencha a data de admissão com uma data válida!", "pessoa.dataAdmissao"));
		}
	}
}
