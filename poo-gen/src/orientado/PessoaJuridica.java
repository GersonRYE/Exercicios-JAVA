package orientado;

public class PessoaJuridica extends Dados {
	private String cnpj;
	private String telefoneContato;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public String dadosJuridico() {
		return "O nome é: " + getNome() + ", CNPJ: " + getCnpj();
	}

}
