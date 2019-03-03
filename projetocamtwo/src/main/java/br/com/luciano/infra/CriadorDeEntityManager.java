package br.com.luciano.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import br.com.caelum.vraptor.ioc.RequestScoped;

@Component
@RequestScoped
public class CriadorDeEntityManager implements ComponentFactory<EntityManager> {

	private EntityManagerFactory factory;
	   private EntityManager em;
	 
	public CriadorDeEntityManager(EntityManagerFactory factory) {
		this.factory = factory;
	}
	
	@PostConstruct
	   public void abre() {
	     this.em = factory.createEntityManager();
	     em.getTransaction().begin();
	   }
	   public EntityManager getInstance() {
	     return this.em;
	   }
	   @PreDestroy
	   public void fecha() {
	     this.em.close();
	   }
	
}
