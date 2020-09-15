package composite;

public class TrajetoComposto implements TrajetoDoNavio {

	private TrajetoDoNavio linha1;
	private TrajetoDoNavio linha2;
	private int tempoParada;

	public TrajetoComposto(TrajetoDoNavio linha1, TrajetoDoNavio linha2, int tempoParada) {
		super();
		this.linha1 = linha1;
		this.linha2 = linha2;
		this.tempoParada = tempoParada;
		if(!linha1.getDestino().contentEquals(linha2.getOrigem())) {
			throw new RuntimeException("Atenção: O destino de chegada da primeira linha nao coincede com a origem da segunda linha!");
		}
	}

	public String getOrigem() {
		return linha1.getOrigem();
	}

	public String getDestino() {
		return linha2.getDestino();
	}

	public int getTempo() {
		return linha1.getTempo() + linha2.getTempo() + tempoParada;
	}

	@Override
	public String toString() {
		return linha1.toString() + "\n" + linha2.toString();
	}
	
	
	
}
