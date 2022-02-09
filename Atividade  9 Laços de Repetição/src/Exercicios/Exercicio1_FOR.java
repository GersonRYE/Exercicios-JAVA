package Exercicios;

import java.util.Scanner;

public class Exercicio1_FOR {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		int totalF = 0, mediaF = 0, cont, hab = 20;

		double mediaSalPop = 0, maior = 0, filho, salario, totalS = 0, cont100 = 0, perc100 = 0;

		for (cont = 1; cont <= hab; cont++) {
			System.out.println("Digite o seu nome: ");
			nome = leia.next();

			System.out.println("Digite o valor de seu Salário: ");
			salario = leia.nextDouble();

			System.out.println("Digite a quantidade de filhos: ");
			filho = leia.nextDouble();

			totalS += salario;
			mediaSalPop = totalS / 2;

			totalF += filho;
			mediaF = totalF / 2;

			if (salario > maior) {
				maior = salario;
			}
			if (salario <= 100) {
				cont100++;
			}
			perc100 = (cont100 * 100) / hab;
		}
		System.out.println("Media salario: " + mediaSalPop);
		System.out.println("Media filhos: " + mediaF);
		System.out.println("Maior: " + maior);
		System.out.println("Percentual abaixo R$ 100: " + perc100 + "%");

		leia.close();
	}

}
