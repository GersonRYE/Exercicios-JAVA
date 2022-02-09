package ExerciciosOrientaçãoObjetosFuncionario;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Funcionario f1 = new Funcionario();

		System.out.println("Nome do Funcionário: ");
		f1.nome = leia.nextLine();

		System.out.println("Nome da Rua: ");
		f1.rua = leia.nextLine();

		System.out.println("Digite o nome do Bairro: ");
		f1.bairro = leia.nextLine();

		System.out.println("Número da Casa: ");
		f1.numeroCasa = leia.nextInt();

		System.out.println();

		System.out.println("Digite um numero entre 0 e 1");
		f1.Comportamento(leia.nextInt());

		leia.close();

	}

}
