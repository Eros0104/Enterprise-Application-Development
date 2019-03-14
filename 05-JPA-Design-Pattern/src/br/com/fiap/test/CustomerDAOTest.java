package br.com.fiap.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.CustomerDAO;
import br.com.fiap.dao.impl.CustomerDAOImpl;
import br.com.fiap.entity.Customer;
import br.com.fiap.entity.Gender;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.SearchNotFoundException;

class CustomerDAOTest {

	private static CustomerDAO dao;
	private Customer customer;

	@BeforeAll
	static void init() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("teste");
		EntityManager em = fabrica.createEntityManager();
		dao = new CustomerDAOImpl(em);
	}

	@BeforeEach
	void beforeTest() {
		// Arrange: instanciar os objetos
		customer = new Customer("teste", new GregorianCalendar(1999, Calendar.APRIL, 01), Gender.OTHER, null);
	}

	@Test
	@DisplayName("Teste de criação com sucesso ")
	void createTest() {
		// Act: cadastrar cliente
		try {
			dao.create(customer);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no teste...");
		}
		// Assert: validar o resultado
		assertNotEquals(customer.getId(), 0);
	}

	@Test
	@DisplayName("Teste de atualização com sucesso")
	void update() {
		// cadastrar
		try {
			dao.create(customer);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no teste");
		}
		// alterar dado
		customer.setName("teste2");
		// update
		try {
			dao.update(customer);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("falha no teste");
		} catch (SearchNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("falha no teste");
		}
	}

	@Test
	@DisplayName("Teste de remoção com sucesso")
	void remove() {
		// cadastrar o customer
		try {
			dao.create(customer);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no teste");
		}
		// remover customer
		try {
			dao.delete(customer.getId());
			dao.commit();
		} catch (SearchNotFoundException | CommitException e) {
			e.printStackTrace();
			fail("Deu ruim");
		}
		// pesquisar o customer que foi removido
		Customer search = null;
		try {
			search = dao.read(customer.getId());
			fail("falha no teste");
		} catch (SearchNotFoundException e) {
			// Sucesso
			assertNull(search);
		}
	}
}
