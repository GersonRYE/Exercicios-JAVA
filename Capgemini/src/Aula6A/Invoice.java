package Aula6A;

public class Invoice {

	private int codigoItem;
	private String descricao;
	private int quantidade;
	private float precoUnitairo;

	public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitairo) {
		this.setCodigoItem(codigoItem); 
		this.setDescricao(descricao);
		setQuantidade(quantidade);
		setPrecoUnitairo(precoUnitairo);
	}

	public double getInvoiceAmount() {
		return this.quantidade * this.precoUnitairo;
	}

	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}

	}

	public float getPrecoUnitairo() {
		return precoUnitairo;
	}

	public void setPrecoUnitairo(float precoUnitairo) {
		if (precoUnitairo < 0) {
			this.precoUnitairo = 0;
		} else {
			this.precoUnitairo = precoUnitairo;
		}

	}

}
