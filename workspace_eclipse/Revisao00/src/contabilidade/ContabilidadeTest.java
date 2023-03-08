package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContabilidadeTest {
	
	@Test
	void testEmpresaMEI() {
		EmpresaMEI empresa = new EmpresaMEI(100.0);
		
		Double valorIREsperado = 27.5;
		assertEquals(valorIREsperado, empresa.getValorIR(), 2);
		
		Double ValorISSEsperado = 0.0;
		assertEquals(ValorISSEsperado, empresa.getValorISS(), 2);
	}
	
	@Test
	void testEmpresaSimples() {
		EmpresaSimples empresa = new EmpresaSimples(100.0);
		
		Double valorIREsperado = 15.0;
		assertEquals(valorIREsperado, empresa.getValorIR(), 2);
		
		Double ValorISSEsperado = 8.0;
		assertEquals(ValorISSEsperado, empresa.getValorISS(), 2);
	}
	
	
}
