package ExerciciosOrientaçãoObjetosAviao;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// TODO Auto-generated method stub
		Aviao a1 = new Aviao();
		
		
		System.out.println("Digite o Modelo do Avião: ");
		a1.modelo = leia.nextLine();//"E175";
		
		System.out.println("Digite o Fabricante do Avião: ");
		a1.fabricante = leia.nextLine(); //"Embraer";
		
		while(a1.segmento == 0) {
		System.out.println("Digite 1 para Avião Particular");
		System.out.println("Digite 2 para Avião Comercial");
		a1.segmento = leia.nextInt();
		break;
		}
		
		
		System.out.println("Modelo do Avião: " + a1.modelo);
		
		
		System.out.println("Fabricante do Avião: " + a1.fabricante);
		
		
		System.out.println("Definição do Segmento do Avião: " + a1.segmento);
		leia.close();

	}
	

}
