package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class ExemploWhile03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = -1;
		

		while (numero != 0) {
			System.out.println("Digite um número: ");
			numero = in.nextInt();
			
			if(numero == 0) {
				System.out.println("Final do Programa...");
			}

		}
		in.close();
	}

}
