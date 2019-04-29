package br.com.eros.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity(name="T_MEDICO")
@SequenceGenerator(name="medico", allocationSize=1, sequenceName="SQ_T_MEDICO")
public class Medico implements Serializable{
	@Id
	@GeneratedValue(generator="medico", strategy=GenerationType.SEQUENCE)
	@Column(name="NR_CRM")
	private int crm;
	@Column(name="NM_MEDICO")
	private String nome;
	@Column(name="DS_ESPECIALIDADE")
	private String especialidade;
	public Medico(int crm, String nome, String especialidade) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.especialidade = especialidade;
	}
	public Medico() {
		super();
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
