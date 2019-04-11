package br.com.fiap.teste;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Reserva;

class ClienteDAOTest {

private static ClienteDAO dao;
	
	@BeforeAll
	public static void instanciar() {
		EntityManager em = EntityManagerFactorySingleton
			.getInstance().createEntityManager();
		dao = new ClienteDAOImpl(em);
	}
	
	@Test
	void listar() {
		List<Cliente> lista = dao.getAll();
		assertNotEquals(0, lista.size());
	}

	@Test
	void buscarPorDias() {
		List<Cliente> lista = dao.getAllByDiasReserva(10);
		assertEquals(2, lista.size());
	}
	
	@Test
	void BuscarPorNome() {
		List<Cliente> cli = dao.getPorNome("Th");
		assertNotEquals(0, cli.size());
		for (Cliente cliente : cli)
			assertTrue(cliente.getNome().contains("Th"));
	}

	@Test
	void BuscarPorEstado() {
		List<Cliente> lista = dao.getAllByEstado("SP");
		assertNotEquals(0, lista.size());
		for (Cliente cliente : lista) 
			assertTrue(cliente.getEndereco().getCidade().getUf().contains("SP"));		
	}
}
