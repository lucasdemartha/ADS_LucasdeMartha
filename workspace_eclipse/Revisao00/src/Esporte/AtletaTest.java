package Esporte;

import org.junit.jupiter.api.Test;

public class AtletaTest {
	
	@Test
	
	void testarConstrutor() {
		Pessoa pessoaRoberto = new Pessoa ("Roberto", 40);
		
		System.out.println(pessoaRoberto.nome);
		System.out.println(pessoaRoberto.idade);
		
		Atleta atletaEdson = new Atleta("Edson",21,80,false);
		
		System.out.println("====================================");
		System.out.println(atletaEdson.nome);
		System.out.println(atletaEdson.idade);
		System.out.println(atletaEdson.peso);
		System.out.println(atletaEdson.aposentado);
		
	}

}
