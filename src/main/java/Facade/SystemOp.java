package Facade;

public class SystemOp {
	public SystemOp() {
		super();
	}

	public void verificaOpcao(String opcao) {
		if (opcao.contentEquals("Descarga")) {
			System.out.println( "[Operacional] Conteiner encaminhado para operação de Descarga");
		} else {
			if (opcao.contentEquals("Carga")) {
				System.out.println("[Operacional] Conteiner encaminhado para operação de Carga");
			} else {
				System.out.println("[Operacional] Operação inexistente!");
			}
		}
	}
}
