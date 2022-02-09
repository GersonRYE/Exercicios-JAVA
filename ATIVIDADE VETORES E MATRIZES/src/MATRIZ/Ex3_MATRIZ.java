package MATRIZ;

import java.util.Scanner;

public class Ex3_MATRIZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int[][] n1 = new int[4][3];
		int[][] n2 = new int[4][3];
		int[][] m1 = new int[4][3];
		int[][] m2 = new int[4][3];

		for (int l = 0; l < n1.length; l++) {
			for (int c = 0; c < n1[l].length; c++) {
				System.out.println("Digite o valor de N1: ");
				n1[l][c] = leia.nextInt();
				System.out.println("Digite o valor da N2: ");
				n2[l][c] = leia.nextInt();

				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}

		for (int l = 0; l < m1.length; l++) {
			for (int c = 0; c < m1[l].length; c++) {
				System.out.print(m1[l][c] + "  ");
			}
			System.out.println("");
		}
		System.out.println("");

		for (int l = 0; l < m2.length; l++) {
			for (int c = 0; c < m2[l].length; c++) {
				System.out.print(m2[l][c] + "  ");
			}
			System.out.println();
			leia.close();
		}
	}
}
