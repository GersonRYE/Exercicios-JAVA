package HerançaPolimorfismo;

public abstract class Animal {
	private String nome;
	private int idade;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void som() {
		System.out.println("o animal emite esse som....");
	}

	public void movimento() {
		System.out.println("o animal faz esse movimento...");

	}

}
