package br.com.eros.test;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.eros.dao.AnimalDAO;
import br.com.eros.dao.impl.AnimalDAOImpl;
import br.com.eros.entity.Animal;
import br.com.eros.entity.Mamifero;
import br.com.eros.entity.Reptil;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class Teste {

	private static AnimalDAO dao;

	@BeforeAll
	public static void init() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new AnimalDAOImpl(em);
	}
	
	@Test
	 void cadastrar() {
		dao.create(new Animal("Branco", "Pardal"));
		dao.create(new Mamifero("Laranja", "Tigre", 9, true));
		dao.create(new Reptil("Verde", "Camaleão", false, true));
	
	try {
		dao.commit();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
}
