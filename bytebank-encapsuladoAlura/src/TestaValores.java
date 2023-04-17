
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16549);
		System.out.println(conta2.getAgencia());
		
		Conta conta3 = new Conta(1337, 16548);
		System.out.println(conta3.getAgencia());
		
		System.out.println(Conta.getTotal());


	}

}
