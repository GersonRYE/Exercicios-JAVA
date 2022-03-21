package NivelIniciante;

import java.util.Scanner;

public class ExercicioSoma {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		int a = leia.nextInt();
		System.out.println("Digte o valor de B: ");
		int b = leia.nextInt();

		int x = a + b;

		System.out.println("X = " + x);

	}
}
