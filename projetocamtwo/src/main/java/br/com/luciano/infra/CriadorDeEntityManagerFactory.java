package br.com.luciano.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
@ApplicationScoped //ser� criado uma �nica vez na aplica��o
public class CriadorDeEntityManagerFactory implements ComponentFactory<EntityManagerFactory> {
	 
	private EntityManagerFactory factory;
	
	@PostConstruct //assim que esse escopo for iniciado, esse m�todo ser� iniciado (ou seja, uma vez na aplica��o)
	public EntityManagerFactory getInstance() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("seuPU");
		return factory;

	}
	  @PreDestroy // m�todo executado assim que o escopo for finalizado
	  public void fecha() {
		  this.factory.close();
	  }
}
