package br.com.luciano.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import br.com.luciano.dao.GenericDAO;

@SuppressWarnings("serial") // ignora warning do serial
@Entity
@NamedQueries({ @NamedQuery(name = Pessoa.listarTodas, query = "select p from Pessoa p") })
@Table(name = "pessoa")
public class Pessoa implements GenericDAO {

	public static final String listarTodas = "buscaPessoas";
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private Date dataNascimento;
	private Date dataAdmissao;

	// getters e setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", dataAdmissao="
				+ dataAdmissao + "]";
	}

	public Integer getCodigo() {

		return id;
	}

}
