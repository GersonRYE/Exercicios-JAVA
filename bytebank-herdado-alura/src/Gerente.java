
public class Gerente extends Funcionario {
	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	// sobrescrita- copia o nome do metodo da classe mae, mas podendo alterar a
	// logica dentro do escopo
	public double getBonificacao() {
		// super significa olha pra cima, que referencia a classe mae em relação a
		// variavel ou metodo

//		return super.getBonificacao() + super.salario;
		return super.getBonificacao() + super.getSalario();

		// sobrecarga - Repare que criamos uma nova versão do método autentica. Agora
		// temos dois métodos autentica na mesma classe que variam na quantidade ou
		// tipos de parâmetros. Isso se chama sobrecarga de métodos.

//A sobrecarga não leva em conta a visibilidade ou retorno do método, apenas os parâmetros e não depende da herança.
	}

}
