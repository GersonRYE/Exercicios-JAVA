package br.com.generation.condition;

import java.util.Scanner;

public class ExemploSwitCase {
	public static void main(String[] args) {
		 letra();
		 
		 
		

		}
		
		public static void letra() {
			Scanner entrada = new Scanner(System.in);

			System.out.println("Escreva uma letra entre a e d");
			String letra = entrada.next();

			switch (letra) {
			case "a", "A", "1":
				System.out.println("Anny");
				break;
			case "b", "B", "2":
				System.out.println("Bruno");
				break;
			case "c", "C", "3":
				System.out.println("Camila");
				break;
			case "d", "D", "4":
				System.out.println("Danilo");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
				
				
		}
	}
}
