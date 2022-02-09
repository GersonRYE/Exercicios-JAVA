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
		System.out.printf("%20s", olaMundo); // espa�amento em dire��o a direita
		System.out.printf("%n");
		System.out.printf("%-20s", olaMundo); //espa�amento em dire��o a esquerda
		System.out.println();
		System.out.printf("%+d", b);
		System.out.printf("%n");
		System.out.printf("%05d", b); // nesta parte pede-se uma quantidade de 15 digitos, porem se a variavel n�o ter ele complementa com 0
		System.out.printf("%n");
		System.out.printf("%,d", c);
		System.out.println();
		System.out.printf("% d", d); //metodos para fazer o sinal de menos caso seja um valor negativo(obs funciona normalmente sem precisar dar espa�o antes do d
		System.out.println();
		System.out.printf("%.2f", a); //ponto flutuante com precis�o de casas decimais
		System.out.println();
		System.out.printf("R$ %010.2f", a);//espa�amento para o lado direito de 10 caracteres com preenchimento com 0 nesses espa�os
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
	 * Tabela 1 - C�digos de controle ou especificadores de formato
	 * 
	 * C�digo	Formato (tipo de dados)
		%c		Caractere simples (char)
		%s		Cadeia de caracteres (String)
		%d		Inteiro decimal com sinal (int)[byte, short, int, long
		%i		Inteiro decimal com sinal (int) (n�o funciona)
		%ld		Inteiro decimal longo (long)
		%f		Real em ponto flutuante (float ou double)
		%e		N�mero real em nota��o cient�fica com o �e� min�sculo (float ou double)
		%E		N�mero real em nota��o cient�fica com o �E� mai�sculo (float ou double)
		%%		Imprimir o pr�prio caractere %
		%S		deixa o texto em letra maiuscula
		%C		deixa o caractere em letra maiuscula
	 	%n		comando para pular linha
	 	%u		numero inteiro decimal sem sinal +-
	 	%o		numero inteiro octal sem sinal +-
	 	%x,%X	numero hexadecimal, caixa baixa(lowecase), ou caixa alta (uppercase)
	 	%p		refer�ncia de um objeto
	 	
	 * 
	 * */
	
	/*Tabela 2 principais caracteres de escape
	 * 
	 * Caractere de escape	Significado
		\n					Nova linha
		\t					Tabula��o horizontal (o mesmo que pressionar a tecla Tab)
		\�					Aspas dupla
		\\					Barra invertida
	 * 
	 * */
	
	/*
	 * Tabela 3
	 * 
	 * C�digo	Significado

		-		Alinha o valor � esquerda dentro do campo de sa�da

		+		Coloca sinal em valores num�ricos

		0		Completa o campo de sa�da com zeros � esquerda

		,		Usa o separador de milhares: ponto na nota��o brasileira e v�rgula na nota��o americana

		(		Mostra n�meros negativos entre par�nteses
	 * 
	 * */

}
