package br.com.fiap.dao;

import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.SearchNotFoundException;

public interface GenericDAO<Table,Key> {
	
	void create(Table t);
	
	Table read(Key key) throws SearchNotFoundException;
	
	void update(Table t) throws SearchNotFoundException;
	
	void delete(Key key) throws SearchNotFoundException;
	
	void commit() throws CommitException;
}
