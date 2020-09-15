package State;

public class Gate {
	protected GateState estado;

	public Gate() {
		estado = new GateFree();

	}

	public void ficouLivre() {
		estado = estado.free();
	}

	public void ficouOcupado() {
		estado = estado.busy();
	}

	public void gateFechado() {
		estado = estado.closed();
	}

}
