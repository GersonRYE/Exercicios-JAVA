package ExercicioDoWhile;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tec, cont = 0, soma = 0, numero = 0;

		System.out.println("Digite o número: ");
		tec = leia.nextInt();

		do {
			cont++;
			soma += cont;
			if (cont == 1) {
				System.out.print(cont);
			} else {
				System.out.print(" + " + cont);
			}
		} while (cont < tec);

		System.out.print(" = " + soma);
		leia.close();
	}

}
