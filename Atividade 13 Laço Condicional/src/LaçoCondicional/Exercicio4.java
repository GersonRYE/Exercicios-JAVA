package La�oCondicional;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n1;

		System.out.println("Digite o n�mero: ");
		n1 = leia.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("N�mero Par");
		} else {
			System.out.println("N�mero �mpar");
		}
		if (n1 > 0) {
			System.out.println("N�mero Positivo");
		} else {
			System.out.println("N�mero Negativo");
		}
		leia.close();
	}

}
