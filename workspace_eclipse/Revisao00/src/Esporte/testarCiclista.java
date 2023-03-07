package Esporte;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


public class testarCiclista {
	@Test
	void testarCiclista() {
		
		Ciclista ciclista = new Ciclista("Thiago", 44, 85, false);
		assertFalse(ciclista.aposentado);
		
		System.out.println("Está aposentado?");
		if(ciclista.aposentado) {
			System.out.println("Sim");
		}
		else {
			System.out.println("Não");
		}
		
		ciclista.pedalar();
		ciclista.envelhecer();
		ciclista.aposentar();
		assertTrue(ciclista.aposentado);
		
		System.out.println("Agora já está aposentado");
		System.out.println(ciclista.aposentado ? "Sim" : "Não");
	}
	

}
