package br.com.eros.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Reptil extends Animal{
	@Column(name="DS_VENENOSO")
	private boolean venenoso;
	@Column(name="DS_ESCAMAS")
	private boolean escamas;
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public boolean isEscamas() {
		return escamas;
	}
	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}
	public Reptil() {
		super();
	}
	public Reptil(String cor, String nome, boolean venenoso, boolean escamas) {
		super(cor, nome);
		this.venenoso = venenoso;
		this.escamas = escamas;
	}
		
}
