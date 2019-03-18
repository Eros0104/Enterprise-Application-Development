package br.com.erosmendonca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_JOGADOR")
@SequenceGenerator(name = "Jogador", sequenceName="SQ_T_JOGADOR", allocationSize = 1)
public class Jogador {
	@Id
	@Column(name = "CD_CODIGO")
	@GeneratedValue(generator = "Jogador", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "NM_JOGADOR")
	private String nome;
	
	@Column(name = "DS_POSICAO")
	@Enumerated(EnumType.STRING)
	private Posicao posicao;
	
	@ManyToOne
	@JoinColumn(name = "CD_TIME")
	private Time time;
}
