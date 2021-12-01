package br.com.generation.exception;

public class TratamentoErro {

	public static void main(String[] args) {
		int[] vetor = new int[4];
		System.out.println("Antes da Exception!");

		try {
			vetor[4] = 1;
		} catch (ArrayIndexOutOfBoundsException e) { // a mensagem em azul é a mensagem quando roda o programa, aparece
														// a mensagem, a letra "e" significa a variavel criada pelo catch
			System.out.println("Erro concertado!!!");
		}

	}

}
