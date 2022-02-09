package LaçoCondicional;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double base, altura, area;

		System.out.println("Digite o valor da base: ");
		base = leia.nextDouble();

		System.out.println("Digite o valor da área: ");
		altura = leia.nextDouble();

		if (base > 0 && altura > 0) {
			System.out.println("Calculando...");
			area = base * altura;
			System.out.println("Valor da área é " + area);
		} else {
			System.out.println("Não é possivel calcular poia a base ou altura são número negativos!");
		}
		leia.close();
	}
}
