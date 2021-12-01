package MATRIZ;

import java.util.Scanner;

public class VetoresMatrizesII {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];

		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz M linhas[3], colunas[3]");

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("Insira o elemento M linha[%d] e coluna [%d]: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = entrada.nextInt();
			}
		}
		System.out.println("\nA Matriz ficou: \n");
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]);
				
			}
			System.out.println();
			entrada.close();
		}
		/*USADO APENAS PARA PRINTF
		 * 
		 * Tabela 1 - C�digos de controle ou especificadores de formato
		 * C�digo	Formato (tipo de dados)
			%c		Caractere simples (char)
			%s		Cadeia de caracteres (String)
			%d		Inteiro decimal com sinal (int)
			%i		Inteiro decimal com sinal (int)
			%ld		Inteiro decimal longo (long)
			%f		Real em ponto flutuante (float ou double)
			%e		N�mero real em nota��o cient�fica com o �e� min�sculo (float ou double)
			%E		N�mero real em nota��o cient�fica com o �E� mai�sculo (float ou double)
			%%		Imprimir o pr�prio caractere %
		 * 
		 * */
		
		/*Tabela 2 principais caracteres de escape
		 * 
		 * Caractere de escape	Significado
			\n					Nova linha
			\t					Tabula��o horizontal (o mesmo que pressionar a tecla Tab)
			\�					Aspas dupla
			\\					Barra invertida
		 * 
		 * */
	}
}
