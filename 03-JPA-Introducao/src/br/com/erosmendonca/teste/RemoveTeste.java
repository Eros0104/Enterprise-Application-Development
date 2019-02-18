package br.com.erosmendonca.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.erosmendonca.entity.Zoologico;

public class RemoveTeste {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = factory.createEntityManager();
		
		Zoologico zoo = em.find(Zoologico.class, 1);
		em.remove(zoo);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}

}
