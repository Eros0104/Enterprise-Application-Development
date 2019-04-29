package br.com.eros.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity(name="T_PACIENTE")
public class Paciente implements Serializable{
	@Column(name="CD_PACIENTE")
	private int codigo;
	@Column(name="NM_PACIENTE")
	private String nome;
	@Column(name="DS_EXERCICIO")
	private String Endereco;
	public Paciente(int codigo, String nome, String endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		Endereco = endereco;
	}
	public Paciente() {
		super();
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}	
}
