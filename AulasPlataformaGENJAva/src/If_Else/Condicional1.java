package If_Else;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome;

		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();

		System.out.println("Entre com o seu nome: ");
		nome = leia.nextLine();

		System.out.println("\nSeu nome: %s"); // %s - significa que pega o valor de tipo STRING; \n - significa pular
												// linha
		System.out.println("\nSua idade: %d"); // %d - significa que pega o valor inteiro

		if (idade >= 18) {
			System.out.println("Você é maior de idade...");
		} else if (idade >= 1 && idade < 18) {
			System.out.println("Você é menor de idade");
		} else {
			System.out.println("Valor inválido");
		}
/* LEMBRANDO O QUE FOI DITO NA AULA: LAÇO CONDICIONAL, RESPONDA:
 * 
 * QUANDO ESTAMOS CRIANDO UM LAÇO CONDICIONAL SIMPLES OU COMPOSTO, SE TORNA OBRIGATORIO O USO DAS CHAVES?
 * 
 * R: NÃO, POIS NÃO SERA OBRIGATORIO SE TIVER UMA UNICA LINHA DE EXECUÇÃO
	*/	
	}

}
