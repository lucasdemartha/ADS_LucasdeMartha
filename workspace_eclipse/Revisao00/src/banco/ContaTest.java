package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;


public class ContaTest {
	
	@Test
	void testConta_toString() {
		Conta conta = new ContaCorrente();
		conta.depositar(100.00);
		conta.sacar(10.0);
		
		String str = conta.toString();
		System.out.println(str);
	}
	
	@Test
	void testPolimorfismo() {
		
		boolean flagContaCorrenteComoDefault = false;
		
		Conta conta = null;
		
		if(flagContaCorrenteComoDefault) {
			conta = new ContaCorrente();
		}
		else {
			conta = new ContaPoupanca();
		}
		
		conta.depositar(1000.00);
		
		conta.rentabilizar();

		System.out.println(conta.getClass().getCanonicalName();
		System.out.println(conta.saldo);
	}

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
