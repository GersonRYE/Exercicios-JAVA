package com.projeto.simples;

public class ArCondicionado extends Eletros implements IEletros  {
	private int refrigeracao;

	public int getRefrigeracao() {
		return refrigeracao;
	}

	public ArCondicionado(String nome, String cor, String marca, String modelo, String disjuntor, int tensao,
			double preco, double fio, double kwhMes, int refrigeracao) {
		super(nome, cor, marca, modelo, disjuntor, tensao, preco, fio, kwhMes);
		this.refrigeracao = refrigeracao;
	}

	public void setRefrigeracao(int refrigeracao) {
		this.refrigeracao = refrigeracao;
	}

	@Override
	public void verInfo() {
		System.out.println("As informacoes do modelo indicado e: ");
		System.out.println("Nome: " + getNome() + ", cor: " + getCor() + ", marca: " + getMarca() + "\n" + "modelo: "
				+ getModelo() + ", Disjuntor " + getDisjuntor() + ", tensao: " + getTensao() + "\n" + "preco: "
				+ getPreco() + ", fio " + getFio() + ", gasto por mes " + getKwhMes() + "Refrigeracao: "
				+ getRefrigeracao());
	}

}
