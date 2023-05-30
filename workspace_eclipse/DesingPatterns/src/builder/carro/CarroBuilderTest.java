package builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderTest {

	@Test
	void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
		//partesvalidas
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista,portaPassageiro};
		ComputadorBordo cbSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		//chamando buikder
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildPortas(portas);
		builder.buildComputadorBordo(cbSiemens);
		builder.buildFreioABS(freioBosch);
		Carro carroPronto = builder.GetCarro();
		
		
		//validando carro
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getM());
		assertNotNull(carroPronto.getPortas());
		assertTrue(carroPronto.getPortas().length == 2);
		assertNotNull(carroPronto.getCb());
		assertNotNull(carroPronto.getF());
		
	}
	@Test
	void dadoPortasInvalidas_quandoGetCarro_entaoException() {
		//partesvalidas
		Motor motorVTEC = new Motor();
		Porta[] portas = {};
		ComputadorBordo cbSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		//chamando buikder
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildPortas(portas);
		builder.buildComputadorBordo(cbSiemens);
		builder.buildFreioABS(freioBosch);
		
		//validando carro
		try {
			builder.GetCarro();
			fail();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Test
	void dadoSemMotor_quandoGetCarro_entaoException() {
		//partesvalidas
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista,portaPassageiro};
		ComputadorBordo cbSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		//chamando builder
		CarroBuilder builder = new CarroBuilder();
		builder.buildPortas(portas);
		builder.buildComputadorBordo(cbSiemens);
		builder.buildFreioABS(freioBosch);
		
		//validando carro
		try {
			builder.GetCarro();
			fail();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}