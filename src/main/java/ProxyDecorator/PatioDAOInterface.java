package ProxyDecorator;

public interface PatioDAOInterface {
	
	public void newPatio(String nome);
	
	public PatioDAO recuperaPatio(String nome);
	
	public void removePatio(String nome);

}
