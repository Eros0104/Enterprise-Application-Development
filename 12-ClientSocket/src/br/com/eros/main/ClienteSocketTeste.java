package br.com.eros.main;

import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.eros.entity.Vingador;

public class ClienteSocketTeste {

	public static void main(String[] args) throws Exception{
		//Criar um objeto e serializar na rede
		Vingador hulk = new Vingador("Hulk", "Força", false);
		
		Socket socket = new Socket("localhost", 1014);
		
		ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
		
		output.writeObject(hulk);
		System.out.println("Objeto serializado na rede!");
		
		output.close();
		socket.close();
	}

}
