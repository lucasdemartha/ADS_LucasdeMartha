package avancado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class SobreCollection_1 {
	
	public static void main(String[] args) {
		
		Collection<String> colecao = buildCollectionImplementation();
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		System.out.println(colecao);		


	}

	/*private static Collection<String> buildCollectionImplementation() {
		return new HashSet<String>();
	}*/
	
	private static Collection<String> buildCollectionImplementation() {
		return new TreeSet<String>();
	}

}
