 package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
  * T_IMOVEL
  * 	*cd_imovel(NUMBER)(PK),
  * 	*ds_tipo(VARCHAR)(Enum...)
  *		ds_area(number)
  *		dt_construcao(DATE)
  *		*ds_logradouro (VARCHAR (100))
  */
 
 @Entity
 @Table(name="T_IMOVEL")
 @SequenceGenerator(name = "imovel",sequenceName="SQ_TB_IMOVEL",allocationSize=1)
public class Imovel {
	 
	@Id
	@Column(name="cd_imovel")
	@GeneratedValue(generator="imovel",strategy=GenerationType.SEQUENCE)
	private int codigo;
	  
	@Enumerated(EnumType.STRING)
	@Column(name="DS_TIPO", nullable = false)
	private TipoImovel tipo;
	
	@Column(name="DS_AREA")
	private int area;
	
	@Column(name="DT_CONTRUCAO")
	@Temporal(value =TemporalType.DATE)
	private Calendar dataConstrucao;
	
	@Column(name="DS_LOGRADOURO", nullable = false, length = 100)
	private String logradouro;

	
	public Imovel(TipoImovel tipo, int area, Calendar dataConstrucao, String logradouro) {
		super();
		this.tipo = tipo;
		this.area = area;
		this.dataConstrucao = dataConstrucao;
		this.logradouro = logradouro;
	}

	public Imovel(int codigo, TipoImovel tipo, int area, Calendar dataConstrucao, String logradouro) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.area = area;
		this.dataConstrucao = dataConstrucao;
		this.logradouro = logradouro;
	}
	
	public Imovel() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public TipoImovel getTipo() {
		return tipo;
	}

	public void setTipo(TipoImovel tipo) {
		this.tipo = tipo;
	}

	public double getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Calendar getDataConstrucao() {
		return dataConstrucao;
	}

	public void setDataConstrucao(Calendar dataConstrucao) {
		this.dataConstrucao = dataConstrucao;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	 
	
	 
}
