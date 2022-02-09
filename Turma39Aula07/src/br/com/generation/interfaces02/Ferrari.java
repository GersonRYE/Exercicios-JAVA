package br.com.generation.interfaces02;

public class Ferrari extends Nacao implements Carro {
	@Override
	//Polimorfismo
	public void acelerar() {
		System.out.println("Ferrari acelerando");

	}
}
