package staticFactory_Singleton;

public class TruckVisitor {

	private String cpf;
	private String estado;
	private String tipoTarefa;
	private static TruckVisitor truck;

	private TruckVisitor(String cpf) {
		super();
		this.cpf = cpf;
		estado = "Aguardando";
		tipoTarefa = "";
	}

	public TruckVisitor(String cpf, String estado, String tipoTarefa) {
		super();
		this.cpf = cpf;
		this.estado = estado;
		this.tipoTarefa = tipoTarefa;
	}

	// cria com cpf e o tipo da tarefa a ser realizado---------------------------------------
	public static TruckVisitor criarCpfTarefa(String cpf, String tipoTarefa) {
		if (truck != null) {
			limpa();
			truck.setCpf(cpf);
			truck.setTipoTarefa(tipoTarefa);
			return truck;
		}

		if (!valida(cpf))
			return null;
		if (!valida(tipoTarefa))
			return null;

		TruckVisitor tv = new TruckVisitor(cpf);
		tv.setTipoTarefa(tipoTarefa);
		return tv;
	}

	// cria somente com cpf e estado - zerando os outros argumentos---------------------------
	public static TruckVisitor criarCpfEstado(String cpf, String estado) {
		if (truck != null) {
			limpa();
			truck.setCpf(cpf);
			truck.setEstado(estado);
			return truck;
		}

		if (!valida(cpf))
			return null;
		TruckVisitor tv = new TruckVisitor(cpf);
		tv.setEstado(estado);
		return tv;
	}

	// cria com todos os argumentos;----------------------------------------------------------
	public static TruckVisitor criaTodos(String cpf, String estado, String tipoTarefa) {
		if (truck != null) {
			truck.setCpf(cpf);
			truck.setEstado(estado);
			truck.setTipoTarefa(tipoTarefa);
			return truck;
		}

		if (!valida(cpf))
			return null;
		if (!valida(estado))
			return null;
		if (!valida(tipoTarefa))
			return null;
		return new TruckVisitor(cpf, estado, tipoTarefa);
	}

	// valida o argumento passado--------------------------------------------------------------
	public static boolean valida(String string) {
		return !string.isBlank();
	}

	// limpa os elementos do truck-------------------------------------------------------------
	public static void limpa() {
		truck.setCpf("");
		truck.setEstado("");
		truck.setTipoTarefa("");
	}
	
	// Getters and setters---------------------------------------------------------------------

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoTarefa() {
		return tipoTarefa;
	}

	public void setTipoTarefa(String tipoTarefa) {
		this.tipoTarefa = tipoTarefa;
	}

}
