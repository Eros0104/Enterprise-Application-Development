package br.com.eros.dao;

public interface GenericDAO<T, K> {
	void create (T entity);
	T read(K id);
	void update (T entity);
	void delete (K id);
	void commit();
	
}
