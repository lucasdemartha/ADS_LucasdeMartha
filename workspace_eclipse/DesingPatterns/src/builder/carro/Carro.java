package builder.carro;

public class Carro {
	
	private Porta[] portas;
	private Motor m;
	private ComputadorBordo cb;
	private FreioABS f;
	
	public Porta[] getPortas() {
		return portas;
	}
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	public Motor getM() {
		return m;
	}
	public void setM(Motor m) {
		this.m = m;
	}
	public ComputadorBordo getCb() {
		return cb;
	}
	public void setCb(ComputadorBordo cb) {
		this.cb = cb;
	}
	public FreioABS getF() {
		return f;
	}
	public void setF(FreioABS f) {
		this.f = f;
	}

	
	
}
