package ExerciciosOrientaçãoObjetosPatinete;

public class TestePatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patinete p1 = new Patinete();
		
		p1.tipoPatinete = "KickBoards";
		p1.cor = "Vermelho";
		p1.qtdRodas = 3;
		
		System.out.println("Tipo de Patinete: " + p1.tipoPatinete);
		System.out.println("Cor do Patinete: " + p1.cor);
		System.out.println("Quantidade de rodas: " + p1.qtdRodas);
		
		p1.destinado();
		

	}

}
