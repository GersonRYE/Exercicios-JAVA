package ExerciciosOrienta��oObjetosAviao;

public class Aviao {
	String modelo;
	String fabricante;
	int segmento = 0;

	public void definicao() {
		while (segmento == 0) {

			switch (segmento) {
			case 1:
				System.out.println("Avi�o usado para particular de uma certa empresa para negocios ate um certo destino");
				break;
			case 2:
				System.out.println("Avi�o usado para transportar pessoas e cargas ate um certo destino");
				break;
			default:
				System.out.println("Op��o inv�lida");
				segmento = 0;
				break;
			}
		}

	}
}
