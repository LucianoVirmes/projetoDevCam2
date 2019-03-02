package br.com.luciano.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Configuration;

import br.com.caelum.vraptor.Resource;
import br.com.luciano.model.Categoria;

@Resource
@Configuration
public class CategoriaTeste {

	public static void main(String[] args) {

		Categoria c = new Categoria();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("seuPU");

		EntityManager em = emf.createEntityManager();

		
		em.getTransaction().begin();
		
		c = em.find(Categoria.class, 1);
		System.out.println(c.toString());

		em.close();
		emf.close();

	}

}
