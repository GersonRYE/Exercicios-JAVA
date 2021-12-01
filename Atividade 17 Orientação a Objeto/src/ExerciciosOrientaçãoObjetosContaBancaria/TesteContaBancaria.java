package ExerciciosOrientaçãoObjetosContaBancaria;

import java.util.Scanner;

public class TesteContaBancaria {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		ContaBancaria c1 = new ContaBancaria();

		System.out.println("Digite seu nome: ");
		c1.nome = leia.nextLine();

		System.out.println("Digite seu estado civil: ");
		c1.estadoCivil = leia.nextLine();

		System.out.println("Digite o numero da Conta: ");
		c1.nConta = leia.nextInt();

		System.out.println("Digite 1 para saber sobre o rendimento ou 0 para não saber: ");
		c1.rendimento = leia.nextInt();

		c1.rendimentoMes();
		
		leia.close();

	}
}
