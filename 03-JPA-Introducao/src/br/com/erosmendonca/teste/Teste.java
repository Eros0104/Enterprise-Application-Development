package br.com.erosmendonca.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
	public static void main(String[] args) {
		//Criar um gerenciador de entidades (Entity Manager)
		//Primeiro criar a fabrica de entity manager
		EntityManagerFactory fabrica =
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		//Depois, a fabrica cria o entity manager
		EntityManager em = fabrica.createEntityManager();
		
		em.close();
		fabrica.close();		
	}
}
