package br.com.generation.classes.carro;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro();
		//Carro c2 = new Carro();
		
		c1.nome = "Fusca";
		c1.marca = "Volks";
		c1.ano = 1980;
		//c1.velocidade = 0;
		
		System.out.println(c1.nome);
		System.out.println(c1.marca);
		System.out.println("Velocidade atual:" + c1.ano);
		c1.acelerar(80);
		System.out.println("Velocidade após aceleração: " + c1.velocidade);
		
		c1.freiar(30);
		System.out.println("Velocidade após freiar: " + c1.velocidade);

	}

}
