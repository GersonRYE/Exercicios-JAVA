package parte2;

import java.util.Scanner;

public class parte2Geladeira {
	public static void valorGeladeira(double v) {
		double e = 0;

		Scanner leia = new Scanner(System.in);
		while (v == 0) {
			System.out.println("Digite valores entre R$200 ate R$10000\n " + "\n1 - Voltar para o menu"
					+ "\n2 - Sair do programa");
			v = leia.nextInt();

			while (e == 0 && v >= 3500) {

				if (v >= 3500) {
					System.out.println("Tem certeza do valor digitado? 1 para sim e 2 para não");
					e = leia.nextInt();
					if (e == 1) {
						System.out.println("ok vamos continuar");
					} else if (e == 2) {
						System.out.println("Retrocedendo");
						v = 0;
						System.out.println("Digite valores entre R$200 ate R$10000\n " + "\n1 - Voltar para o menu"
								+ "\n2 - Sair do programa");
						v = leia.nextInt();
						e = 0;

					} else {
						System.out.println("Valor invalido");
						e = 0;

					}
				}
			}

			System.out.println();

			if (v == 1) {
				System.out.println("Voltar ao menu");
			} else if (v == 2) {
				System.out.println("Sair do progama");
			} else if (v > 200 && v <= 500) {
				System.out.println(("ok Geladeiras entre 200 reais e 500 reais"));
			} else if (v > 500 && v <= 3500) {
				System.out.println("ok Geladeiras entre 500 reais e  3500 reais");
			} else if (v > 3500 && v <= 10000) {
				System.out.println("ok Geladeiras entre 3500 reais e 10000 reais ");
			} else {
				System.out.println("valor invalido");
				v = 0;

			}
		}
		
		leia.close();
		return;
	}
}
