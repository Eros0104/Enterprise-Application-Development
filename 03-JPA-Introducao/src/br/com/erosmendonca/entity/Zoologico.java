package br.com.erosmendonca.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_zoologico")
@SequenceGenerator(name = "zoologico", sequenceName = "sq_tb_zoologico", allocationSize = 1)
public class Zoologico {
	@Id
	@Column(name = "cd_zoologico")
	@GeneratedValue(generator = "zoologico", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "nm_zoologico", length = 20, nullable = false)
	private String nome;

	@Column(name = "qt_animais")
	private int quantidadeAnimais;

	@Column(name = "ds_tipo")
	@Enumerated(EnumType.STRING)
	private TipoZoologico tipo;

	@Column(name = "hr_abertura")
	@Temporal(TemporalType.TIME)
	private Date abertura;

	@Column(name = "hr_fechamento")
	@Temporal(TemporalType.TIME)
	private Date fechamento;

	@Column(name = "dt_inauguracao")
	@Temporal(TemporalType.DATE)
	private Calendar inauguracao;

	@Column(name = "st_emergencia")
	private boolean emergencia;

	@Lob
	@Column(name = "fl_logo")
	private byte[] logo;

	@Transient
	private boolean aberto;

	public Zoologico() {
		super();
	}
	
	public Zoologico(String nome, int quantidadeAnimais, TipoZoologico tipo, Date abertura, Date fechamento,
			Calendar inauguracao, boolean emergencia, byte[] logo) {
		super();
		this.nome = nome;
		this.quantidadeAnimais = quantidadeAnimais;
		this.tipo = tipo;
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.inauguracao = inauguracao;
		this.emergencia = emergencia;
		this.logo = logo;
	}

	public Zoologico(int codigo, String nome, int quantidadeAnimais, TipoZoologico tipo, Date abertura,
			Date fechamento, Calendar inauguracao, boolean emergencia, byte[] logo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quantidadeAnimais = quantidadeAnimais;
		this.tipo = tipo;
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.inauguracao = inauguracao;
		this.emergencia = emergencia;
		this.logo = logo;
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

	public int getQuantidadeAnimais() {
		return quantidadeAnimais;
	}

	public void setQuantidadeAnimais(int quantidadeAnimais) {
		this.quantidadeAnimais = quantidadeAnimais;
	}

	public TipoZoologico getTipo() {
		return tipo;
	}

	public void setTipo(TipoZoologico tipo) {
		this.tipo = tipo;
	}

	public Date getAbertura() {
		return abertura;
	}

	public void setAbertura(Date abertura) {
		this.abertura = abertura;
	}

	public Date getFechamento() {
		return fechamento;
	}

	public void setFechamento(Date fechamento) {
		this.fechamento = fechamento;
	}

	public Calendar getInauguracao() {
		return inauguracao;
	}

	public void setInauguracao(Calendar inauguracao) {
		this.inauguracao = inauguracao;
	}

	public boolean isEmergencia() {
		return emergencia;
	}

	public void setEmergencia(boolean emergencia) {
		this.emergencia = emergencia;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
}
