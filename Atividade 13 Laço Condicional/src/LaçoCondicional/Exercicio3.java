package La�oCondicional;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double n1 = 0, n2 = 0, n3 = 0, n4 = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextDouble();
		
		System.out.println("Digite o quarto n�mero: ");
		n4 = leia.nextDouble();
		
		n1 = Math.pow(n1, 2);
		n2 = Math.pow(n2, 2);
		n3 = Math.pow(n3, 2);
		n4 = Math.pow(n4, 2);
		
		
		if(n3 >= 1000) {
			System.out.println("O valor do terceiro n�mero �: " + n3);
		}
		else{
			System.out.println("O valor do primeiro n�mero � " + n1);
			System.out.println("O valor do segundo n�mero � " + n2);
			System.out.println("O valor do terceiro n�mero � " + n3);
			System.out.println("O valor do quarto n�mero � " + n4);
		}
		leia.close();
	}



}
