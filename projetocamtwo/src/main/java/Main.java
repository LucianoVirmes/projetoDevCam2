import java.util.List;

import br.com.luciano.dao.AbstractFactory;
import br.com.luciano.dao.PessoaDAO;
import br.com.luciano.model.Pessoa;

public class Main {

	public static void main(String[] args) {
	
		
		PessoaDAO p = new PessoaDAO();
		
		
		List<Pessoa> pessoa = p.listar();
		
		for(Pessoa e: pessoa) {
			System.out.println(e.getNome());
		}
		
	}

}
