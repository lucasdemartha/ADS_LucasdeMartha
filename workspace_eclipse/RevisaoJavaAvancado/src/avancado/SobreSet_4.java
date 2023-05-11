package avancado;

import java.util.HashSet;
import java.util.Set;

public class SobreSet_4 {
public static void main(String[] args) {
		
		Set<Animal> setDeAnimais = new HashSet<>();
		
		setDeAnimais.add(new Animal(1L,"Tartaruga"));
		setDeAnimais.add(new Animal(2L,"Coelho"));
		setDeAnimais.add(new Animal(3L,"Cachorro"));
		setDeAnimais.add(new Animal(4L,"Gato"));
		setDeAnimais.add(new Animal(2L,"Coelho"));
		
		
		
		setDeAnimais.forEach(System.out::println);
		
	}
}
