package Exercicios;

import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		int v1 = aleatorio.nextInt(100);
		System.out.println(v1);

		int v2 = aleatorio.nextInt(100);
		System.out.println(v2);

		int v3 = aleatorio.nextInt(100);
		System.out.println(v3);

		if (v1 < v2) {
			if (v2 < v3) {
				System.out.println(v1 + ", " + v2 + ", " + v3);
			} else if (v1 < v3) {
				System.out.println(v1 + ", " + v3 + ", " + v2);
			} else {
				System.out.println(v3 + ", " + v2 + ", " + v1);
			}
		} 
		else if (v2 < v3) {
			if (v1 < v3) {
				System.out.println(v2 + ", " + v1 + ", " + v3);
			} else {
				System.out.println(v2 + ", " + v3 + ", " + v1);
			}
		}
		else {
			System.out.println(v3 + ", " + v2 + ", " + v1 );
		}

	}
}