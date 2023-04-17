package TesteHackerHankIntroduction;

import java.util.Scanner;

public class JavaLoopsII {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			System.out.println(a);
			int b = in.nextInt();
			System.out.println(b);
			int c = in.nextInt();
			System.out.println(c);
			for (int j = 0; j < c; j++) {
				a = a + (int) Math.pow(2, j) * b;
				System.out.print(a + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
