import java.util.Scanner;

public class UsuárioInserindoValor {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			double base, altura, areaRentagulo;
			
			System.out.println("Informe o valor da base:");
			base = input.nextDouble();
			
			System.out.println("Informe o valor da altura:");
			altura = input.nextDouble();
			
			areaRentagulo = base * altura;
			
			System.out.println("A area de um retângulo de base = " + base);
			System.out.println("e altura " + altura);
			System.out.println("é " + areaRentagulo);
	
	}
}
