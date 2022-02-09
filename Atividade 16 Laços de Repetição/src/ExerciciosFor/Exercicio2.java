package ExerciciosFor;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valor, par = 0, impar = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digitar o " + cont + "º número: ");
			valor = leia.nextInt();

			if (valor % 2 == 0) {
				par++;

			} else {
				impar++;

			}
			
		}
		System.out.println("Qtd pares são: " + par + "; ");
		System.out.println("Qtd ímpares são: " + impar + ". ");

		leia.close();
	}

}
