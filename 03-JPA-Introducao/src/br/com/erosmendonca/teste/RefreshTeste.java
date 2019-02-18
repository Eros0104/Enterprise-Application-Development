package br.com.erosmendonca.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.erosmendonca.entity.Zoologico;

public class RefreshTeste {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = factory.createEntityManager();
				
		// Pesquisar um zoo
		Zoologico zoo = em.find(Zoologico.class, 1);
		// Exibir o nome 
		System.out.println("Nome do zoo: " + zoo.getNome());
		//Trocar o nome no java e exibir
		zoo.setNome("Zoo do caralho");
		System.out.println(zoo.getNome());
		//Fazer o refresh
		em.refresh(zoo);
		//Exibir o nome
		System.out.println(zoo.getNome());
		
		em.close();
		factory.close();

	}

}
