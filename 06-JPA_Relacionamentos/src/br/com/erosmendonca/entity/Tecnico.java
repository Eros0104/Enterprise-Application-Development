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
	
	@Column(name = "NM_TECNICO")
	private String nome;
	
	@Column(name = "DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@OneToOne
	@JoinColumn(name = "CD_TIME")
	private Time time;
}
