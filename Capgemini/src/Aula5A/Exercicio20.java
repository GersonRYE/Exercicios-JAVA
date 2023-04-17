package Aula5A;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int anoFabricacao = 0;
		float valorVeiculo = 0.0f;
		float porcentagemDesconto = 0.0f;
		float valorDesconto = 0.0f;
		float valorPagar = 0.0f;
		
		int totalCarrosSeminovos = 0;
		int totalCarros = 0;
		
		char desejaRepetir = 's';
		
		while(desejaRepetir == 's' || desejaRepetir == 'S') {
			System.out.println("Digite o ano de fabricação do veiculo");
			anoFabricacao = sc.nextInt();
			
			System.out.println("Digite o valor do veiculo");
			valorVeiculo = sc.nextFloat();
			
			if(anoFabricacao <= 2000) {
				porcentagemDesconto = 0.12f;
			}else {
				porcentagemDesconto = 0.07f;
				totalCarrosSeminovos++;
			}
			totalCarros++;
			
			valorDesconto = valorVeiculo * porcentagemDesconto;
			valorPagar = valorVeiculo - valorDesconto;
			
			System.out.println("O valor do desconto foi de: "+ valorDesconto);
			System.out.println("O valor que deve ser pago é: " + valorPagar);
			
			System.out.println("Deseja fazer mais cadastros? S - Sim / N - Nao");
			// charAt -> se o usuario digitar "sim" o metodo pega apenas a primeira posição da palavra
			desejaRepetir = sc.next().charAt(0);
		}
		sc.close();
		
		System.out.println("Total de carros semi-novos: " + totalCarrosSeminovos);
		System.out.println("Total de carros: " + totalCarros);
	}
}
