package Exercicios;

import java.util.Random;

public class Exercicio4 {
	public static void main(String[] args) {
		Random qualquer = new Random();

		int v = qualquer.nextInt(11);
		System.out.println(v);

		if (v % 2 == 0) {
			System.out.println("Este n�mero � PAR!");

			v = (int) Math.sqrt(v);
			System.out.println("A raiz quadrada deste n�mero �: " + v);  
		} else {
			System.out.println("Este n�mero � IMPAR!");

			v = (int) Math.pow(v, 2);
			System.out.println("O n�mero elevado ao quadrado �: " + v);
		}
	}
}
  