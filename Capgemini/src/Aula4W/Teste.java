package Aula4W;

import java.util.Date;

public class Teste {
	public static void main(String[] args) {

		Vendedor v = new Vendedor();
		
		v.setNome("Gerson");
		v.setSalario(100.0f);
		v.setCpf("123456");
		v.setDataNascimento(new Date());
		v.calcularSalario();
		v.setComissaoPorItem(10.0f);
		v.setTotalItensVendidos(10);
		
		System.out.println("O salario do vendedor é: " + v.calcularSalario());
		
		Motorista m= new Motorista();
		
		
	}
}
