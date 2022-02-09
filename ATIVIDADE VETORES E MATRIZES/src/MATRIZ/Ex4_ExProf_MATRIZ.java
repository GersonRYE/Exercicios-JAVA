package MATRIZ;

import java.util.Scanner;

public class Ex4_ExProf_MATRIZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[][] val = new int[3][3];
		int somaVal = 0;
		int somaDiag = 0;
		int soma = 0;

		for (int l = 0; l < val.length; l++) {
			for (int c = 0; c < val[l].length; c++) {
				System.out.printf("Digite os valores na posição [%d] [%d] ",l, c);
				val[l][c] = scan.nextInt();
				somaVal += val[l][c];
				if (l == c) {
					somaDiag += val[l][c];
				}

			}
		}
		soma = val[0][0] + val[1][1] + val[2][2];
		System.out.println("Verificação........" + soma);
		System.out.println("A soma da matriz por completo: " + somaVal);
		System.out.println("A soma da Diagonal: " + somaDiag);
		scan.close();
		
		
	}

}
