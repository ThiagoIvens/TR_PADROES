package NullObject;

public class ContainerNullObject {
	private String codigo;
	private SeguroDoContainer seguro;

	public ContainerNullObject(String codigo) {
		super();
		this.setCodigo(codigo);
	}

	public SeguroDoContainer getSeguro() {
		return seguro;
	}

	public void setSeguro(SeguroDoContainer seguro) {
		this.seguro = seguro;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
