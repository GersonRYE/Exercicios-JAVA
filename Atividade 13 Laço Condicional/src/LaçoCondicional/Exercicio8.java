package La�oCondicional;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double n;

		System.out.println("Voc� digitou o valor: ");
		n = leia.nextDouble();

		if (n > 100) {
			System.out.println("Voc� digitou o valor: " + n);
		} else {
			System.out.println("Seu valor � 0");
		}
		leia.close();
	}
}
