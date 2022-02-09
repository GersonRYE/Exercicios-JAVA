package orientado;

public class PessoaFisica extends Dados {
	public PessoaFisica() {
		System.out.println("Classe dados presente");
	}

	private String cpf;
	private int idade;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String dadosCompletos() {
		return "O nome é: " + getNome() + "Idade: " + getIdade();
	}

}
