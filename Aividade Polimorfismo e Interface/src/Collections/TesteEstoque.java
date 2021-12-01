package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteEstoque {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Estoque> estoque = new ArrayList<Estoque>();

		System.out.println("Digite quantos itens você quer cadastrar: ");
		int cadastro = leia.nextInt();

		for (int c = 0; c < cadastro; c++) {
			System.out.println("Digite o " + (c + 1) + "º produto: ");
			String item = leia.next();

			estoque.add(new Estoque(item)); // Nesta parte é armazenado todos os itens cadastrados apos o usuario
											// escrever

		}
		for (Estoque c : estoque) {
			System.out.println(c); // Nesta parte éapresentado a lista dos itens cadastrados
		}
		estoque.remove(0); // nesta parte removi a posição 0
		System.out.println("Atualização depois da remoção: " + estoque); // Atualização depois da remoção

		leia.close();
	}

}
