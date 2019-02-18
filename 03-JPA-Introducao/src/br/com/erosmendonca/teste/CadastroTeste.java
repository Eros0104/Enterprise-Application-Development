package br.com.erosmendonca.teste;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.erosmendonca.entity.TipoZoologico;
import br.com.erosmendonca.entity.Zoologico;

public class CadastroTeste {
	public static void main(String[] args) {
		//Criar um gerenciador de entidades (Entity Manager)
		//Primeiro criar a fabrica de entity manager
		EntityManagerFactory fabrica =
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		//Depois, a fabrica cria o entity manager
		EntityManager em = fabrica.createEntityManager();
		//Cadastrar um zoo
		Zoologico zoo = new Zoologico(
				"Zoo", 10,TipoZoologico.SILVESTRE, new Date(), 
				new Date(), Calendar.getInstance(), false, null
				);
		
		em.persist(zoo);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();		
	}
}
