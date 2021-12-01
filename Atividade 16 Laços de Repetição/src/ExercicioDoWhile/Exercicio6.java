package ExercicioDoWhile;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n = 0, soma = 0, cont = 0, media = 0;

		

		do {
			System.out.println("Digite um número...  ou 0 para sair ");
			n = leia.nextInt();

			if (n > 0) {
				if (n % 3 == 0) {
					soma += n;
					cont++;

					media = soma / cont;
				}
			}
		} while (n != 0);
		
		System.out.println("A media dos multiplos de 3: " + media);
		leia.close();
	}

}
