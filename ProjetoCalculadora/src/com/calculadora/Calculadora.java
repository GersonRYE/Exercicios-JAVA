package com.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int a = scan.nextInt();

		System.out.println("Digite o segundo valor: ");
		int b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		double divisao = divisao(a, b);
		int multiplicacao = multiplicacao(a, b);

		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);

		scan.close();
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static double divisao(int a, int b) {
		return (double)a / b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

}
