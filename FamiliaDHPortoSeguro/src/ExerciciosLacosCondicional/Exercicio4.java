package ExerciciosLacosCondicional;

import java.util.Scanner;

/*
 * 4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero � par ou �mpar, 
 * e se � positivo ou negativo.
 * */

public class Exercicio4 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n;

		System.out.println("Digite um n�mero: ");
		n = leia.nextInt();

		if(n % 2 == 0) {
			System.out.println("Este n�mero � par");
		}else {
			System.out.println("Este n�mero � �mpar");
		}
		if(n >= 0) {
			System.out.println("Este n�mero � positivo");
		}else {
			System.out.println("Este n�mero � negativo");
		}
	}
}
