package VETOR;

import java.util.Scanner;

public class Ex1_VETOR {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double[] pontos = new double[5];
		double maior = 0;
		int i;

		System.out.println("Digite sua pontuação: ");

		for (i = 0; i <= 4; i++) {
			System.out.println("Nota do " + (i + 1) + "º: ");
			pontos[i] = leia.nextDouble();

			if (pontos[i] > maior) {
				maior = (int) pontos[i];
			}
			leia.close();
		}
		System.out.println("Maior Pontuação: " + maior);

	}

}
