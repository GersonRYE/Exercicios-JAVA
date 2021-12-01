package br.com.generation.matriz;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 10.0;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 10.0;
		notasAlunos[0][3] = 7.9;
		
		notasAlunos[1][0] = 9.0;
		notasAlunos[1][1] = 8.9;
		notasAlunos[1][2] = 5.0;
		notasAlunos[1][3] = 7.9;
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.print(notasAlunos[l][c] + "|");
			}
			System.out.println();
		}

	}

}
