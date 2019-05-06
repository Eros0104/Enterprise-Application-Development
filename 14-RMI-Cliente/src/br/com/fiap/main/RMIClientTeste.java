package br.com.fiap.main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.fiap.bo.CalculadoraBO;

public class RMIClientTeste {

	public static void main(String[] args) throws Exception {
		CalculadoraBO bo = (CalculadoraBO)
				Naming.lookup("rmi://localhost:1014/chave");
		
		System.out.println("Soma: " + bo.somar(10, 10));
		System.out.println("Fatorial: " + bo.fatorial(5));
		System.out.println("Subtração: " + bo.subtrair(10, 8));
				

	}

}
