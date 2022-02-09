package ExercicioHerancaPolimorfismo;

public class TestaTiposAnimais {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Cavalo cv1 = new Cavalo();
		Preguica p1 = new Preguica();

		c1.setNome("Algodão");
		c1.setIdade(2);
		c1.setMovimento("Correr");
		

		System.out.println("Nome do Cachorro: " + c1.getNome());
		System.out.println("Idade do Cachorro: " + c1.getIdade() + "anos");
		System.out.println("Movimento do Cachorro: " + c1.getMovimento());
		Cachorro.som();

		cv1.setNome("Alazão");
		cv1.setIdade(7);
		cv1.setMovimento("Correr");

		System.out.println("\nNome do Cavalo: " + cv1.getNome());
		System.out.println("Idade do Cavalo: " + cv1.getIdade() + "anos");
		System.out.println("Movimento do Cavalo: " + cv1.getMovimento());
		Cavalo.som();

		p1.setNome("Algodão");
		p1.setIdade(5);
		p1.setMovimento("Correr");

		System.out.println("\nNome da Preguiça: " + p1.getNome());
		System.out.println("Idade da Preguiça: " + p1.getIdade() + "anos");
		System.out.println("Movimento da Preguiça: " + p1.getMovimento());
		Preguica.som();

	}

}
