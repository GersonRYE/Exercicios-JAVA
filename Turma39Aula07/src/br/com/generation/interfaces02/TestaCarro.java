package br.com.generation.interfaces02;

public class TestaCarro {
	public static void main(String[] args) {
		
		Ferrari c = new Ferrari();
		c.nacionalidade = "Italia"; //--> Atributo da classe nação
		c.acelerar();// --> metodo da interface Carro
		
				
		Fusca d = new Fusca();
		d.nacionalidade = "Alemanha";
		d.acelerar();

	}
}
