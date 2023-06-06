package strategy.comparator;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void deveOrdenarListaDeAnimaisPeloNome() {
		List<Animal> listaDeAnimais = new ArrayList<>();
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		System.out.println("Lista Original: ");
		listaDeAnimais.forEach(System.out::println);
		listaDeAnimais.sort(new ComparadorPorNome());
		System.out.println("Lista Ordenada por nome: ");
		listaDeAnimais.forEach(System.out::println);
	}
	@Test
	void deveOrdenarListaDeAnimaisPeloI() {
		List<Animal> listaDeAnimais = new ArrayList<>();
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		System.out.println("Lista Original: ");
		listaDeAnimais.forEach(System.out::println);
		listaDeAnimais.sort(new ComparadorPorId());
		System.out.println("Lista Ordenada por ID: ");
		listaDeAnimais.forEach(System.out::println);
	}

}