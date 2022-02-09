package orientado;

public class TesteDados {

	public static void main(String[] args) {
		PessoaFisica f = new PessoaFisica();
		f.setNome("Jhonathan");
		f.setIdade(39);
		f.dadosCompletos();
		f.setCpf("123.654.635-58");
		f.setEmail("gersonespejo125@gmail.com");
		
		PessoaJuridica j = new PessoaJuridica();
		j.setNome("Gerson");
		j.setEmail("gersonespejo127@gmail.com");
		j.setTelefoneContato("2695-5654");
		j.setCnpj("1236.6564.5649.8");
		

		System.out.println(f.getNome());
		System.out.println(f.getIdade());
		System.out.println(f.dadosCompletos());
		System.out.println(f.getCpf());
		System.out.println(f.getEmail());
		
		
		System.out.println(j.dadosJuridico());
		
		
		// incluir as informações de CPF e email para a pessoa fisica
		// criar a classe para a pessoa juridica com CNPJ e telefone de contato
	}

}
