package FluentInterfaces;

public class Motorista {	
	private String nome;
	private String cpf;
	private CaminhaoFI caminhao;
	
	public Motorista chamado(String nome) {
		this.nome = nome;
		return this;
	}
	
	public Motorista comCPF(String cpf) {
		this.cpf = cpf;
		return this;
	}
	
	public Motorista donoDoCaminhao(CaminhaoFI placa) {
		this.caminhao = placa;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public CaminhaoFI getCaminhao() {
		return caminhao;
	}
	
	
	
}
