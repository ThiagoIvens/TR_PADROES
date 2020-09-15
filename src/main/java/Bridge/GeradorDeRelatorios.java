package Bridge;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public abstract class GeradorDeRelatorios {
	protected Visualizador visualizador;
	
	public GeradorDeRelatorios(Visualizador visualizador) {
		this.visualizador = visualizador;
	};
	
	public final void gerarRelatorios(List<Caminhao> caminhoes) {
		String cabecalho = this.gerarCabecalho();
		String conteudo = this.gerarConteudo(caminhoes);
		this.gerarVisualizacao(cabecalho, conteudo);
	}
	
	protected String gerarCabecalho() {
		SimpleDateFormat sdf = new SimpleDateFormat("d/m/y");
		return new String("RELATORIO DE ENTRADAS DE CAMINHÕES\n"+ sdf.format(new Date()));
	}
	
	protected abstract String gerarConteudo(List<Caminhao> caminhoes);
	
	protected abstract void gerarVisualizacao(String cabecalho, String conteudo);
	
}
