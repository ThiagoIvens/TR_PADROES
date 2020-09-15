package ProxyDecorator;

import java.util.HashMap;
import java.util.Map;

public class ProxyDAO implements PatioDAOInterface{
	private Map<String, PatioDAO> lista;
	
	public ProxyDAO() {
		this.lista = new HashMap<>();
	}

	@Override
	public void newPatio(String nome) {
		lista.put(nome, new PatioDAO(nome));
	}

	@Override
	public PatioDAO recuperaPatio(String nome) {
		return lista.get(nome);
	}

	@Override
	public void removePatio(String nome) {
		lista.remove(nome);
	}

}
