package ExerciciosLacosCondicional;

import java.util.Scanner;

/*
 * 8) Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a mesma for maior que 100, 
 * caso contr�rio imprimi-la com o valor zero.
 * */

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um valor: ");
		n = leia.nextInt();
		
		if(n > 100) {
			System.out.println("O valor digitado �: " + n);
		}else {
			n = 0;
			System.out.println("O valor digitado �: " + n);
		}

	}

}
