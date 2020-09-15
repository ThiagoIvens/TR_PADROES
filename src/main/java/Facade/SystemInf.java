package Facade;

public class SystemInf {
	
	
	public SystemInf() {
		super();
	}

	public String verificaOpcao(String opcao) {
		if (opcao.contentEquals("gerente")) {
			return "O Gerente chega em 10 minutos!";
		} else {
			if (opcao.contentEquals("nota")) {
				return "Gerando Nota...";
			} else {
				return "Informação inexistente!";
			}
		}
	}
}
