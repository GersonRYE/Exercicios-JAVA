package ProgramaçãoSequencial;

/*
 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos 
 * impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
 */

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double custoCarro, porcentDistr = 0.28, porcentImp = 0.45, total1, total2, total3;
		
		System.out.println("Custo do carro");
		custoCarro = leia.nextDouble();
		
		total1 = custoCarro * porcentDistr;
		total2 = custoCarro * porcentImp;
		total3 = custoCarro + total1 + total2;
		
		System.out.println("Custo para o consumidor será de R$ " + total3);
		leia.close();
	}

}
