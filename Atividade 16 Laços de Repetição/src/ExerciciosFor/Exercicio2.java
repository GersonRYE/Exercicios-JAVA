package ExerciciosFor;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valor, par = 0, impar = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digitar o " + cont + "� n�mero: ");
			valor = leia.nextInt();

			if (valor % 2 == 0) {
				par++;

			} else {
				impar++;

			}
			
		}
		System.out.println("Qtd pares s�o: " + par + "; ");
		System.out.println("Qtd �mpares s�o: " + impar + ". ");

		leia.close();
	}

}
