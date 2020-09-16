package Flyweight;

public class ContainerInf {
	private String codigo;
	private String cor;
	
	public ContainerInf(String cor) {
		super();
		this.cor = cor;
	}

	public void Imprimir() {
		System.out.println("Codigo: " + codigo +", Cor: " + cor);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
