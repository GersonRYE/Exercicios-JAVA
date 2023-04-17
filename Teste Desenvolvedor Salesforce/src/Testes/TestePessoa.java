package Testes;

public class TestePessoa {
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Gerson");
		pessoa.setIdade(27);

		System.out.println("Meu nome: " + pessoa.getNome());
		System.out.println("Minha idadde: " + pessoa.getIdade());
		
	}
}
