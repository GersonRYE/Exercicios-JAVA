package La?oCondicional;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double pesoTomate, excessoPeso, multa;
		
		System.out.println("Peso do tomate: ");
		pesoTomate = leia.nextDouble();
		
		if(pesoTomate > 50) {
			excessoPeso = (pesoTomate - 50);
			multa = excessoPeso * 4;
			System.out.println("Peso excedido!");
			System.out.println("Voc? pagara uma multa de: R$ " + multa);
			
		}
		else {
			System.out.println("N?o h?necessidade multa");
		}
		leia.close();
	}

}
