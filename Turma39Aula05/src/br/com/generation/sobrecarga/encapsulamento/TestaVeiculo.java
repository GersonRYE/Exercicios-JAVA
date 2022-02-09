package br.com.generation.sobrecarga.encapsulamento;

import java.util.Scanner;

public class TestaVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a marca do veiculo: ");
		String marca = scan.next();
		
		Veiculo vc = new Veiculo();
		
		
		
		vc.setMarca("Toyota");// alterando o atributo marca atraves do metodo setMarca
		
		System.out.println("Marca do veiculo " + vc.getMarca() );
		
		scan.close();

	}

}
