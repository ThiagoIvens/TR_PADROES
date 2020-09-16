package DoubleDispatch;

public class PatioDeTU extends SetorDD {
	private double custoDoFuncionario;
	private double tempoDeOperacao;

	public PatioDeTU(double custo, double tempoDeOperacao, double custoDoFuncionario) {
		super(custo);
		this.tempoDeOperacao = tempoDeOperacao;
		this.custoDoFuncionario = custoDoFuncionario;
	}

	public void addOperacoes(SistemaPortuario sistemaPortuario) {
		super.addOperacoes(sistemaPortuario);
		custoDoFuncionario = custoDoFuncionario*tempoDeOperacao;
		sistemaPortuario.addOperacao(OperacoesPortuarias.CUSTO_FUNCIONARIO, custoDoFuncionario);
	}

}
