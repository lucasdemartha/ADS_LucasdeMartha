package builder.carro;

public class CarroBuilder {
	
private Carro carro;
	
	public CarroBuilder() {
		this.carro = new Carro();
	}
	
	public void buildPortas(Porta[] portas) {
		carro.setPortas(portas);
	}
	public void buildMotor(Motor m) {
		carro.setM(m);
	}
	public void buildComputadorBordo(ComputadorBordo cb) {
		carro.setCb(cb);
	}
	public void buildFreioABS(FreioABS freio) {
		carro.setF(freio);
	}
	public Carro GetCarro() {
		validarPortas();
		validarMotor();
		return carro;
	}
	
	private boolean validarPortas() {
		if (carro.getPortas()== null || 
				(carro.getPortas().length != 2 && carro.getPortas().length != 4)
				) {
			throw new IllegalArgumentException("Numero de portas invalido");
		}else {
			return true;
		}
	}
	private boolean validarMotor() {
		if (carro.getM()== null ) {
			throw new IllegalArgumentException("Carro sem motor");
		}else {
			return true;
		}
	}

}
