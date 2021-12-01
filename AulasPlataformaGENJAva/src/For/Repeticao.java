package For;

public class Repeticao {
	public static void main(String[] args) {
		int x, soma = 0;

		for (x = 1; x <= 10; x++) {
			System.out.println("\n %d" + x); // %d - significa pegar o valor do numero inteiro porem ja não é mais
												// necessario, conteudo destualizado no java na plataforma GENERATION
			soma += x;
		}
		System.out.println("\n Soma total: " + soma);
		/*
		 * LEMBRANDO O QUE FOI DITO NA AULA: LAÇO DE REPETIÇÃO FOR, RESPONDA:
		 * 
		 * EM PORTUGOL VIMOS QUE O LAÇO PARA, POSSUI TRÊS ARGUMENTO, JÁ EM JAVA, QUANTOS
		 * ARGUMENTOS O LAÇO FOR POSSUI: R: TRÊS
		 */
	}

}
