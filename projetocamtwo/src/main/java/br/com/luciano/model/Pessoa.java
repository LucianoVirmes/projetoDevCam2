package br.com.luciano.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa {
	@Id
	@GeneratedValue
	Long ID;
	String nome;
	Date dataNascimento;
	Date dataAdmição;

	// getters e setters
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
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

	public Date getDataAdmição() {
		return dataAdmição;
	}

	public void setDataAdmição(Date dataAdmição) {
		this.dataAdmição = dataAdmição;
	}

}
