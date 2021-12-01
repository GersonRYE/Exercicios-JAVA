package ExerciciosOrientaçãoObjetosEletronico;

public class TesteEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eletronico e1 = new Eletronico();
		
		e1.produto = "Celular";
		e1.marca = "Sansumg";
		e1.modelo = "M31";
		e1.polegadas = 5.7;
		
		System.out.println("Tipo de Produto Eletrônico: " + e1.produto);
		System.out.println("Marca do Celular: " + e1.marca);
		System.out.println("Modelo do Celular: " + e1.modelo);
		System.out.println("Tamanho do celular em polegadas: " + e1.polegadas);
		
		e1.configuração();

	}

}
