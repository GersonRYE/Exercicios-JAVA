package br.com.generation.laco.dowhile;

import java.util.Scanner;

public class ExemploExercio {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = -1, n = 0;

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		while (idade == 0) {
			if (idade < 0) {
				idade = 0;
				System.out.println("Digite novamente");

			} else {
				System.out.println("Tudo certo");
				break;
			}
		}
	}

}