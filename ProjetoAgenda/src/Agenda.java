
public class Agenda {

	public static void main(String[] args) {

		BancoDeDados sintaxeDoBanco = new BancoDeDados();
		sintaxeDoBanco.conectar();

		if (sintaxeDoBanco.estadoConectado()) {
			// permite chamar a opção read do nosso crud
			System.out.println("Todos os registros");
			sintaxeDoBanco.listarContatos();
			
			// inserção
//			System.out.println("Inserindo");
//			sintaxeDoBanco.inserirContatos("Gerson2");
//			sintaxeDoBanco.listarContatos();
			
//			
//			System.out.println("Atualizando");
//			sintaxeDoBanco.atualizarContato("gerson");
			
//			sintaxeDoBanco.deletarContato(1);
			System.out.println("Conexao com o banco de dados foi com exito");
		}else {
			System.out.println("Erro");
		}
	}

}
