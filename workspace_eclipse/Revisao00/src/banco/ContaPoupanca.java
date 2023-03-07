package banco;

public class ContaPoupanca extends Conta {

	@Override
	void rentabilizar() {
		
		this.saldo *= 1.02;
		
	}

}
