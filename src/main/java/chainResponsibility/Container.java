package chainResponsibility;

public class Container {

	private String codigo;
	private String tipo;

	public Container(String codigo, String tipo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
