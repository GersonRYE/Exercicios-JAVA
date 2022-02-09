package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int idade = -1, menos21 = 0, maior50 = 0;

		while (idade != -99) {
			System.out.println("Digite sua idade ou -99 para sair");
			idade = leia.nextInt();

			if (idade >= 0 && idade <= 21) {
				menos21++;
			} else if (idade >= 50) {
				maior50++;

			} else {
				System.out.println("fim do programa");
			}

		}
		System.out.println("Menores de 21 anos: " + menos21);
		System.out.println("Maiores de 50 anos: " + maior50);
		leia.close();
	}

}
