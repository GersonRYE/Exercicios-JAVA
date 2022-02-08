package ExerciciosLacosCondicional;

import java.util.Scanner;

/*
 * 7) Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
 * (positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.*/

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double b, a, area;
		
		System.out.println("Digite o valor da base do triangulo: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor da altura do tri�ngulo: ");
		a = leia.nextDouble();
		
		if(b >= 0 && a >= 0) {
			area = (b*a)/2;
			System.out.printf("A �rea do tri�ngulo �: %.2f", area);
		}else {
			System.out.println("Valor da base ou altura inv�lido");
		}
	}

}
