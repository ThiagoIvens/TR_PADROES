package chainResponsibility;

public abstract class LocalizarContainer {
	private LocalizarContainer patioSeguinte;

	public LocalizarContainer(LocalizarContainer patioSeguinte) {
		this.patioSeguinte = patioSeguinte;
	}
	
	public Container encontrar(String codigo) {
		Container container = acharContainer(codigo);
		if(container == null)
			return proximoPatio(codigo);
		else
			return container;
	}
	
	private Container proximoPatio(String codigo) {
		if(patioSeguinte == null) 
			throw new RuntimeException("O container: " + codigo + " não esta em nenhum patio!");
		return patioSeguinte.encontrar(codigo);
	}
	
	protected abstract Container acharContainer(String codigo);
	
	protected abstract void addContainer(String nome, String tipo);
}
