package br.com.generation.vetor;

public class ExemploVetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayVetor = new int[10]; //[0]...[9]
		
		arrayVetor[5] = 500;
		
		for (int i = 0; i <= 9; i++) {
		System.out.println(i + "/" + arrayVetor[i]);
		}

	}

}
