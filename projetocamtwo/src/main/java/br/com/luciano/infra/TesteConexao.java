package br.com.luciano.infra;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import br.com.caelum.vraptor.Resource;
import br.com.luciano.model.Pessoa;

@Resource
public class TesteConexao {

	public static void main(String[] args) {


		Pessoa pessoa = new Pessoa();
		Date data = new Date();
		pessoa.setNome("Luciano");
		pessoa.setDataAdmissao(data);
		
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("seuPU");
		    EntityManager manager = factory.createEntityManager();

		    manager.getTransaction().begin();        
		    manager.persist(pessoa);
		    manager.getTransaction().commit();    

		manager.close();

	}

}