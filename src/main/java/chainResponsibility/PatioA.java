package chainResponsibility;

import java.util.HashMap;
import java.util.Map;

public class PatioA extends LocalizarContainer{
	private Map<String, Container> bancoPatioA = new HashMap<>();
	
	public PatioA(LocalizarContainer patioSeguinte) {
		super(patioSeguinte);
		bancoPatioA.put("it6", new Container("it6", "DOUBLEDOOR"));
		bancoPatioA.put("bn30", new Container("bn30", "OPENTOP"));
		bancoPatioA.put("ck8", new Container("ck8", "REEFER"));
		bancoPatioA.put("zs2", new Container("zs2", "HBOX"));
	}

	@Override
	protected Container acharContainer(String codigo) {
		if(bancoPatioA.containsKey(codigo))
			return bancoPatioA.get(codigo);
		return null;
	}

	@Override
	protected void addContainer(String nome, String tipo) {
		bancoPatioA.put(nome, new Container(nome, tipo));
		
	}
}
