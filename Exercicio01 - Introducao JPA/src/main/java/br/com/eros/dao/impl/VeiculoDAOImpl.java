package br.com.eros.dao.impl;

import javax.persistence.EntityManager;

import br.com.eros.entity.Veiculo;

public class VeiculoDAOImpl {
	private EntityManager em;

	public VeiculoDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public void cadastrar(Veiculo veiculo) {
		em.persist(veiculo);
	}

	public Veiculo consultar(int codigo) {
		return em.find(Veiculo.class, codigo);
	}

	public void atualizar(Veiculo veiculo) {
		em.merge(veiculo);
	}

	public void remover(int codigo) {
		Veiculo veiculo = consultar(codigo);
		em.remove(veiculo);
	}

	public void commit() {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}		
	}
}
