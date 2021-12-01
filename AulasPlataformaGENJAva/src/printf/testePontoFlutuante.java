package printf;

public class testePontoFlutuante {

	public static void main(String[] args) {
		double a = 1236155.123;
		int b = 123;
		int c = 123456789;
		int d = -56;
		double pontoFlutuante = 3.1456789;
		String olaMundo = "Ola mundo!";
		
		System.out.printf("Variavel 'a' = %8.2f", a);
		System.out.println();
		System.out.printf("%d", b);
		System.out.printf("%n"); // pula linha
		System.out.printf("%f", pontoFlutuante);
		System.out.printf("%n");
		System.out.printf("%s", olaMundo);
		System.out.printf("%n");
		System.out.printf("%20s", olaMundo); // espaçamento em direção a direita
		System.out.printf("%n");
		System.out.printf("%-20s", olaMundo); //espaçamento em direção a esquerda
		System.out.println();
		System.out.printf("%+d", b);
		System.out.printf("%n");
		System.out.printf("%05d", b); // nesta parte pede-se uma quantidade de 15 digitos, porem se a variavel não ter ele complementa com 0
		System.out.printf("%n");
		System.out.printf("%,d", c);
		System.out.println();
		System.out.printf("% d", d); //metodos para fazer o sinal de menos caso seja um valor negativo(obs funciona normalmente sem precisar dar espaço antes do d
		System.out.println();
		System.out.printf("%.2f", a); //ponto flutuante com precisão de casas decimais
		System.out.println();
		System.out.printf("R$ %010.2f", a);//espaçamento para o lado direito de 10 caracteres com preenchimento com 0 nesses espaços
		System.out.println();
		
		testeMaisCompleto();
		
	}
	
	private static void testeMaisCompleto() {
		double[] preco = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for(int i=0; i<preco.length; i++) {
			System.out.printf("%s %02d: total de R$ %,10.2f%n", "Item", i+1, preco[i]);
		}
	}
	/*USADO APENAS PARA PRINTF
	 * 
	 * Tabela 1 - Códigos de controle ou especificadores de formato
	 * 
	 * Código	Formato (tipo de dados)
		%c		Caractere simples (char)
		%s		Cadeia de caracteres (String)
		%d		Inteiro decimal com sinal (int)[byte, short, int, long
		%i		Inteiro decimal com sinal (int) (não funciona)
		%ld		Inteiro decimal longo (long)
		%f		Real em ponto flutuante (float ou double)
		%e		Número real em notação científica com o “e” minúsculo (float ou double)
		%E		Número real em notação científica com o “E” maiúsculo (float ou double)
		%%		Imprimir o próprio caractere %
		%S		deixa o texto em letra maiuscula
		%C		deixa o caractere em letra maiuscula
	 	%n		comando para pular linha
	 	%u		numero inteiro decimal sem sinal +-
	 	%o		numero inteiro octal sem sinal +-
	 	%x,%X	numero hexadecimal, caixa baixa(lowecase), ou caixa alta (uppercase)
	 	%p		referência de um objeto
	 	
	 * 
	 * */
	
	/*Tabela 2 principais caracteres de escape
	 * 
	 * Caractere de escape	Significado
		\n					Nova linha
		\t					Tabulação horizontal (o mesmo que pressionar a tecla Tab)
		\”					Aspas dupla
		\\					Barra invertida
	 * 
	 * */
	
	/*
	 * Tabela 3
	 * 
	 * Código	Significado

		-		Alinha o valor à esquerda dentro do campo de saída

		+		Coloca sinal em valores numéricos

		0		Completa o campo de saída com zeros à esquerda

		,		Usa o separador de milhares: ponto na notação brasileira e vírgula na notação americana

		(		Mostra números negativos entre parênteses
	 * 
	 * */

}
