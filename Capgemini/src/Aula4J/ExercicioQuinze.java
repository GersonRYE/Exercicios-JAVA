package Aula4J;

import java.util.Scanner;

public class ExercicioQuinze {
	public static void main(String[] args) {
		int numero;
		Scanner leitorScanner = new Scanner(System.in);

		System.out.println("Digite um numero: 150");
		numero = leitorScanner.nextInt();

		if (numero >= 100 && numero <= 200) {
			System.out.println("O n�mero esta no intervalo");
		} else {
			System.out.println("O numero n�o esta no intervalo");
		}
		leitorScanner.close();
	}
}
