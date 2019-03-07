package br.com.fiap.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import br.com.fiap.dao.CustomerDAO;
import br.com.fiap.dao.impl.CustomerDAOImpl;
import br.com.fiap.entity.Customer;
import br.com.fiap.entity.Gender;
import br.com.fiap.excecao.CommitException;

class CustomerDAOTest {

	@Test
	void createTest() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("teste");
		EntityManager em = fabrica.createEntityManager();

		CustomerDAO dao = new CustomerDAOImpl(em);
		Customer c = new Customer("teste", 
				new GregorianCalendar(1999, Calendar.APRIL, 01), Gender.OTHER, null);

		// Act: cadastrar cliente
		try {
			dao.create(c);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no teste...");
		}

		// Assert: validar o resultado
		assertNotEquals(c.getId(), 0);
	}

}
