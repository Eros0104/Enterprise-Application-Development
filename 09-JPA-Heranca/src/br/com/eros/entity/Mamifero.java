package br.com.eros.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@DiscriminatorValue("Mamífero")
@Entity
public class Mamifero extends Animal{

	@Column(name="DS_TEMPO_GESTACAO")
	private int tempoGestacao;
	
	@Column(name="DS_POSSUI_PELOS")
	private boolean possuiPelos;
	public int getTempoGestacao() {
		return tempoGestacao;
	}
	public void setTempoGestacao(int tempoGestacao) {
		this.tempoGestacao = tempoGestacao;
	}
	public boolean isPossuiPelos() {
		return possuiPelos;
	}
	public void setPossuiPelos(boolean possuiPelos) {
		this.possuiPelos = possuiPelos;
	}
	public Mamifero(String cor, String nome, int tempoGestacao, boolean possuiPelos) {
		super(cor, nome);
		this.tempoGestacao = tempoGestacao;
		this.possuiPelos = possuiPelos;
	}
	public Mamifero() {
		super();
	}
	
}
