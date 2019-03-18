package br.com.erosmendonca.dao;

import br.com.erosmendonca.excecao.CommitException;
import br.com.erosmendonca.excecao.IdNotFoundException;

public interface GenericDAO<T, K> {
	void create(T entity);
	
	void update(T entity);
	
	void delete (K id) throws IdNotFoundException;;
	
	T read(K id) throws IdNotFoundException;
	
	void commit() throws CommitException;
}
