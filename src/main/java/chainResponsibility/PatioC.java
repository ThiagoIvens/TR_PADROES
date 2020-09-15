package chainResponsibility;

import java.util.HashMap;
import java.util.Map;

public class PatioC extends LocalizarContainer{
	private Map<String, Container> bancoPatioC = new HashMap<>();
	
	public PatioC(LocalizarContainer patioSeguinte) {
		super(patioSeguinte);
		bancoPatioC.put("p1", new Container("p1","HBOX"));
		bancoPatioC.put("s3", new Container("s3","OPEN-TOP"));
		bancoPatioC.put("k20", new Container("k20","HBOX"));
		bancoPatioC.put("gh3", new Container("gh3","DRYBOX"));
	}

	@Override
	protected Container acharContainer(String codigo) {
		if(bancoPatioC.containsKey(codigo))
			return bancoPatioC.get(codigo);
		return null;
	}
	
	@Override
	protected void addContainer(String nome, String tipo) {
		// TODO Auto-generated method stub
		bancoPatioC.put(nome, new Container(nome, tipo));
		
	}
}
