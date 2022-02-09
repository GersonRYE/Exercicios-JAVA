package br.com.generation.interfaces03;

public class ImprimeAnimal {

	public static void main(String[] args) {
		TestaAnimal t = new TestaAnimal();
		
		t.fazerAnimalComer(new Cachorro());
		t.fazerAnimalComer(new Tigre());
		
		//   t.fazerAnimalComer(new Animal());

	}

}

