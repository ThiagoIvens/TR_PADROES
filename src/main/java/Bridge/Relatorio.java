package Bridge;

import java.util.List;

public class Relatorio extends GeradorDeRelatorios{

	public Relatorio(Visualizador visualizador) {
		super(visualizador);
	}

	@Override
	protected String gerarConteudo(List<Caminhao> caminhoes) {
		StringBuilder conteudo = new StringBuilder();
		int totalDeCaminhoes = 0;
		conteudo.append("\nENTRADAS\n");
		for(Caminhao c : caminhoes) {
			totalDeCaminhoes += 1;
			conteudo.append(c.getPlaca()).append(" - ").append(c.getCpf()).append("\n");
		}
		conteudo.append("\nTotal de caminhoes: ").append(totalDeCaminhoes);
		return conteudo.toString();
	}

	@Override
	protected void gerarVisualizacao(String cabecalho, String conteudo) {
		this.visualizador.gerarVisualizador(cabecalho, conteudo);
	}

}
