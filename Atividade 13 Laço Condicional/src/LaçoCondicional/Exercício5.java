package La�oCondicional;

import java.util.Scanner;

public class Exerc�cio5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double ip;

		System.out.println("Escreva o valor do �ndice de polui��o");
		ip = leia.nextDouble();

		if (ip >= 0.05 && ip <= 0.25) {
			System.out.println("�ndice de polui��o aceit�vel...");
		} else if (ip > 0.25 && ip <= 0.3) {
			System.out.println("Notifique as empresas do 1� Grupo...");
		} else if (ip > 0.3 && ip <= 0.4) {
			System.out.println("Notifique as empresas do 1� e 2� Grupo...");
		} else if (ip > 0.4 && ip <= 0.5) {
			System.out.println("Todos os grupos devem ser notificados");
		} else {
			System.out.println("�ndice sem classifica��o");
		}
		leia.close();
	}
}
