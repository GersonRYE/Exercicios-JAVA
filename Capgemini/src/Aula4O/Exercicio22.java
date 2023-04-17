package Aula4O;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nomeProduto;
		float precoCusto;
		float precoVenda;
		float totalCusto = 0;
		float totalVenda = 0;

		int i = 0;
		for (; i < 40; i++) {

			System.out.println("Digite o nome do produto");
			nomeProduto = leia.next();

			System.out.println("Digite o preço de custo do produto");
			precoCusto = leia.nextFloat();

			System.out.println("Digite o preço de venda do produto");
			precoVenda = leia.nextFloat();

			totalCusto += precoCusto;
			totalVenda += precoVenda;

			if (precoCusto == precoVenda) {
				System.out.println("Houve um empate entre o preço de custo e de venda");
			} else {
				if (precoCusto > precoVenda) {
					System.out.println("Prejuizo");
				} else {
					System.out.println("Lucro");
				}
			}
			System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", preço de venda = " + precoVenda);

		}

		System.out.println("A média do preço de custo é de: " + (totalCusto / i));
		System.out.println("A média do preço de venda é de: " + (totalVenda / i));

	}

}
