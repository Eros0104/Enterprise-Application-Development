package br.com.fiap.beans;

import java.util.Calendar;

public class Pessoa {
	//Constante no Java
	public static final char ESPECIE_HUMANO = 'H';
	private String name;
	private Calendar dataNascimento;
	private Genero genero;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public static char getEspecieHumano() {
		return ESPECIE_HUMANO;
	}
	
}
