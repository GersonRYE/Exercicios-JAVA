package Testes;

public class Exercicio2 {
	public static void main(String[] args) {
		Integer quantidade = 7;
		boolean existe = false;
		String status = "Parado";
		String subStatus = "Aguardando Instru��es";
		if (quantidade < 5 && existe && status.equals("Parado") || subStatus.equals("Aguardando Instru��es")) {
			System.out.println("if");
		} else {
			System.out.println("else");
		}
	}
}
