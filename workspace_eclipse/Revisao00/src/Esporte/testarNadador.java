package Esporte;

import org.junit.jupiter.api.Test;

public class testarNadador {
	
	@Test
	void testarNadador() {
		Nadador nadador = new Nadador ("Gustavo", 35, 90, false);
		nadador.nadar();
		
		nadador.envelhecer();
		System.out.println(nadador.idade);
		
		nadador.aposentar();
		System.out.println(nadador.aposentado);
		
	}

}
