package state.artigo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZzzArtigo {
	
	private String estado;
	
	private List<String> logHistorico = new ArrayList<>();
	
	public ZzzArtigo() {
		this.estado = "RASCUNHO"; //estado inicial
	}

	public String getEstado() {
		return estado;
	}

	public List<String> getLogHistorico() {
		return logHistorico;
	}
	
	public void publicar() {
		
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			if(gerenteDeSeguranca.ehUsuarioAutor()) {
				this.estado = "REVISANDO";
				this.logHistorico.add("Transitado para revisando em " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para publicar");
			}
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(gerenteDeSeguranca.ehUsuarioModerador()) {
				this.estado = "APROVADO";
				this.logHistorico.add("Transitado para aprovado em " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para publicar");
			}
		}
		
		if("APROVADO".equals(this.estado)) {
			return;
		}
	}
	
	public void reprovar() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			return;
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(gerenteDeSeguranca.ehUsuarioModerador()) {
				this.estado = "RASCUNHO";
				this.logHistorico.add("Transitado para rascunho em " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para reprovar");
			}
		}
		
		if("APROVADO".equals(this.estado)) {
			return;
		}
	}
	
}
