package Bridge;

public class Caminhao {
	private String placa;
	private String cpf;

	public Caminhao(String placa, String cpf) {
		super();
		this.placa = placa;
		this.cpf = cpf;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
