package ProvaFarmacas;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, p = 0, i = 0;

		System.out.println("Digite:");
		num = sc.nextInt();

		while (num > 0) {
			if (num % 2 == 0) {
				p = p + 1;
			} else {
				i = i + 1;
			}

			num = num - 1;
		}

		System.out.println(p);
		System.out.println(i);
	}
}
