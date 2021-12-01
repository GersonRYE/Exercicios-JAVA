package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {

		// Instanciando(criando) o objeto aluno
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();

		aluno2.nome = "Rodrigo";
		aluno2.idade = 18;
		aluno2.curso = "Bloco II - Java Misturado";

		aluno1.nome = "Thamires";
		aluno1.idade = 18;
		aluno1.curso = "Bloco I - Java Puro";

		System.out.println(aluno1.nome);
		System.out.println(aluno1.idade);
		System.out.println(aluno1.curso);
		aluno1.estudar();

		System.out.println();

		System.out.println(aluno2.nome);
		System.out.println(aluno2.idade);
		System.out.println(aluno2.curso);
		aluno2.assistirAula();

	}

}
