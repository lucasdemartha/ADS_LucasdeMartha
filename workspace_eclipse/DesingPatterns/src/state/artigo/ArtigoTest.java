package state.artigo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArtigoTest {

	
	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() {
		
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		//1. Rascunho > Revisando
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		//2. Revisando > Aprovado
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoAprovado);
		
		//Imprime o historico
		
		artigo.getLogHistorico().forEach(System.out::println);
		
	}
	
	@Test
	void deveArtigoTransitarDeRascunho_Revisando_Rascunho() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		//1. Rascunho > Revisando
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		//2. Revisando > Rascunho
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.reprovar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		
		//Imprime o historico
		
		artigo.getLogHistorico().forEach(System.out::println);
		
	}
	
}
