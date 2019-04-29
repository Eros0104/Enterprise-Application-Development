package br.com.eros.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table
@Entity(name="T_CONSULTA")
@IdClass(ConsultaPK.class)
public class Consulta implements Serializable{
	@Column(name="NR_CRM")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private int crm;
	@Column(name="CD_PACIENTE")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private int codigoPaciente;
	@Column(name="DT_CONSULTA")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataConsulta;
	@Column(name="VL_CONSULTA")
	private double valor;
	@Column(name="ST_CONVENIO")
	private boolean convenio;
	
	public Consulta() {
		super();
	}
	public Consulta(int crm, int codigoPaciente, Calendar dataConsulta, double valor, boolean convenio) {
		super();
		this.crm = crm;
		this.codigoPaciente = codigoPaciente;
		this.dataConsulta = dataConsulta;
		this.valor = valor;
		this.convenio = convenio;
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public int getCodigoPaciente() {
		return codigoPaciente;
	}
	public void setCodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}
	public Calendar getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Calendar dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isConvenio() {
		return convenio;
	}
	public void setConvenio(boolean convenio) {
		this.convenio = convenio;
	}	
}
