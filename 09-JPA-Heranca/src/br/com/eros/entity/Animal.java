package br.com.eros.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DS_TIPO")
@DiscriminatorValue("Animal")
@Entity
@Table(name="T_ANIMAL")
@SequenceGenerator(name="animal", sequenceName="SQ_T_ANIMAL",allocationSize=1)
public class Animal {
	@Id
	@Column(name="CD_ANIMAL")
	@GeneratedValue(generator="animal", strategy=GenerationType.SEQUENCE)
	private int codigo;
	@Column(name="DS_COR")
	private String cor;
	@Column(name="NM_ANIMAL")
	private String nome;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Animal() {
		super();
	}
	public Animal(String cor, String nome) {
		super();
		this.cor = cor;
		this.nome = nome;
	}
}
