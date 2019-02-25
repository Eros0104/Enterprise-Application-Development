package br.com.eros.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="T_MOTORISTA")
public class Motorista {
	@Id
	@Column(name="NR_CARTEIRA")
	private int carteira;
	@Column(name="NM_MOTORISTA")
	private String nome;
	@Column(name="DT_NASCIMENTO")
	@Temporal(value =TemporalType.DATE)
	private Calendar nascimento;
	@Column(name="FL_CARTEIRA")
	private Byte[] foto;	
	@Column(name="DS_GENERO")
	@Enumerated(EnumType.STRING)
	private GeneroMotorista genero;		
	
	public Motorista(int carteira, String nome, Calendar nascimento, Byte[] foto, GeneroMotorista genero) {
		super();
		this.carteira = carteira;
		this.nome = nome;
		this.nascimento = nascimento;
		this.foto = foto;
		this.genero = genero;
	}
	public int getCarteira() {
		return carteira;
	}
	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public Byte[] getFoto() {
		return foto;
	}
	public void setFoto(Byte[] foto) {
		this.foto = foto;
	}
	public GeneroMotorista getGenero() {
		return genero;
	}
	public void setGenero(GeneroMotorista genero) {
		this.genero = genero;
	}
	
	
}
