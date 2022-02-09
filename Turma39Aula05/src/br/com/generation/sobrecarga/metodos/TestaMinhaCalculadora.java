package br.com.generation.sobrecarga.metodos;

public class TestaMinhaCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinhaCalculadora mc = new MinhaCalculadora();
		
		System.out.println("Soma: " + mc.soma(5, 10));
		System.out.println("Soma: " + mc.soma(100,2 , 40));

	}

}
