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
	@Column(name="NM_CAMPEONATO")
	private String nome;
	@Column(name="VL_PREMIACAO")
	private double premiacao;
	@Column(name="DS_LOCAL")
	private String local;
	
}
