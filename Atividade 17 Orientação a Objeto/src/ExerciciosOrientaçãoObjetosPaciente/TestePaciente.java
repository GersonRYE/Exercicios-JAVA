package ExerciciosOrientaçãoObjetosPaciente;

import java.util.Scanner;

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Paciente n1 = new Paciente();

		System.out.println("Digite o nome do Paciente: ");
		n1.nome = leia.nextLine();

		System.out.println("Digite a idade do Paciente: ");
		n1.idade = leia.nextInt();

		while (n1.genero == 0) {
			System.out.println("Escolha uma das opções referente ao seu genero... ");
			System.out.println("1 - Masculino");
			System.out.println("2 - Feminino");
			System.out.println("3 - Outros");
			n1.genero = leia.nextInt();

		}

		while (n1.situacaoPaciente == 0) {
			System.out.println("Escolha uma das opções referente ao status paciente... ");
			System.out.println("1 - Febre Amarela");
			System.out.println("2 - Leucemia");
			System.out.println("3 - Cancer");
			n1.situacaoPaciente = leia.nextInt();

		}
		System.out.println();
		System.out.println("Carregando Informações..............");
		System.out.println("Nome do Paciente: " + n1.nome);
		System.out.println("Idade do Paciente: " + n1.idade);
		System.out.println("Genero do Paciente: " + n1.genero);
		System.out.println("Status do Paciente: " + n1.situacaoPaciente);
		leia.close();

	}

}
