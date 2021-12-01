package ExerciciosOrientaçãoObjetosCliente;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente();
		
		c1.nome ="Augusto";
		c1.idade = 28;
		c1.Status = "Divida";
		
		System.out.println(c1.nome);
		System.out.println(c1.idade);
		System.out.println(c1.Status);
		
		c1.divida();
		

	}

}
