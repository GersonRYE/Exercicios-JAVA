package For;

public class Repeticao {
	public static void main(String[] args) {
		int x, soma = 0;

		for (x = 1; x <= 10; x++) {
			System.out.println("\n %d" + x); // %d - significa pegar o valor do numero inteiro porem ja n�o � mais
												// necessario, conteudo destualizado no java na plataforma GENERATION
			soma += x;
		}
		System.out.println("\n Soma total: " + soma);
		/*
		 * LEMBRANDO O QUE FOI DITO NA AULA: LA�O DE REPETI��O FOR, RESPONDA:
		 * 
		 * EM PORTUGOL VIMOS QUE O LA�O PARA, POSSUI TR�S ARGUMENTO, J� EM JAVA, QUANTOS
		 * ARGUMENTOS O LA�O FOR POSSUI: R: TR�S
		 */
	}

}
