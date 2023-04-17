package testeIBM;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x;
		
		System.out.println("Digite o valor");
		x = leia.nextInt();
		
		if(x > 10) {
			int y = x * x;
			System.out.println(y);
		}
		else {
			System.out.println("impossivel calcular");
		}
		leia.close();
	}
}
