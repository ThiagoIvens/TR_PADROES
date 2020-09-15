package Command;

public class Evento implements Command{
	String listaDeEventos;
	String adicionar;
	
	public Evento(String listaDeEventos, String adicionar) {
		this.listaDeEventos = listaDeEventos;
		this.adicionar = adicionar;
	}
	
	@Override
	public String fazer() {
		return listaDeEventos.concat(adicionar);
	}

	@Override
	public String desfazer() {
		return listaDeEventos;
	}

}
