package br.com.luciano.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriadorDeEntityManager {
	
	public EntityManager getManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("seuPU");
		EntityManager manager = factory.createEntityManager();

		return manager;
	}

	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("seuPU");
		    EntityManager manager = factory.createEntityManager();
	
		    manager.getTransaction().begin();
		return manager;
	}
}
