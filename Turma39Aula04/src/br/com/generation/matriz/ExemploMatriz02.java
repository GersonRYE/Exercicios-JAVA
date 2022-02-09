package br.com.generation.matriz;

public class ExemploMatriz02 {
	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 10.0;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 10.0;
		notasAlunos[0][3] = 7.9;
		
		notasAlunos[1][0] = 9.0;
		notasAlunos[1][1] = 8.9;
		notasAlunos[1][2] = 5.0;
		notasAlunos[1][3] = 7.9;
		
		System.out.println("Calcula a media de cada aluno: ");
		//double soma = 0;
		//double media =0;
		for(int l=0; l<notasAlunos.length;l++) {
			double soma = 0;
			double media = 0;
			for(int c = 0; c<notasAlunos[l].length; c++) {
				soma += notasAlunos[l][c];
				media = soma / notasAlunos[l].length;
			}
			System.out.println("Media: " + media);
			//System.out.printf("\nMédia do " + (l+1) + "º aluno: %.3f ", (soma/4));
		}
	}
}
