package parte3;

import java.util.Scanner;

public class Parte3 {
	public static void tensao(int t) {
		
		
		Scanner leia = new Scanner(System.in);
		
		
		
		while (t == 0) {
			System.out.println("Escolha uma das opções");
			System.out.println("\n1 - 110V" + "\n2 - 220v" + "\n3 - Voltar para a pergunta anterior"
					+ "\n4 - Voltar para o menu principal" + "\n5 - Sair do programa");
			t = leia.nextInt();
			
			switch (t) {
			case 1:
				System.out.println("ok 110");
				break;
			case 2:
				System.out.println("ok 220");
				break;
			case 3:
				System.out.println("ok voltar a pergunta anterior");
				break;
			case 4:
				System.out.println("ok voltar ao mebu principal");
				break;
			case 5:
				System.out.println("ok sair do programa");
				break;
			default:
				System.out.println("\nopção invalida");
				System.out.println();
				t = 0;
				break;
				
			}
			
		}
		leia.close();
		return;
	}
}
