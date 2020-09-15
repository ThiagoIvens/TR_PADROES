package composite;

public class TrajetoSimples implements TrajetoDoNavio {

	private String origem;
	private String destino;
	private int tempo;

	public TrajetoSimples(String origem, String destino, int tempo) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.tempo = tempo;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return origem + " : " + destino;
	}
	
}
