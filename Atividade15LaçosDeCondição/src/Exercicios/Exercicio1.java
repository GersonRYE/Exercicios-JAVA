package Exercicios;

import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int n1 = aleatorio.nextInt(100);
		System.out.println(n1);
		int n2 = aleatorio.nextInt(100);
		System.out.println(n2);
		int n3 = aleatorio.nextInt(100);
		System.out.println(n3);
		

		if (n1 > n2 && n1 > n3) {
			System.out.println("O primeiro n�mero � maior: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O segundo n�mero � maior: " + n2);
		} else {
			System.out.println("O terceiro n�mero � o maior: " + n3);
		}
	}
}
