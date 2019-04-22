package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
	public double sumPriceByTransporte(Transporte transporte) {		
		return em.createQuery(
				"select sum(p.preco) from Pacote p where p.transporte = :D", Double.class)
				.setParameter("D", transporte)
				.getSingleResult();
	}

}
