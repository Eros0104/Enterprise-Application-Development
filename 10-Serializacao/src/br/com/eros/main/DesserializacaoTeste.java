package br.com.eros.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.eros.entity.Predio;

public class DesserializacaoTeste {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("Predio.txt");
		
		ObjectInputStream input = new ObjectInputStream(file);
		
		//Desserializar o objeto predio
		//Ler o arquivo e recuperar o objeto predio
		
		Predio predio = (Predio) input.readObject();
		
		System.out.println("Andares: " + predio.getAndares());
		System.out.println("Altura: " + predio.getAltura());
		System.out.println("Elevador: " + (predio.isElevador()?"Sim":"Não"));
	}
}
