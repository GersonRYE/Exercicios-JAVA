package Programa��oSequencial;

/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso 
em horas, minutos e segundos.
 */

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int segf, horas, min, seg;
		
		System.out.println("Qual o tempo de dura��o do seu evento em...");
		System.out.println("Segundos: ");
		segf = leia.nextInt();
		
		horas = segf / 3600;
		min = (segf % 3600) / 60;
		seg = (min % 60);
		
		System.out.println("O evento dura " + horas + " horas, " + min + " minutos, " + seg + " segundos.");
		
		leia.close();
		
	}

}
