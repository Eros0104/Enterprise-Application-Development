package br.com.erosmendonca.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.erosmendonca.entity.Zoologico;

public class ReadTeste {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar um zoologico de id = 1
		Zoologico zoo = em.find(Zoologico.class, 1);
		System.out.println(zoo.getNome());
		
		
		//alterar o nome do zoo
		zoo.setNome("Zoo Bauru");
		
		//fazer commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}
}
