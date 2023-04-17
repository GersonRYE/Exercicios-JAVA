package TesteHackerHankIntroduction;

import java.util.Scanner;

//Complete a seguinte função para que a mesma devolva todos os possiveis numeros de 4 digitos, onde cada um seja menor ou igual a <MaxDigit> 
//, e a soma dos digitos de cada numero gerado seja 21.
// Exemplos: maxDigit = 6: 3666, 4566
public class TEsteMeli {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maxDigit = scan.nextInt();

		if (maxDigit >= 6) {
			for (int i = 1000; i <= 9999; i++) {
				String[] numerosParaString = Integer.toString(i).split("");
				int soma = 0;
				for (String numero : numerosParaString) {
					if (Integer.parseInt(numero) <= maxDigit) {
						soma += Integer.parseInt(numero);
						// System.out.print(soma);
					} 
					if (Integer.parseInt(numero) > maxDigit) {
						soma = 0;
						break;
					}
				}
//				System.out.println();
				if (soma == 21) {
					System.out.println("Certo: " + i);
				}
			}
//			if (maxDigit < 6) {
//				System.out.println("null");
//			}
		} else {
			System.out.println("null");
		}

		scan.close();

	}
}
