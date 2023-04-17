package Aula4R;

public class Pessoa {
	// Atributos
	private float peso;
	private float altura;

	public float calcularIMC() {
		float imc = peso / (altura * altura);
		return imc;
	}
	
	public Pessoa(float peso, float altura) {
		this.peso = peso;
		this.altura = altura;
	}

	//Metodos acessores
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
