package Aula4J;

import java.util.Scanner;

public class ExercicioQuinze {
	public static void main(String[] args) {
		int numero;
		Scanner leitorScanner = new Scanner(System.in);

		System.out.println("Digite um numero: 150");
		numero = leitorScanner.nextInt();

		if (numero >= 100 && numero <= 200) {
			System.out.println("O número esta no intervalo");
		} else {
			System.out.println("O numero não esta no intervalo");
		}
		leitorScanner.close();
	}
}
