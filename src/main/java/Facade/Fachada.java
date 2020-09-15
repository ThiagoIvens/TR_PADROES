package Facade;

public class Fachada {
	public int operacao;
	public String opcao;
	
	public Fachada(int operacao, String opcao) {
		super();
		this.opcao = opcao;
		if(operacao == 0) {
			System.out.println(new SystemInf().verificaOpcao(opcao));
		}
		if(operacao == 1) {
			System.out.println(new SystemOp().verificaOpcao(opcao));
		}
	}
}
