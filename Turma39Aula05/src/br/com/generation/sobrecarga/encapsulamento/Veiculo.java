package br.com.generation.sobrecarga.encapsulamento;

public class Veiculo {// acabou de atribuir classe para veiculo private para public, entao nesse caso encapsulamos para acessar privado como publico 

	// Atributos privados
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	
	
	//para transformar o private para public clicar com o botao direito do mouse --> buscar source --> e depois generation getters and setters 

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapCombustivel() {
		return capCombustivel;
	}
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	
	

}
