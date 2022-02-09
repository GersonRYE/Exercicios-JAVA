package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestaCollections {
	public static void main(String[] args) {
		String aula1 = "Bloco I - JAVA";
		String aula2 = "Bloco II - BackEnd - SpringBoot";
		String aula3 = "Bloco III - FrontEnd - ";
		String aula4 = "Bloco IV - Java Mobile";

		ArrayList<String> aulas = new ArrayList();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		//System.out.println(aulas);
		//aulas.remove(1);
		//System.out.println(aulas);
		
		// --> for - each
		//for(String i : aulas) {
			//System.out.println("Aulas: " + i);
		//}
		//String primeiraAula = aulas.get(0);
		
		//System.out.println("A primeira aula é: " + primeiraAula);
		
		//for(int i = 0; i < aulas.size(); i++) {//utilzar size no collections para ver o tamanho
			//System.out.println("Aula: " + (i+1) + ": " + aulas.get(i));
		//}
		//System.out.println(aulas.size());//coloca a lista na orfem crescente
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
	}
}
