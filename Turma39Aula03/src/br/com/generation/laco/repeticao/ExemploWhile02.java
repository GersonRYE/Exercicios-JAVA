package br.com.generation.laco.repeticao;

public class ExemploWhile02 {
	public static void main(String[] args) throws InterruptedException {
		int contador = 10;
		while (contador >= 0) {
			System.out.println("Repetição: " + contador);
			contador--;
			Thread.sleep(1000);
		}
	}
}
