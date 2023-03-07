package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {
	
	
	@Test
	void testarContaCorrente() {
		
		Double saldoEsperado = 101.0;
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100.0);
		contaCorrente.rentabilizar();
			
		
		assertEquals(saldoEsperado, contaCorrente.saldo);
	}
	
	@Test
	void testarContaPoupanca() {
		
		Double saldoEsperado = 102.0;
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.depositar(100.0);
		contaPoupanca.rentabilizar();
			
		
		assertEquals(saldoEsperado, contaPoupanca.saldo);
		
	}

}
