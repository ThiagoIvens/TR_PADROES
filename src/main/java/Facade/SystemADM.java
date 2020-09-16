package Facade;

public class SystemADM {
	
	
	public SystemADM() {
		super();
	}

	public void verificaOpcao(String opcao) {
		if (opcao.contentEquals("gerente")) {
			System.out.println("[Informativo] O Gerente chega em 10 minutos!");
		} else {
			if (opcao.contentEquals("nota")) {
				System.out.println("[Informativo] Gerando Nota...");
			} else {
				System.out.println("[Informativo] Informação inexistente!");
			}
		}
	}
}
