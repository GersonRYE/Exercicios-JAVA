package Exercicios;

import java.util.Scanner;

public class TesteLaptop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n;
		int i;

		System.out.println("Digite o tamanho do array: ");
		i = sc.nextInt();
		n = new int[i];
		System.out.println(getBattery(n));

	}

	public static int getBattery(int[] evento) {
		Scanner sc = new Scanner(System.in);
		int nvBateria = 50;
		for (int i = 0; i < evento.length; i++) {
			System.out.println("Digite o [" + i + "]");
			evento[i] = sc.nextInt();
			int resultado = nvBateria + evento[i];

			if (resultado >= 0 && resultado <= 100) {
				nvBateria = resultado;
			} else if (resultado > 100) {
				nvBateria = 100;
			}
		}
		return nvBateria;
	}

}
