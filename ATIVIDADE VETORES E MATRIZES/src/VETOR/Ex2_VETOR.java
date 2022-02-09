package VETOR;

import java.util.Random;

public class Ex2_VETOR {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		
		double maior = 0, soma = 0, media = 0;
		int[] dado = new int[10];
		int i, jogadas = 0;

		System.out.println("Jogadas");
		for (i = 0; i <= 9; i++) {
			dado[i] = aleatorio.nextInt(6)+1;
			jogadas = (int)dado[i];

			System.out.println("Jogada " + (i+1) + "º: " +jogadas + ", ");

			soma += jogadas;
			media = soma / (i + 1);

			if (jogadas > 5) {
				maior++;
			}
			
		}
		System.out.println("Média dos valores jogados: " + media);
		System.out.println("Maior que 5: " + (int) maior);

	}
}