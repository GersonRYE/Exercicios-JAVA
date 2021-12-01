package HerançaPolimorfismo;

public class TestaAnimal {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Cavalo cv1 = new Cavalo();
		Preguica p1 = new Preguica();
		
		
		c1.setNome("Pluto");
		c1.setIdade(7);
		
		System.out.println("O nome do Cachorro: " + c1.getNome());
		System.out.println("A idade do Cachorro: " + c1.getIdade());
		c1.som();;
		c1.movimento();
		System.out.println();
		
		cv1.setNome("Alazao");
		cv1.setIdade(15);
		
		System.out.println("O nome do Cavalo: " + cv1.getNome());
		System.out.println("A idade do Cavalo: " + cv1.getIdade());
		cv1.som();
		cv1.movimento();
		System.out.println();
		
	    p1.setNome("Lezado");
	    p1.setIdade(7);
	    
	    System.out.println("O nome da Preguiça: " + p1.getNome());
	    System.out.println("A idade da Preguiça: " + p1.getNome());
	    p1.som();
	    p1.movimento();
		
		
		
		
		

	}

}
