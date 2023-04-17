import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {

	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resulSet = null;

	public void conectar() {
		// Criação da variavel para conctar ao database
		String servidor = "jdbc:mysql://localhost/ibm";
		String usuario = "root";
		String senha = "root";
		String driver = "com.mysql.cj.jdbc.Driver";

		// Permite verificar o tratamento da exceção caso ok banco de dados
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public boolean estadoConectado() {
		if (this.connection != null) {
			return true;
		} else {
			return false;
		}

	}

	// criando o metodo para fazer a consulta de dados em sql para trazer os
	// registros
	public void listarContatos() {

		try {
			// tratando a conexão do nosso retorno do select
			// o mysql não é case sensitive
			String query = "SELECT * FROM 	contatos";
			this.resulSet = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();

			// criando um laço de repetição para retornan os registros da nossa tabela
			while (this.resulSet.next()) {
				String id = resulSet.getString("id");
				String nome = resulSet.getString("nome");

				System.out.println("id: " + id);
				System.out.println("nome: " + nome);
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());

		}
	}

	// criando metodo de inserção de registros
	public void inserirContatos(String nome) {
		try {
			// linha de execução da sintaxe de insert em SQL
			String query = "INSERT INTO contatos (nome) values ('" + nome + "');";
			System.out.println(query);
			this.statement.execute(query);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void atualizarCliente(String nome, int id) {
		try {

			String query = "UPDATE contatos SET nome = '" + nome + "' WHERE id = '" + id + "';";
			System.out.println(query);
			this.statement.execute(query);
			System.out.println("Contato Atualizado!");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	
	public void controleEstoque() {
		
	}

}
