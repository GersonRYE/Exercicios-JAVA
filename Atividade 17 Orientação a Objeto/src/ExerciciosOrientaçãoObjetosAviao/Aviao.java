package ExerciciosOrientaçãoObjetosAviao;

public class Aviao {
	String modelo;
	String fabricante;
	int segmento = 0;

	public void definicao() {
		while (segmento == 0) {

			switch (segmento) {
			case 1:
				System.out.println("Avião usado para particular de uma certa empresa para negocios ate um certo destino");
				break;
			case 2:
				System.out.println("Avião usado para transportar pessoas e cargas ate um certo destino");
				break;
			default:
				System.out.println("Opção inválida");
				segmento = 0;
				break;
			}
		}

	}
}
