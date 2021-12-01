package br.com.generatio.Aula01;

public class ExemploVariavel2 {
	public static void main(String[] args) {
		
		int var1;
		double var2;
		
		var1 = 10;
		var2 = 10.0;
		
		System.out.println("Valor original da variavel 1: " + var1);
		System.out.println("Valor original da variabel 2: " + var2);
		
		var1 = var1 / 4;
		var2 = var2 / 4;
		
		System.out.println("Valor da variavel 1 após a divisão: " + var1);
		System.out.println("Valor da variável 2 após a divisão: " + var2);
	}

}
