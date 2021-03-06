package br.com.erosmendonca.teste;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.erosmendonca.entity.TipoZoologico;
import br.com.erosmendonca.entity.Zoologico;

public class UpdateTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica =
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		// Criar um objeto zoologico com um id existente no banco
		Zoologico zoo = new Zoologico(
				1,"Zoo de santos", 20, TipoZoologico.SILVESTRE ,new Date(), 
				new Date(), Calendar.getInstance(), false, null);
		// atualizar os dados no banco de dados
		em.merge(zoo);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();

	}

}
