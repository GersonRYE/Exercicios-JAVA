package Testes;

import java.util.HashMap;
import java.util.Map;

public class Exercicio6 {
	public static void main(String[] args) {
		Map<String, Integer> nomeMap = new HashMap<>();

		nomeMap.put("Jo�o", 20);
		nomeMap.put("Maria", 22);
		nomeMap.put("Pedro", 29);
		nomeMap.put("Jos�", 36);
		
		System.out.println(nomeMap.get("Pedro"));
	}
}
