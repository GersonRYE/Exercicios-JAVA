package br.com.generation.metodos;
// POO  - Programação Orientado à Objetos

import java.util.Scanner;

public class TesteMetodos {
	public static int num1, num2, outrasoma; // variaveis que podem utilidas em qualquer lugar, ou funções

	public static void main(String[] args) {

		metodo7();
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo5(num1, num2); // multiplicação
		metodo8(num1, num2); // divisao
		System.out.println("Metodo 6 sendo chamado da classe externa: " + MetodoFora.metodo6(num1, num2));

	}

	public static void metodo1() {
		System.out.println("Ola eu sou o metodo 1....");
	}

	public static void metodo2() {

		double soma, numero1 = 200.0, numero2 = 100.0;
		soma = numero1 + numero2;
		System.out.println("Soma do metodo 2: " + soma);
	}

	public static void metodo3() {
		outrasoma = num1 + num2;
	}

	public static void metodo4() {
		System.out.println("Soma do metodo 3.... Chamado pelo método 4: " + outrasoma);
	}

	public static void metodo5(int n1, int n2) {
		int multiplicacao = n1 * n2;
		System.out.println("Multiplicação no metodo 5: " + multiplicacao);
	}

	public static void metodo7() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o numero 1: ");
		num1 = scan.nextInt();

		System.out.println("Entre com o numero 2: ");
		num2 = scan.nextInt();

		scan.close();
	}

	public static void metodo8(int n1, int n2) {
		int divisao = n1 / n2;
		System.out.println("Divisao no metodo 8: " + divisao);
	}
}
