package ExerciciosLacosCondicional;

import java.util.Scanner;

/*
 * 1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de 
 * seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado 
 * de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a 
 * um sistema que leia a vari�vel P (peso de tomates) e verifique se h� excesso. Se houver, gravar na 
 * vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. 
 * Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
 * */

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int peso, e, m;
		
		
		System.out.println("\t\tDigite o peso dos tomates:");
		peso = leia.nextInt();
		
		if(peso > 50) {
			e = peso - 50;
			m = e * 4;
			System.out.println("\nExcedeu o limite do peso " + e + "kg a mais" + ", multa de: " + m + " reais");
		}else {
			e = 0;
			m = 0;
			System.out.println("\nExcedeu o limite do peso " + e + "kg a mais" + ", multa de: " + m + " reais");
			System.out.println("\nEsta dentro das limita��es.");
		}
	}
}
