package br.com.erosmendonca.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_TIME")
@SequenceGenerator(name = "Time", allocationSize = 1, sequenceName="SQ_T_TIME")	
public class Time {
	@Id
	@Column(name = "CD_TIME")
	@GeneratedValue(generator = "Time", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "NM_TIME", nullable=false, length=100)
	private String nome;
	
	@Column(name = "DS_TITULOS")
	private int titulos;
	
	@OneToOne(mappedBy="time")
	private Tecnico tecnico;
	
	@OneToMany(mappedBy="time")
	private List<Jogador> jogadores;	

	public Time() {
		super();
	}	

	public Time(String nome, int titulos, Tecnico tecnico, List<Jogador> jogadores) {
		super();
		this.nome = nome;
		this.titulos = titulos;
		this.tecnico = tecnico;
		this.jogadores = jogadores;
	}

	public Time(int codigo, String nome, int titulos, Tecnico tecnico, List<Jogador> jogadores) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.titulos = titulos;
		this.tecnico = tecnico;
		this.jogadores = jogadores;
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

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	
}
