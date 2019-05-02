package br.com.eros.dao;

import br.com.eros.exception.CommitException;
import br.com.eros.exception.IdNotFoundException;

public interface GenericDAO<T, K> {

	void create(T entity);
	
	T read(K id) throws IdNotFoundException;
	
	void update(T entity);
	
	void delete(K id) throws IdNotFoundException;
	
	void commit() throws CommitException;
}
