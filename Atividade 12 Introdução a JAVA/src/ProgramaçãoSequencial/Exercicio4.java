package Programa??oSequencial;

/*
 * Escreva  um sistema que leia tr?s n?meros inteiros e positivos (A, B, C) e calcule a seguinte express?o: 
D = (R + S) / 2, onde 

		R = (A + B)^2
		S = (B + C)^2
 */

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double d, r, s;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de c: ");
		c = leia.nextInt();
		
		r =  Math.pow((a + b), 2);
		s =  Math.pow((b + c), 2);
		
		d = (r + s) / 2;
		
		System.out.println("O resultado ?: " + d);
		
		
		leia.close();
	}

}
