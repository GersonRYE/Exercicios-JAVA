package br.com.generation.collections02;

public class Aula {
	private String materia;
	private int tempo;
	
	

	public Aula(String materia, int tempo) {//aqui foi criado o construtor
		super();//Aula ele é dependente de uma outra superClass
		this.materia = materia;
		this.tempo = tempo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public String toString() {
		return "[\nMateria: " + this.materia + " | " + this.tempo + "minutos]";
	}
}
