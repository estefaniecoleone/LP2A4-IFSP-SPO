package br.edu.ifsp.lp2a4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServidorTCP {
	
	static final int PORTA_PADRAO = 12345;

	
	public static void main(String[] args) throws IOException {
		
		try ( ServerSocket servidor = new ServerSocket( PORTA_PADRAO ) ) {
			while ( true ) { 
				Socket cliente = servidor.accept(); 
				System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
				
				try ( final OutputStream saida = cliente.getOutputStream() ) {
					saida.flush();
					Date date = new Date();
					saida.write( date.toString().getBytes() ); 
				}
				cliente.close();
			}
		}
	}
}
