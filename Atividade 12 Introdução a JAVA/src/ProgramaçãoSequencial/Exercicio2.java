package ProgramaçãoSequencial;

// 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos;
		
		System.out.println("Qual seria sua idade em...");
		System.out.println("Dias: ");
		dias = leia.nextInt();
		
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (meses % 30);
		
		System.out.println("Você tem " + anos + " anos, " + meses + " meses, " + dias + " dias.");
		
		leia.close();
	}
}
