package Testes;

import java.util.ArrayList;
import java.util.List;

public class Exercicio7 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		for (int i = lista.size(); i < 8; i++) {
			lista.add(lista.size());
		}
		System.out.println(lista);

		List<Integer> novaLista = new ArrayList<>();

		for (int i = novaLista.size(); i < lista.size(); i++) {
			if (lista.get(i) > 1 && lista.get(i) < 4) {
				novaLista.add(lista.get(i));
			}
		}
		System.out.println(novaLista);
	}

}
