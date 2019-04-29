package br.com.eros.entity;

import java.io.Serializable;
import java.util.Calendar;

public class ConsultaPK implements Serializable{
	private int crm;
	private int codigoPaciente;
	private Calendar dataConsulta;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoPaciente;
		result = prime * result + crm;
		result = prime * result + ((dataConsulta == null) ? 0 : dataConsulta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaPK other = (ConsultaPK) obj;
		if (codigoPaciente != other.codigoPaciente)
			return false;
		if (crm != other.crm)
			return false;
		if (dataConsulta == null) {
			if (other.dataConsulta != null)
				return false;
		} else if (!dataConsulta.equals(other.dataConsulta))
			return false;
		return true;
	}
	public ConsultaPK() {
		super();
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
	
	
}
