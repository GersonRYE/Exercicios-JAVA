package ProvaFarmacas;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salario, imp;

		System.out.println("Digite");
		salario = sc.nextInt();

		if (salario < 1000) {
			imp = 0;
		} else {
			imp = (salario - 150) * 15 / 100;
		}
		System.out.println(imp);

	}
}
