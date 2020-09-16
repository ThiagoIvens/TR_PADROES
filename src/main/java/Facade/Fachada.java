package Facade;

public class Fachada {
	public int operacao;
	public String opcao;
	
	public Fachada(int operacao, String opcao) {
		super();
		this.opcao = opcao;
		if(operacao == 0) {
			new SystemADM().verificaOpcao(opcao);
		}
		if(operacao == 1) {
			new SystemOp().verificaOpcao(opcao);
		}
	}
}
