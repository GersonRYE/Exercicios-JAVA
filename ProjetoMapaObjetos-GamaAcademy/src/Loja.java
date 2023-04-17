import java.util.HashMap;

// hashmao utilizado para busca
public class Loja {

	public static void main(String[] args) {
/*Rappers
 * 
 * 
 * Integer - int
 * Double - double
 * Float - float
 * Character - char 
 * */

		HashMap<Integer, Produto> mapa;
		mapa = new HashMap<Integer, Produto>();
		
		mapa.put(1, new Produto(1, "Computador", 1500.0));
		mapa.put(2, new Produto(2, "Mouse", 1500.0));
		mapa.put(3, new Produto(3, "Teclado", 1500.0));
		mapa.put(4, new Produto(4, "Monitor", 1500.0));
		
		
		int codigoABuscar = 3;
		
		Produto p = mapa.get(codigoABuscar);
		if(p != null) {
			System.out.println("Encontrei:" + p);
		}else {
			System.out.println("Não existe");
		}
	}
}
