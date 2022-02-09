package MATRIZ;

import java.util.Scanner;

public class Ex4_MATRIZ {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double[][] m = new double[3][3];
		double soma = 0, somad = 0;

		for (int l = 0; l < m.length; l++) {
			for (int c = 0; c < m[l].length; c++) {
				System.out.println("Valor: ");
				m[l][c] = leia.nextDouble();

				soma += m[l][c];
			}
		}
		for (int l = 0; l < m.length; l++) {
			for (int c = 0; c < m[1].length; c++) {
				if (l == c) {
					somad += m[l][c];
				}
			}

		}
		System.out.println("Soma da Matriz: " + soma);
		System.out.println("Soma da Diagonal Principal: " + somad);
		leia.close();
	}

}
