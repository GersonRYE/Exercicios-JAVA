package ExerciciosOrientaçãoObjetosContaBancaria;

public class ContaBancaria {
	String nome;
	String estadoCivil;
	int nConta;
	int rendimento;
	
	
	void rendimentoMes() {
		 {
		if(rendimento == 1) {
			System.out.println("O rendimento mes atual foi de R$3000,00");
			
		}else if(rendimento == 0) {
			System.out.println("Ok! Você não quer saber o seu rendimento, muito obrigado");
			
		}else {
			System.out.println("Número invalido!");
			
		}
		rendimento = 0;
		}
	}
}
