import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Loja {
	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<Produto>();
		lista.add(new Produto(1, "Computador", 1500.0));
		lista.add(new Produto(2, "Mouse", 30.0));		
		lista.add(new Produto(3, "Teclado", 80.0));
		lista.add(new Produto(4, "Monitor", 450.0));
		lista.add(new Produto(5, "Impressora", 600.0));
		lista.add(new Produto(6, "Notebook", 2500.0));
		
		lista.stream().forEach((p) -> {
			System.out.println(p);
		});
		System.out.println("----------------------------");
		System.out.println("Produtos em ordem alfabetica");
		lista.stream().sorted(Comparator.comparing(p -> p.getNome())).forEach(p -> System.out.println(p));
		
		System.out.println("----------------------------");
		System.out.println("Produtos em ordem alfabetica");
		lista.stream().sorted(Comparator.comparing(p -> p.getPreco())).forEach(p -> System.out.println(p));
		
		System.out.println("----------------------------");
		System.out.println("Obtendo o produto mais alto");
		Produto produtoMaisCaro = lista.stream().max(Comparator.comparing(p -> p.getPreco())).orElse(null);
		if(produtoMaisCaro != null) {
			System.out.println("Produto mais caro = " + produtoMaisCaro);	
		}
		
		System.out.println("----------------------------");
		System.out.println("Obtendo o produto mais barato");
		Produto produtoMaisBarato = lista.stream().min(Comparator.comparing(p -> p.getPreco())).orElse(null);
		if(produtoMaisCaro != null) {
			System.out.println("Produto mais caro = " + produtoMaisBarato);	
		}
		
		
	}
}
