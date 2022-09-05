package br.edu.ifsp.lp2a4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteTCP {
	public static void main(String args[]) throws UnknownHostException, IOException { 
		final Socket cliente = new Socket("localhost", 12345);
		
		final BufferedReader buffer = new BufferedReader(new InputStreamReader( cliente.getInputStream() ) );
	    System.out.println( "texto mandado pelo server : " + buffer.readLine()); 

		buffer.close();
		cliente.close();
	}
}
