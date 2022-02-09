package ProgramaçãoSequencial;

/*
 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
 *	escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
 *
 * d = RAIZ QUADRADA DE (x2 - x1)^2 + (y2 - y1)^2
 */

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double x1, x2, y1, y2;
		double a, b, total;
		
		System.out.println("Digite o primeiro ponto X: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o primeiro ponto Y: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o segundo ponto X: ");
		x2 = leia.nextDouble(); 
		
		System.out.println("Digite o segundo ponto Y: ");
		y2 = leia.nextDouble();
		
		a = Math.pow((x2 - x1), 2);
		b = Math.pow((y2 - y1), 2);
		
		total = Math.sqrt((a + b));
		
		System.out.println("O resultado do calculo é: " + total);
		
		leia.close();
		

	}

}
