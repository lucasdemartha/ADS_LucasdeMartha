package state.statuspedido;

public enum StatusPedido {
	
	INICIAL {
		public StatusPedido AVANCAR() {
			return PAGO;
		}
		public StatusPedido CANCELAR() {
			return CANCELADO;
		}
	}
	,
	PAGO {
		public StatusPedido AVANCAR() {
			return ENTREGUE;
		}
		public StatusPedido CANCELAR() {
			return CANCELADO;
		}
	}
	,
	ENTREGUE {
		public StatusPedido AVANCAR() {
			return FINALIZADO;
		}
		public StatusPedido CANCELAR() {
			return CANCELADO;
		}
	}
	,
	FINALIZADO {
		public StatusPedido AVANCAR() {
			return FINALIZADO;
		}
		public StatusPedido CANCELAR() {
			return FINALIZADO;
		}
	}
	,
	CANCELADO {
		public StatusPedido AVANCAR() {
			return CANCELADO;
		}
		public StatusPedido CANCELAR() {
			return CANCELADO;
		}
	}
	;
	
	abstract StatusPedido AVANCAR();
	abstract StatusPedido CANCELAR();
	
}
