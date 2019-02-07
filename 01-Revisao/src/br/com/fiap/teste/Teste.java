package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.beans.Genero;
import br.com.fiap.beans.Pessoa;

public class Teste {
	public static void main(String[] args) {
		Pessoa pes = new Pessoa();
		pes.setGenero(Genero.FEMININO);
		Calendar data = Calendar.getInstance(); // Data atual
		Calendar data2 = new GregorianCalendar(2000,1,20);
		pes.setDataNascimento(data);
		pes.setName("Julia");
		
		//Formatar a data para exibir
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(data.getTime()));
		System.out.println(sdf.format(data2.getTime()));

	}
}
