package br.com.luciano.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.luciano.model.Pessoa;

public class AdicaoDePessoa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		Date data = formato.parse("23/11/2018");
		Date data1 = formato.parse("23/11/2018");
		Pessoa pessoa = criaPessoa("Luciano", data, data1);

		new PessoaDAO().salva(pessoa);

	}

	private static Pessoa criaPessoa(String nome, Date dataAdmissao, Date dataNascimento) {
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setDataAdmissao(dataAdmissao);
		p.setDataNascimento(dataNascimento);
		return p;
	}

}
