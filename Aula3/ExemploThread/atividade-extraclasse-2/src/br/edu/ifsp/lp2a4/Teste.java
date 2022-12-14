package br.edu.ifsp.lp2a4;

public class Teste {

	public static void main(String[] args) throws InterruptedException {

		ThreadRunnable thread1 = new ThreadRunnable("1 ", 500); // instancia com nome e valor de tempo pro sleep
		Thread t1 = new Thread(thread1); // transformando a instancia da classe Runnable em Thread
		t1.start(); // inicia a thread
		t1.join(); // so ira passar pra proxima linha quando toda execucao da thread1 acabar

		ThreadRunnable thread2 = new ThreadRunnable("2 ", 1000);
		Thread t2 = new Thread(thread2);
		t2.start();

		ThreadRunnable thread3 = new ThreadRunnable("3 ", 1500);
		Thread t3 = new Thread(thread3);
		t3.start();

		t2.join(); // so ira iniciar a thread4 quando toda execucao da thread2 acabar

		ThreadRunnable thread4 = new ThreadRunnable("4 ", 100);
		Thread t4 = new Thread(thread4);
		t4.start();

	}
}
