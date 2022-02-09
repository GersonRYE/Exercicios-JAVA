package Parte1;

import java.util.Scanner;

public class prototipo {
public static void produto(int dispositivo) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while (dispositivo == 0) {
			System.out.println("Escolha uma das opções");
			System.out.println("\n1 - Ar condicionado" + "\n2 - Chuveiro" + "\n3 - Forno Eletrico"
					+ "\n4 - Geladeira"  
					+"\n5 - Sair do programa");
			dispositivo = scan.nextInt();
			
			if (dispositivo == 1) {
				System.out.println("Ar condicionado");
				
			}
			else if (dispositivo == 2) {
				System.out.println("Chuveiro");
				
			}
			else if (dispositivo == 3) {
				System.out.println("Forno Eletrico");
				
			}
			else if (dispositivo == 4) {
				System.out.println("Geladeira");
				
			}
			
			else if (dispositivo == 5) {
				System.out.println("Porgrama finalizado, agradecemos a utilizacao.");
				
			}
			else {
				System.out.println("Favor inserir escolha valida.");
				dispositivo = 0;
			}
			
		}
		scan.close();
		return;
	}

}
