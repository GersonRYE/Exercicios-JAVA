package br.com.generation.vetor;

public class ExemploVetor03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] vetorTemperatura = new double[10];
		
		vetorTemperatura[0] = 25.6;
		vetorTemperatura[1] = 26.8;
		vetorTemperatura[2] = 40.0;
		vetorTemperatura[3] = 32.3;
		vetorTemperatura[4] = 18.7;
		
		System.out.println("Dia 1º de Dezembro " + vetorTemperatura[0]);
		System.out.println("O tamanho do ARRAY: " + vetorTemperatura.length);
		
		for(int i  = 0; i < vetorTemperatura.length; i++) {
			System.out.println((i + 1) +  "º: " + vetorTemperatura[i]);
			
		}

	}

}
