package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;
import br.com.fiap.beans.Animal;

public class Teste {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		Divisor();
		//API reflection: recupera toda a estrutura da classe
		//exibit o nome da classe
		Linha(animal.getClass().getName());
		Divisor();
		//recuperar métodos da classe animal
		Linha("MÉTODOS:");
		Divisor();
		Method[] metodos = animal.getClass().getDeclaredMethods();
		for(Method m : metodos) {
			Linha(m.getName());
		}
		Divisor();
		
		//recuperar os atributos da classe animal
		Linha("ATRIBUTOS:");
		Divisor();
		Field[] atributos = animal.getClass().getDeclaredFields();
		for(Field f : atributos) {
			Linha(f.getName());
			//recuperar a anotação @Coluna
			Coluna a = f.getAnnotation(Coluna.class);
			Linha("Campo: " + a.nome());
			Linha("Obrigatorio: " + a.nullable());
			Divisor();
		}		
		
		System.out.println(getAll(animal));
	}

	public static void Linha(String s) {
		System.out.printf("| %-26s | \n",s);
	}
	
	public static void Divisor() {
		System.out.println("+============================+");
	}
	
	public static String getAll(Animal animal) {
		Tabela anotacao = animal.getClass().getAnnotation(Tabela.class);
		return "select * from " + anotacao.nome();
	}
}
