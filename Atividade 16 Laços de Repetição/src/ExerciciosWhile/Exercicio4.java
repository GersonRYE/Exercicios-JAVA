package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = -1, sexo = 0, op = 0, op1 = 0, op2 = 0, op3 = 0, m = 0, f = 0, o = 0, fn = 0, hn = 0, oc = 0,
				n40 = 0, m18 = 0, cont = 0;

		while (cont < 150) {
			while (idade < 0 || idade > 150) {
				
				System.out.println("Digite sua idade: ");
				idade = leia.nextInt();

				if (idade >= 0 && idade <= 150) {

					System.out.println("Carregando...");
				} else {
					System.out.println("Digite novamente");

				}

			}

			while (sexo == 0) {
				System.out.println("Escolha uma das op��es referente ao seu sexo: ");
				System.out.println("1 - Masculino");
				System.out.println("2 - Feminino");
				System.out.println("3 - Outros");
				sexo = leia.nextInt();

				switch (sexo) {
				case 1:
					m++;
					break;
				case 2:
					f++;
					break;
				case 3:
					o++;
					break;
				default:
					System.out.println("Op��o inv�lida");
					sexo = 0;
					break;
				}
			}

			while (op == 0) {
				System.out.println("Escolha umas da op��es e digite o n�mero: ");
				System.out.println("1 - Voc� � uma pessoa calma ");
				System.out.println("2 - Voc� � uma pessoa nervosa ");
				System.out.println("3 - Voc� � uma pessoa agressiva");
				op = leia.nextInt();

				switch (op) {
				case 1:
					op1++;
					break;
				case 2:
					op2++;
					break;
				case 3:
					op3++;
					break;
				default:
					System.out.println("Op��o inv�lida");
					op = 0;
					break;
				}
			}

			cont++;

			if (sexo == 2 && op == 2) {
				fn++;
			}
			if (sexo == 1 && op == 3) {
				hn++;
			}
			if (sexo == 3 && op == 1) {
				oc++;
			}
			if (idade >= 40 && op == 2) {
				n40++;
			}
			if (idade <= 18 && op == 1) {
				m18++;
			}

			idade = -1;
			System.out.println(idade);
			sexo = 0;
			op = 0;
			

		}
		leia.close();
		System.out.println("N�mero de pessoas calmas: " + op1);
		System.out.println("N�mero de mulheres nervosa: " + fn);
		System.out.println("N�mero de homens agressivos: " + hn);
		System.out.println("N�mero de outros calmos: " + oc);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: " + n40);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: " + m18);

	}

}
