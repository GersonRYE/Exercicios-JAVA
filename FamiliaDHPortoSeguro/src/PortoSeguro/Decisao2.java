package PortoSeguro;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, resultado = 0;
		int op;
		
		Scanner leia = new Scanner(System.in);
				
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nEntre com o segundo n�mero: ");
		n2 = leia.nextFloat();
		
		System.out.println("\n\t\tCalculadora");
		System.out.println("\n1 - soma");
		System.out.println("\n2 - diferen�a");
		System.out.println("\n3 - multiplica��o");
		System.out.println("\n4 - divis�o");
		System.out.println("\nEntre com a sua op��o");
		op = leia.nextInt();
		

		switch(op) {
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1-n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			resultado = n1 / n2;
			break;
		default:
			System.out.println("\nOp��o inv�lida");
		}
		System.out.println("\nResultado: " + resultado);
	}

}
