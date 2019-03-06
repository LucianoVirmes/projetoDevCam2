package br.com.luciano.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import br.com.caelum.vraptor.ioc.RequestScoped;

@RequestScoped
public abstract class GenericDAO<T extends AbstractFactory> {

	protected EntityManagerFactory emf;

	protected EntityManager em;

	public GenericDAO() {
	}

	public List<T> listar(String query, Class<T> classe) {
		conectar();
		try {
			return em.createNamedQuery(query, classe).getResultList();
		} finally {
			desconectar();
		}
	}

	public boolean excluir(Integer codigo, Class<T> classe) {
		conectar();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			T objeto = em.find(classe, codigo);
			if (objeto != null) {
				em.remove(objeto);
			}
			et.commit();
		} catch (Exception e) {
			et.rollback();
			return false;
		} finally {
			desconectar();
		}
		return true;
	}

	public boolean salvar(T objeto) {
		conectar();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			if (objeto.getCodigo() == null) {
				em.persist(objeto);
			} else {
				em.merge(objeto);
			}
			et.commit();
		} catch (Exception e) {
			et.rollback();
			return false;
		} finally {
			desconectar();
		}
		return true;
	}

	protected void conectar() {
		emf = Persistence.createEntityManagerFactory("seuPU");
		em = emf.createEntityManager();
	}

	protected void desconectar() {
		em.close();
		emf.close();
	}

}