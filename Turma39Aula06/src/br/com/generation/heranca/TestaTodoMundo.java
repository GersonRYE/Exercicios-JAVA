package br.com.generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {
		Professor prof1 = new Professor();
		Professor prof2 = new Professor();
		Aluno a1 = new Aluno();
		
		a1.setNome("Gerson");
		a1.setIdade(26);
		a1.setEndere�o("Rua Chico Pontes");
		a1.setSemestre("4� Semestre");
		a1.setCurso("Desenvolvedor Full Stack");

		prof1.setNome("Jeff");
		prof1.setIdade(23);
		prof1.setEndere�o("Rua: Henrique Mendes, 582");
		prof1.setDisciplina("Geografia");
		prof1.setSalario(1000.00);
		
		prof2.setNome("Jeff");
		prof2.setIdade(23);
		prof2.setEndere�o("Rua: Henrique Mendes, 582");
		prof2.setDisciplina("Geografia");
		prof2.setSalario(1000.00);

		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndere�o());
		System.out.println(prof1.getDisciplina());
		System.out.println(prof1.getSalario() + "\n");
		
		System.out.println(prof2.getNome());
		System.out.println(prof2.getIdade());
		System.out.println(prof2.getEndere�o());
		System.out.println(prof2.getDisciplina());
		System.out.println(prof2.getSalario() + "\n");
		
		System.out.println(a1.getNome());
		System.out.println(a1.getIdade());
		System.out.println(a1.getEndere�o());
		System.out.println(a1.getSemestre());
		System.out.println(a1.getCurso());
		
		
	}

}
