package ExerciciosOrienta��oObjetosAviao;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// TODO Auto-generated method stub
		Aviao a1 = new Aviao();
		
		
		System.out.println("Digite o Modelo do Avi�o: ");
		a1.modelo = leia.nextLine();//"E175";
		
		System.out.println("Digite o Fabricante do Avi�o: ");
		a1.fabricante = leia.nextLine(); //"Embraer";
		
		while(a1.segmento == 0) {
		System.out.println("Digite 1 para Avi�o Particular");
		System.out.println("Digite 2 para Avi�o Comercial");
		a1.segmento = leia.nextInt();
		break;
		}
		
		
		System.out.println("Modelo do Avi�o: " + a1.modelo);
		
		
		System.out.println("Fabricante do Avi�o: " + a1.fabricante);
		
		
		System.out.println("Defini��o do Segmento do Avi�o: " + a1.segmento);
		leia.close();

	}
	

}
