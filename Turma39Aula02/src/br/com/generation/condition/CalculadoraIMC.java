package br.com.generation.condition;

import java.util.Scanner;

public class CalculadoraIMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double imc;
		double pesoQuilogramas = 0.0;
		double alturaMetros = 0.0;
		
		System.out.println("Digite o peso atual: ");
		pesoQuilogramas = entrada.nextDouble();
		
		System.out.println("Digite sua altura: ");
		alturaMetros = entrada.nextDouble();
		
		imc = pesoQuilogramas / (alturaMetros * alturaMetros);
		
		System.out.println("Valores do IMC");
		
		System.out.println("Abaixo do Peso: Menos que 18,5.");
		System.out.println("Normal: Entre 18,5 e 24,9.");
		System.out.println("Sobrepeso: Entre 25,0 e 29,9.");
		System.out.println("Obeso: Acima de 30,0.");
		
		if(imc < 18.5) {
			System.out.println("Voc? esta abaico do peso! Favor comer bastante!");
		}
		if(imc > 18.5 && imc <29.9){
			System.out.println("Voc? est? com peso normal!Continue assim...");	
		}
		if(imc > 25.0 && imc < 29.9) {
			System.out.println("Voc? esta com sobre peso! Favor entrar na academia e como coisas saud?veis");
		}
		if(imc > 30.0) {
			System.out.println("Voc? esta obeso! Favor buscar recomenda??es m?dicas");
		}
		
		entrada.close();
		
	}
 
}
