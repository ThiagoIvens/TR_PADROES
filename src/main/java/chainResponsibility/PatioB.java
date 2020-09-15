package chainResponsibility;

import java.util.HashMap;
import java.util.Map;

public class PatioB extends LocalizarContainer {
	private Map<String, Container> bancoPatioB = new HashMap<>();
	
	public PatioB(LocalizarContainer patioSeguinte) {
		super(patioSeguinte);
		bancoPatioB.put("s20", new Container("s20", "HBOX"));
		bancoPatioB.put("t40", new Container("t40", "DRYBOX"));
		bancoPatioB.put("ub12", new Container("ub12", "FLATRACK"));
		bancoPatioB.put("y67", new Container("y67", "DOUBLEDOOR"));
	}

	@Override
	protected Container acharContainer(String codigo) {
		if(bancoPatioB.containsKey(codigo))
			return bancoPatioB.get(codigo);
		return null;
	}
	
	@Override
	protected void addContainer(String nome, String tipo) {
		// TODO Auto-generated method stub
		bancoPatioB.put(nome, new Container(nome, tipo));
		
	}

}
