package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	List<Cliente> getAll();

	List<Cliente> getAllByEstado(String estado);

	List<Cliente> getPorNome(String nome);

	List<Cliente> getAllByDiasReserva(int dias);
	
	long countClientsByEstado(String estado);

	Cliente getByCpf(String cpf);

}
