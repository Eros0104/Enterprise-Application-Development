package br.com.erosmendonca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CAMPEONATO")
@SequenceGenerator(name = "Campeonato", sequenceName="SQ_T_CAMPEONATO", allocationSize = 1)
public class Campeonato {
	@Id
	@Column(name="CD_CAMPEONATO")
	@GeneratedValue(generator = "Campeonato", strategy = GenerationType.SEQUENCE)
	private int codigo;
	@Column(name="NM_CAMPEONATO", nullable=false, length=100)
	private String nome;
	@Column(name="VL_PREMIACAO")
	private double premiacao;
	@Column(name="DS_LOCAL")
	private String local;	
	public Campeonato() {
		super();
	}
	public Campeonato(String nome, double premiacao, String local) {
		super();
		this.nome = nome;
		this.premiacao = premiacao;
		this.local = local;
	}
	public Campeonato(int codigo, String nome, double premiacao, String local) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.premiacao = premiacao;
		this.local = local;
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
	public double getPremiacao() {
		return premiacao;
	}
	public void setPremiacao(double premiacao) {
		this.premiacao = premiacao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
}
