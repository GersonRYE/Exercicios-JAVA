package ExerciciosLacosCondicional;

import java.util.Scanner;

/*5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o 
 * altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice 
 * sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o �ndice crescer 
 * para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, se o �ndice atingir 
 * 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice 
 * de polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.*/

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double i;

		System.out.println("Digite o indice da polui��o: ");
		i = leia.nextDouble();

		if (i >= 0.05 && i <= 0.25) {
			System.out.println("Indice de polui��o aceit�vel!");
		} else if (i > 0.25 && i <= 0.3) {
			System.out.println("1� grupo suspender atividades");
		} else if (i > 0.3 && i <= 0.4) {
			System.out.println("1� e 2� grupo suspender atividades");
		} else if (i > 0.5 && i <= 0.4) {
			System.out.println("Todos os grupos suspender as atividades");
		} else {
			System.out.println("Sem classifica��o!");
		}
	}
}
