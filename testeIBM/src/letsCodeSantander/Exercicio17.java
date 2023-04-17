package letsCodeSantander;

import java.util.HashMap;
import java.util.Map;

public class Exercicio17 {
	public static void main(String[] args) {
		Map<String, String> map1 = Map.of("A", "1", "A", "2");
		map1.forEach((k,v) -> System.out.println(k + "-" + v));
		Map<String, String> map2 = new HashMap<>();
		map2.put("A", "1");
		map2.put("A", "2");
		map2.forEach((k,v) -> System.out.println(k + "-" + v));
	}
	

}
