package letsCodeSantander;

import java.util.stream.Stream;

public class Exercicio19 {

	public static void main(String[] args) {

		Stream.of(1,2,3,4,5,6)
	    .filter(el -> el % 2 == 0)
	    //TODO
//	    .ifPresent(el -> System.out.printf("The result is: %d.%n", el));
	    .reduce(Integer::sum).ifPresent(el -> System.out.printf("The result is: %d.%n", el));;
		
	}

}
