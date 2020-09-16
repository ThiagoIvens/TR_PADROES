package DoubleDispatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaPortuario {
	private List<SetorDD> setores = new ArrayList<SetorDD>();
	private Map<OperacoesPortuarias, Double> operacoesPortuarias;

	public void addSetor(SetorDD setor) {
		getSetores().add(setor);
		setor.addOperacoes(this);

	}

	public void addOperacao(OperacoesPortuarias tipo, double custoDaOperacao) {
		getOperacoesPortuarias().put(tipo, getOperacoesPortuarias().get(tipo) + custoDaOperacao);
	}

	public double getTotal() {
		if (setores.isEmpty()) {
			return 0.0;
		}
		double total = 0;
		
		total += getOperacoesPortuarias().get(OperacoesPortuarias.CUSTO_DA_OPERACAO);
		total += getOperacoesPortuarias().get(OperacoesPortuarias.CUSTO_FUNCIONARIO);
		total += getOperacoesPortuarias().get(OperacoesPortuarias.CUSTO_DE_MAQUINARIO);

		return total;
	}

	public List<SetorDD> getSetores() {
		if (setores == null)
			setores = new ArrayList<SetorDD>();
		return setores;
	}

	public Map<OperacoesPortuarias, Double> getOperacoesPortuarias() {
		if (operacoesPortuarias == null) {
			operacoesPortuarias = new HashMap<OperacoesPortuarias, Double>();
			for (OperacoesPortuarias tipo : OperacoesPortuarias.values())
				operacoesPortuarias.put(tipo, 0.0);
		}
		return operacoesPortuarias;
	}

}
