package br.com.generation.interfaces;

public class TestaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Extends --> pra herança
		//Implements --> pra usar interface
		
		Cachorro meuCachorro = new Cachorro();
		
		meuCachorro.somAnimal();
		meuCachorro.dormir();
		
		Gato meuGato = new Gato();
		
		meuGato.somAnimal();
		meuGato.dormir();

	}

}
