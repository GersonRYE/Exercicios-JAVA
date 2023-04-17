package Testes;

public class Exercicio2 {
	public static void main(String[] args) {
		Integer quantidade = 7;
		boolean existe = false;
		String status = "Parado";
		String subStatus = "Aguardando Instruções";
		if (quantidade < 5 && existe && status.equals("Parado") || subStatus.equals("Aguardando Instruções")) {
			System.out.println("if");
		} else {
			System.out.println("else");
		}
	}
}
