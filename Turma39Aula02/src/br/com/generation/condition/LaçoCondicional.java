package br.com.generation.condition;

import java.util.Scanner;

public class La�oCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6.0) {
			System.out.println("Aprovado " + "M�dia: " + media);
		}
		else if(media >= 3.0 && media < 6.0){
			System.out.println("Recupera��o " + "M�dia: " + media);
		}
		else {
			System.out.println("Reprovado " + "M�dia: " + media);
		}
		leia.close();

	}

}
