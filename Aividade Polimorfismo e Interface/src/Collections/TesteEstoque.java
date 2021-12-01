package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteEstoque {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Estoque> estoque = new ArrayList<Estoque>();

		System.out.println("Digite quantos itens voc� quer cadastrar: ");
		int cadastro = leia.nextInt();

		for (int c = 0; c < cadastro; c++) {
			System.out.println("Digite o " + (c + 1) + "� produto: ");
			String item = leia.next();

			estoque.add(new Estoque(item)); // Nesta parte � armazenado todos os itens cadastrados apos o usuario
											// escrever

		}
		for (Estoque c : estoque) {
			System.out.println(c); // Nesta parte �apresentado a lista dos itens cadastrados
		}
		estoque.remove(0); // nesta parte removi a posi��o 0
		System.out.println("Atualiza��o depois da remo��o: " + estoque); // Atualiza��o depois da remo��o

		leia.close();
	}

}
