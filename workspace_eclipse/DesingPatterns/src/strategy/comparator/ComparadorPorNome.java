package strategy.comparator;

import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Animal>{

	@Override
	public int compare(Animal a1, Animal a2) {
		// TODO Auto-generated method stub
		return a1.getNome().compareTo(a2.getNome());
	}

}