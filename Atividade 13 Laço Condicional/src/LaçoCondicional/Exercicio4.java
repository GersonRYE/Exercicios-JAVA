package LaçoCondicional;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n1;

		System.out.println("Digite o número: ");
		n1 = leia.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("Número Par");
		} else {
			System.out.println("Número Ímpar");
		}
		if (n1 > 0) {
			System.out.println("Número Positivo");
		} else {
			System.out.println("Número Negativo");
		}
		leia.close();
	}

}
