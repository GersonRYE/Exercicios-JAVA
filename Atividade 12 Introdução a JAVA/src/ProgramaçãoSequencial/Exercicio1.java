package ProgramaçãoSequencial;
// 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias;
		int diasAnos, diasMeses, total;
		
		diasAnos = 365;
		diasMeses = 30;
		
		System.out.println("Qual seria a sua idade em...");
		System.out.println("Anos: ");
		anos = leia.nextInt();
		
		System.out.println("Meses");
		meses = leia.nextInt();
		
		System.out.println("Dias");
		dias = leia.nextInt();
		
		diasAnos *= anos;
		
		diasMeses *= meses;
		
		total = (diasAnos) + (diasMeses) + dias;
		
		System.out.println("Você viveu " + total + " dias!");
		
		leia.close();
				
	

	}

}
