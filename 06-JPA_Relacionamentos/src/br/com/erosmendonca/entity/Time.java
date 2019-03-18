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
	
	@Column(name = "NM_TIME")
	private String nome;
	
	@Column(name = "DS_TITULOS")
	private int titulos;
	
	@OneToOne(mappedBy="time")
	private Tecnico tecnico;
	
	@OneToMany(mappedBy="time")
	private List<Jogador> jogadores;
}
