
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
		// super significa olha pra cima, que referencia a classe mae em rela��o a
		// variavel ou metodo

//		return super.getBonificacao() + super.salario;
		return super.getBonificacao() + super.getSalario();

		// sobrecarga - Repare que criamos uma nova vers�o do m�todo autentica. Agora
		// temos dois m�todos autentica na mesma classe que variam na quantidade ou
		// tipos de par�metros. Isso se chama sobrecarga de m�todos.

//A sobrecarga n�o leva em conta a visibilidade ou retorno do m�todo, apenas os par�metros e n�o depende da heran�a.
	}

}
