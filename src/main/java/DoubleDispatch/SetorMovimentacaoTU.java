package DoubleDispatch;

public class SetorMovimentacaoTU extends SetorDD {
	private double custoDeMaquinario;

	public SetorMovimentacaoTU(double custo, double custoDeMaquinario) {
		super(custo);
		this.custoDeMaquinario = custoDeMaquinario;
	}

	public void addOperacoes(SistemaPortuario sistemaPortuario) {
		super.addOperacoes(sistemaPortuario);
		sistemaPortuario.addOperacao(OperacoesPortuarias.CUSTO_DE_MAQUINARIO, custoDeMaquinario);
	}

}
