package LaçoCondicional;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigo;
		double numeroHoras, valorHora = 10.0, difHora, novoValor = 20.0, salarioAtual;
		
		System.out.println("Digite o seu código: ");
		codigo = leia.nextInt();
		
		System.out.println("Digite suas horas trabalhadoras: ");
		numeroHoras = leia.nextDouble();
		
		if(numeroHoras > 50) {
			salarioAtual = valorHora * 50;
			System.out.println("Seu salário atual é de R$ " + salarioAtual);
			
			difHora = (numeroHoras - 50);
			novoValor = (difHora * novoValor) + salarioAtual;
			System.out.println("Salário excedido com novo valor/ horas R$ " + novoValor);
		}
		else{
			salarioAtual = numeroHoras * valorHora;
			System.out.println("Seu salário atual é de R$ " + salarioAtual);
			System.out.println("Sem acrescimos");
		}
		leia.close();
	}

}
