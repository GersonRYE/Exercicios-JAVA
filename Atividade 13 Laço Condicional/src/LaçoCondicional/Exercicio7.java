package La�oCondicional;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double base, altura, area;

		System.out.println("Digite o valor da base: ");
		base = leia.nextDouble();

		System.out.println("Digite o valor da �rea: ");
		altura = leia.nextDouble();

		if (base > 0 && altura > 0) {
			System.out.println("Calculando...");
			area = base * altura;
			System.out.println("Valor da �rea � " + area);
		} else {
			System.out.println("N�o � possivel calcular poia a base ou altura s�o n�mero negativos!");
		}
		leia.close();
	}
}
