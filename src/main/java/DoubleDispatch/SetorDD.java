package DoubleDispatch;

public abstract class SetorDD {
	private double custo;

	public SetorDD(double custo) {
		super();
		this.custo = custo;
	}
	
	public void addOperacoes(SistemaPortuario sistemaPortuario) {
		sistemaPortuario.addOperacao(OperacoesPortuarias.CUSTO_DA_OPERACAO, custo);
	}
	
}
