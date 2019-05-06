package br.com.eros.entity;

import java.io.Serializable;

public class Predio implements Serializable{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7184860639875693093L;

	private int andares;
	
	private boolean elevador;
	
	private double altura;	
	
	public Predio() {
		super();
	}
	public Predio(int andares, boolean elevador, double altura) {
		super();
		this.andares = andares;
		this.elevador = elevador;
		this.altura = altura;
	}
	public int getAndares() {
		return andares;
	}
	public void setAndares(int andares) {
		this.andares = andares;
	}
	public boolean isElevador() {
		return elevador;
	}
	public void setElevador(boolean elevador) {
		this.elevador = elevador;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}	
}
