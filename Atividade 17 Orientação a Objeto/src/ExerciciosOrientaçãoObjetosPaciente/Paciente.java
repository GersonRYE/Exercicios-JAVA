package ExerciciosOrientaçãoObjetosPaciente;

public class Paciente {
	String nome;
	int idade;
	int genero;
	int situacaoPaciente;

	void tiposGenero(int genero) {
		while (genero == 0) {
			switch (genero) {
			case 1:
				System.out.println("Masculino");
				break;
			case 2:
				System.out.println("Feminino");
				break;
			case 3:
				System.out.println("Outros");
				break;
			default:
				System.out.println("Opção invalida!");
				genero = 0;
				break;
			}
		}

	}

	void statusPaciente(int situacaoPaciente) {

		while (situacaoPaciente == 0) {

			switch (situacaoPaciente) {
			case 1:
				System.out.println("Febre Amarela");
				break;
			case 2:
				System.out.println("Leucemia");
				break;
			case 3:
				System.out.println("Cancer");
				break;
			default:
				System.out.println("Opção inválida");
				situacaoPaciente = 0;
				break;
			}
		}
	}
}