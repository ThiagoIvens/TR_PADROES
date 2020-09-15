package ProxyDecorator;

public class DecoratorDAO implements PatioDAOInterface{
	private static PatioDAOInterface patioDAO;
	
	public PatioDAOInterface getDAO() {
		if(patioDAO == null) 
			patioDAO = new ProxyDAO();
		return patioDAO;
	}
	
	@Override
	public void newPatio(String nome) {
		if(nome.isBlank()) 
			throw new RuntimeException("O nome não pode estar em branco.");
		getDAO().newPatio(nome);
	}

	@Override
	public PatioDAO recuperaPatio(String nome) {
		if(nome.isBlank()) 
			throw new RuntimeException("O nome não pode estar em branco.");
		PatioDAO patio = getDAO().recuperaPatio(nome);
		if (patio == null)
			throw new RuntimeException("O nome não é valido");
		return patio;
	}

	@Override
	public void removePatio(String nome) {
		if(nome.isBlank()) 
			throw new RuntimeException("O nome não pode estar em branco.");
		getDAO().removePatio(nome);
	}

}
