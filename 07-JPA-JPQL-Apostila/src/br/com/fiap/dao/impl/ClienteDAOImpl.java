package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
	@Override
	public List<Cliente> getAll(){
		return em.createQuery("from Cliente c", Cliente.class).getResultList();
	}
	
	@Override
	public List<Cliente> getPorNome(String nome) {
		return em.createQuery(
				"from Cliente c where c.nome like :name", Cliente.class)
				.setParameter("name", "%"+nome+"%")
				.getResultList();				
	}
	
	@Override
	public List<Cliente> getAllByEstado(String estado){
		return em.createQuery(
				"from Cliente c where c.endereco.cidade.uf = :P", Cliente.class)
				.setParameter("P", estado)
				.getResultList();
				
	}
	
	@Override
	public List<Cliente> getAllByDiasReserva(int dias){
		return em.createQuery("select r.cliente from Reserva r where r.numeroDias = :d",Cliente.class)
				.setParameter("d", dias)
				.getResultList();
	}

}
