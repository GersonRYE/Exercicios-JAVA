package parte2;

import java.util.Scanner;

public class parte2ChuveiroValor {
	public static void valorChuveiro(double v) {
		double e = 0;
		
		Scanner leia = new Scanner(System.in);
		while (v == 0) {
			System.out.println(
					"Digite valores entre R$20 e R$500\n " + "\n1 - Voltar para o menu" + "\n2 - Sair do programa");
			v = leia.nextInt();

			while (e == 0 && v >= 300) {

				if (v >= 300) {
					System.out.println("Tem certeza do valor digitado? 1 para sim e 2 para não");
					e = leia.nextInt();
					if (e == 1) {
						System.out.println("ok vamos continuar");
					} else if (e == 2) {
						System.out.println("Retrocedendo");
						v = 0;
						System.out.println("Digite valores entre R$20 ate R$500\n " + "\n1 - Voltar para o menu"
								+ "\n2 - Sair do programa");
						v = leia.nextInt();
						e = 0;

					} else {
						System.out.println("Valor invalido");
						e = 0;

					}
				}
			}

			if (v == 1) {
				System.out.println("Voltar ao menu");
			} else if (v == 2) {
				System.out.println("Sair do progama");
			} else if (v > 20 && v <= 100) {
				System.out.println(("ok chuveiros entre 20 reais e 100 reais"));
			} else if (v > 100 && v <= 300) {
				System.out.println("ok chuveiros entre 100 reais e  300 reais");
			} else if (v > 300 && v <= 500) {
				System.out.println("ok chuveiros ate 500 reais");
			} else {
				System.out.println("valor invalido");
				v = 0;
			}
		}
		leia.close();
		return;
	}
}
