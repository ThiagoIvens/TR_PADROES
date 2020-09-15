package Facade;

public class SystemOp {
	public SystemOp() {
		super();
	}

	public String verificaOpcao(String opcao) {
		if (opcao.contentEquals("Descarga")) {
			return "Conteiner encaminhado para operação de Descarga";
		} else {
			if (opcao.contentEquals("Carga")) {
				return "Conteiner encaminhado para operação de Carga";
			} else {
				return "Operação inexistente!";
			}
		}
	}
}
