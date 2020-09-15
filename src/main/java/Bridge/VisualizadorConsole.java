package Bridge;
public class VisualizadorConsole implements Visualizador{

	@Override
	public void gerarVisualizador(String cabecalho, String conteudo) {
		System.out.println(cabecalho);
		System.out.println(conteudo);
	}
}
