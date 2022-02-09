package Interfaces;

public class ParticipanteForum implements Leitor, Programador {
	String pensamento;

	public String lendo() {
		return "Forum";
	}
	public void pensando(char[] ideias) {
		pensamento = new String(ideias);
		
	}
	public String digitando() {
		return pensamento;
	}
	private String aprendendo() {
		return "JAVA";
	}
	public String getPensamento() {
		return pensamento;
	}
	public void setPensamento(String pensamento) {
		this.pensamento = pensamento;
	}

}
