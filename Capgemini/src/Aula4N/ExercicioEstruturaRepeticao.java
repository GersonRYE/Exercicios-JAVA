package Aula4N;

import java.util.Scanner;

public class ExercicioEstruturaRepeticao {
	public static void main(String[] args) {

		Scanner leitorScanner = new Scanner(System.in);

		char desejaContinuar = 'S';
		while (desejaContinuar == 'S' || desejaContinuar == 's') {
			System.out.println("Digite um numero: ");
			int numero = leitorScanner.nextInt();
			if (numero == 0) {
				System.out.println("O n�mero � 0");
			} else {
				if (numero > 0) {
					System.out.println("O n�mero � maior que zero");
				} else {
					System.out.println("O n�mero � menor que zero");
				}
			}
			System.out.println("Deseja continuar? S - Sim / N - N�o");
			desejaContinuar = leitorScanner.next().charAt(0);
		}
		leitorScanner.close();

	}
}
