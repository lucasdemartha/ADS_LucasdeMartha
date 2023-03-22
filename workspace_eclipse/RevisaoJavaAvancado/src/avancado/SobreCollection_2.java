package avancado;

import java.util.ArrayList;
import java.util.Collection;

public class SobreCollection_2 {
	
	public static void main(String[] args) {
		
		Collection<String> engenhariasAtuais = new ArrayList<String>();
		
		engenhariasAtuais.add("Telecomunicações");
		engenhariasAtuais.add("Biomédica");
		engenhariasAtuais.add("Computação");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Produção");
		
		System.out.println("Engenharias atuais:" + engenhariasAtuais);
		
		Collection<String> engenhariasFuturas = new ArrayList<String>();
		
		engenhariasFuturas.add("Mecânica");
		engenhariasFuturas.add("Mecatrônica");
		System.out.println("Engenharias futuras:" + engenhariasFuturas);

		Collection<String> todas = new ArrayList<String>();
		
		todas.addAll(engenhariasAtuais);
		todas.addAll(engenhariasFuturas);
		
		System.out.println("Engenharias:" + todas);
		
		System.out.println("");
		System.out.println("IsEmpty() e size()");
		
		Collection<String> engenharias = new ArrayList<>(todas);
		
		System.out.println("Engenharias vazias? " + engenharias.isEmpty());
		System.out.println("Qts elementos engenharias tem? " + engenharias.size());
		
		System.out.println("");
		System.out.println("antes do clear()");
		
		imprimirStatusDaColecao(engenharias);
		
		System.out.println("invocando clear()");
		engenharias.clear();
		
		imprimirStatusDaColecao(engenharias);
		
	}
	
	private static void imprimirStatusDaColecao(Collection<String> engenharias) {
		
		if (engenharias.isEmpty()) {
			System.out.println("Vazio");
		}else {
			System.out.println("Tem elementos");
		}
		
	}

}
