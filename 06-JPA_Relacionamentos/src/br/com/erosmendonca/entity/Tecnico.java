package br.com.erosmendonca.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_TECNICO")
@SequenceGenerator(name = "Tecnico", sequenceName = "SQ_T_TECNICO", allocationSize = 1)
public class Tecnico {
	@Id
	@Column(name = "CD_TECNICO")
	@GeneratedValue(generator = "Tecnico", strategy = GenerationType.SEQUENCE)	
	private int codigo;
	
	@Column(name = "NM_TECNICO", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@OneToOne
	@JoinColumn(name = "CD_TIME")
	private Time time;
	
	public Tecnico() {
		super();
	}

	public Tecnico(String nome, Calendar dataNascimento, Time time) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.time = time;
	}
	
	public Tecnico(int codigo, String nome, Calendar dataNascimento, Time time) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.time = time;
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

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
}
