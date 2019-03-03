import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.luciano.dao.PessoaDAO;
import br.com.luciano.infra.CriadorDeEntityManager;
import br.com.luciano.infra.CriadorDeEntityManagerFactory;
import br.com.luciano.model.Pessoa;

public class Main {

	public static void main(String[] args) {
	
		EntityManagerFactory factory = new CriadorDeEntityManagerFactory().getInstance();

		EntityManager em = new CriadorDeEntityManager(factory).getInstance();

		PessoaDAO p = new PessoaDAO(em);
		
		
		List<Pessoa> pessoa = p.listar();
		
		for(Pessoa e: pessoa) {
			System.out.println(e.getNome());
		}
		
	}

}
