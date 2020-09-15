package NullObject;

public class SeguroDoContainer {
	private String empresa;
	private int tempo;

	public SeguroDoContainer() {
		super();
	}

	public SeguroDoContainer(String empresa, int tempo) {
		super();
		this.empresa = empresa;
		this.tempo = tempo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

}
