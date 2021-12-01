package br.com.generatio.Aula01;

import java.util.Scanner;

public class EntradaeSaída {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Escrevao valor de a: ");
		a = leia.nextInt();
				
		System.out.println("Escreva o valor de b: ");
		b = leia.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de a com b é: " + soma);
		
		leia.close();
		

	}

}
