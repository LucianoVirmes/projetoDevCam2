package br.com.luciano.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public class Pessoa {
	@Id
	@GeneratedValue
	private Integer ID;
	private String nome;
	private Date dataNascimento;
	private Date dataAdmissao;

	// getters e setters
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
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
		return "Pessoa [ID=" + ID + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", dataAdmissao="
				+ dataAdmissao + "]";
	}

}
