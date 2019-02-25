package br.com.eros.dao;

import br.com.eros.entity.Veiculo;

public interface VeiculoDAO {
	void cadastrar (Veiculo veiculo);
	
	Veiculo consultar (int codigo);
	
	void atualizar (Veiculo veiculo);
	
	void remover (int codigo);
	
	void commit();
}
