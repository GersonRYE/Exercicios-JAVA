import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a;
		int b = 0;
		int c = 1;
		System.out.println("Digite: ");
		a = leia.nextInt();
		while (a != 0) {
			
			b = b + 1;
			c = c * 2;
			a = a - 1;
			
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		leia.close();

	}
}
