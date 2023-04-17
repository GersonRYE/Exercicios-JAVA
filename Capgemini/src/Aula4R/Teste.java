package Aula4R;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(75.0f, 1.70f);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso da pessoa");
		p1.setPeso(sc.nextFloat());
		
		System.out.println("Digite a altura da pessoa");
		p1.setAltura(sc.nextFloat());
		
		System.out.println("IMC = " + p1.calcularIMC());
	}
}
