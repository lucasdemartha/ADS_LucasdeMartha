package avancado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SobreStreams {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto(1L, "Cadeira", 100.0));
		produtos.add(new Produto(2L, "Cama", 400.0));
		produtos.add(new Produto(3L, "Mesa", 200.0));
		produtos.add(new Produto(4L, "Sofa", 500.0));
		produtos.add(new Produto(5L, "Cadeira", 150.0));
		
		
		List<Produto> produtosFiltrados = produtos.stream()
				.filter(p -> p.getPreco() > 300.00)
				.collect(Collectors.toList());
		
		produtosFiltrados.forEach(System.out::println);
		
		List<String> descricoes = produtos.stream(	)
				.map(p -> p.getDescricao())
				.collect(Collectors.toList());
		
		descricoes.forEach(System.out::println);
		
		Double precoTotal = produtos.stream()
				.map(p -> p.getPreco())
				.reduce(0.0,Double::sum);
		System.out.println( precoTotal );
		
		List<Produto> produtosFiltrados300 = produtos.stream()
				.filter(p -> p.getPreco() < 300.00)
				.collect(Collectors.toList());
		
		produtosFiltrados300.forEach(System.out::println);

	}

}
