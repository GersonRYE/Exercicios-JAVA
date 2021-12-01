package br.com.generation.lacofor;

public class ExemploFor01 {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Repetindo a variável i: " + i);
			Thread.sleep(500);

		}
	}
}
