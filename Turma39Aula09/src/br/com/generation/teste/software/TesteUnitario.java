package br.com.generation.teste.software;

import java.util.Scanner;

public class TesteUnitario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("entre com os numeros: ");
		double num1 = scan.nextInt();
		double num2 = scan.nextDouble();

		Calculadora calc = new Calculadora();

		double resultado = 4;

		double resultaEsperado = calc.soma(num1, num2);

		if (resultado == resultaEsperado) {
			System.out.println("Teste OK");
		} else {
			System.out.println("Teste Falhou!!!");
		}
	}
}
