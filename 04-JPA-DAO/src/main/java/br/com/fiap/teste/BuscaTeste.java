package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ImovelDAO;
import br.com.fiap.dao.impl.ImovelDAOImpl;
import br.com.fiap.entity.Imovel;

public class BuscaTeste {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = factory.createEntityManager();
		
		ImovelDAO dao = new ImovelDAOImpl(em);
		
		// Pesquisar um imóvel		
		Imovel imovel = dao.consultar(1);
		
		//Exibir alguns dados
		System.out.println("Logradouro: " + imovel.getLogradouro());
		System.out.println("Área: " + imovel.getArea());
		
		em.close();
		factory.close();
	}
}
