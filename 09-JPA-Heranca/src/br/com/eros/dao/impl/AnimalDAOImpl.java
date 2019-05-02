package br.com.eros.dao.impl;

import javax.persistence.EntityManager;

import br.com.eros.dao.AnimalDAO;
import br.com.eros.entity.Animal;

public class AnimalDAOImpl extends GenericDAOImpl<Animal, Integer> implements AnimalDAO {
	public AnimalDAOImpl(EntityManager em) {
		super(em);
	}
}
