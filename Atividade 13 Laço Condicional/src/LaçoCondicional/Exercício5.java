package LaçoCondicional;

import java.util.Scanner;

public class Exercício5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double ip;

		System.out.println("Escreva o valor do índice de poluição");
		ip = leia.nextDouble();

		if (ip >= 0.05 && ip <= 0.25) {
			System.out.println("Índice de poluição aceitável...");
		} else if (ip > 0.25 && ip <= 0.3) {
			System.out.println("Notifique as empresas do 1º Grupo...");
		} else if (ip > 0.3 && ip <= 0.4) {
			System.out.println("Notifique as empresas do 1º e 2º Grupo...");
		} else if (ip > 0.4 && ip <= 0.5) {
			System.out.println("Todos os grupos devem ser notificados");
		} else {
			System.out.println("Índice sem classificação");
		}
		leia.close();
	}
}
