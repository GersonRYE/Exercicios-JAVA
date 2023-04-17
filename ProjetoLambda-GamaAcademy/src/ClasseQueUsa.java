/*
 * Lambda apenas utilizado quando a interface possuir apenas um metodo
 * 
 * lambda pode ser utilizado em strems- logica para manipular listas
 * */
public class ClasseQueUsa {

	public static void main(String[] args) {

		InterfaceServico i;
		i = new InterfaceServico() {

			@Override
			public void executa(int valor) {
				// TODO Auto-generated method stub
				System.out.println("Estou executando algo...");
			}
		};
		i.executa(0);

		InterfaceServico i2 = (valor) -> {
			System.out.println("Outra logica..." + valor);
		};
		i2.executa(10);

	}

}
