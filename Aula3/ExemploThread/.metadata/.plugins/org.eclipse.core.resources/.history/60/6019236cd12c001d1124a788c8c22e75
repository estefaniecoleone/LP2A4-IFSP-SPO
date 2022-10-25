package br.edu.ifsp.lp2a4;

public class ThreadRunnable implements Runnable {

	private String nomeThread;
	private int tempo;

	public ThreadRunnable(String nomeThread, int tempo) {
		super();
		this.nomeThread = nomeThread;
		this.tempo = tempo;
	}

	@Override // ao implementar a classe Runnable deve ser sobre escrito o metodo run
	public void run() {

		try {
			for (int i = 0; i < 6; i++) {
				if (i == 0)
					System.out.println("Iniciando a Thread " + nomeThread);
				System.out.println(nomeThread + "contador " + i);
				Thread.sleep(tempo); // quantidade de milisegundos que Thread não precisa ser executada
			}

		} catch (InterruptedException e) { //
			e.printStackTrace();
		}
		System.out.println("Finalizando a Thread " + nomeThread);

	}

}
