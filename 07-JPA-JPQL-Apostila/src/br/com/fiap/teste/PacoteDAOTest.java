package br.com.fiap.teste;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;

public class PacoteDAOTest {
	@BeforeAll
	public static void iniciar() {
		EntityManager em = EntityManagerFactorySingleton.getInstance()
				.createEntityManager();
		PacoteDAO dao = new PacoteDAOImpl(em);
	}
}
