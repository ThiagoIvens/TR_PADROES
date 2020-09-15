package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Bridge.Caminhao;
import Bridge.GeradorDeRelatorios;
import Bridge.Relatorio;
import Bridge.Visualizador;
import Bridge.VisualizadorConsole;
import Command.Evento;
import Command.ExecutorDeComandos;
import Facade.Fachada;
import FluentInterfaces.CaminhaoFI;
import FluentInterfaces.Motorista;
import NullObject.ContainerNullObject;
import NullObject.FactoryForCreate;
import NullObject.SeguroDoContainer;
import Observer.CaminhaoRTG;
import Observer.RTG;
import ProxyDecorator.DecoratorDAO;
import ProxyDecorator.PatioDAO;
import ProxyDecorator.PatioDAOInterface;
import State.Gate;
import Strategy.Entrada;
import Strategy.EntradaParaDeposito;
import Strategy.EntradaParaRetirada;
import chainResponsibility.Container;
import chainResponsibility.LocalizarContainer;
import chainResponsibility.PatioA;
import chainResponsibility.PatioB;
import chainResponsibility.PatioC;
import composite.TrajetoComposto;
import composite.TrajetoDoNavio;
import composite.TrajetoSimples;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("SELECIONE O TRABALHO DESEJADO: \n");
		switch (new Scanner(System.in).nextInt()) {
		case 1:
			System.out.println("TRABALHO 1\n");
			System.out.println(
					"SELECIONE O DESIGN PATTERN DESEJADO: \n1- Strategy \n2- Null Object \n3- Bridge \n4- State \n5- Observer \n");
			switch (new Scanner(System.in).nextInt()) {
			case 1:
				System.out.println("STRATEGY\n");
				try (Scanner scan = new Scanner(System.in)) {
					System.out.println("Informe a opcção referente ao Container: Retirada(1) | Deposito(2)");
					int op = scan.nextInt();

					Entrada entrada = null;
					if (op == 1) {
						entrada = new EntradaParaRetirada();
					} else {
						entrada = new EntradaParaDeposito();
					}

					System.out.println("Setor: " + entrada.opEntrada());
				}
				break;
			case 2:
				System.out.println("NULL OBJECT\n");

				ContainerNullObject c1 = FactoryForCreate.container("sJK24nxZE", new SeguroDoContainer("maersk", 365));
				System.out.println("Responsavel: " + c1.getSeguro().getEmpresa() + ", por:" + c1.getSeguro().getTempo()
						+ " dias!");
				System.out.println("\n");
				ContainerNullObject c2 = FactoryForCreate.container("ssdaasdpap", null);
				System.out.println("Responsavel: " + c2.getSeguro().getEmpresa() + ", por:" + c2.getSeguro().getTempo()
						+ " dias!");
				break;
			case 3:
				System.out.println("BRIDGE\n");

				List<Caminhao> caminhoes = new ArrayList<Caminhao>();
				caminhoes.add(new Caminhao("HDS4930", "10253230926"));
				caminhoes.add(new Caminhao("JDL2235", "42192801239"));
				caminhoes.add(new Caminhao("NAL3549", "03932012302"));
				caminhoes.add(new Caminhao("LAP1293", "13184636416"));
				caminhoes.add(new Caminhao("BSK3200", "74454646464"));

				Visualizador visualizadorConsole = new VisualizadorConsole();
				GeradorDeRelatorios relatorio = new Relatorio(visualizadorConsole);
				relatorio.gerarRelatorios(caminhoes);
				break;
			case 4:
				System.out.println("STATE\n");
				System.out.println("Estado| Disparado por:\n");
				Gate gate = new Gate();
				//Inicia o gate com estado livre e passa a gerencia do estado para o GateFree
				gate.ficouLivre();
				//A partir do GateFree torna o gate ocupado e passa o Estado para o GateBusy
				gate.ficouOcupado();
				//A partir do GateBusy torna o gate fechado e passa o Estado para o GateClosed
				gate.gateFechado();
				//A partir do GateClosed abre o gate e passa o Estado para o GateFree
				gate.ficouLivre();
				gate.ficouOcupado();
				gate.ficouLivre();
				gate.gateFechado();
				break;
			case 5:
				System.out.println("OBSERVER\n");

				CaminhaoRTG caminhaoRTG = new CaminhaoRTG();
				RTG rtg = new RTG();

				caminhaoRTG.registrar(rtg);

				caminhaoRTG.addEstado("Caminhao a caminho!");
				caminhaoRTG.addEstado("Caminhao pronto!");

				break;
			}
			break;
		case 2:
			System.out.println("TRABALHO 2\n");
			System.out.println(
					"SELECIONE O DESIGN PATTERN DESEJADO: \n1- Composite \n2- Chain Responsability \n3- Proxy and Decorator \n");
			switch (new Scanner(System.in).nextInt()) {
			case 1:
				System.out.println("COMPOSITE\n");
				TrajetoDoNavio linha1 = new TrajetoSimples("China", "Portugal", 3000);
				TrajetoDoNavio linha2 = new TrajetoSimples("Portugal", "Estados Unidos", 5000);
				TrajetoDoNavio linha3 = new TrajetoSimples("Estados Unidos", "Mexico", 3000);
				TrajetoDoNavio linha4 = new TrajetoSimples("Mexico", "Brazil", 4000);

				TrajetoDoNavio linhaComposta1 = new TrajetoComposto(linha3, linha4, 300);
				TrajetoDoNavio linhaComposta2 = new TrajetoComposto(linha2, linhaComposta1, 400);
				TrajetoDoNavio linhaComposta3 = new TrajetoComposto(linha1, linhaComposta2, 500);

				System.out.println("ORIGEM : DESTINO");
				System.out.println(linhaComposta3);
				double tempohoras = linhaComposta3.getTempo() / 60;
				System.out.println("\n-- Tempo total do percurso: " + tempohoras + " (horas) --");
				break;
			case 2:
				System.out.println("CHAIN RESPONSABILITY\n");
				try {
					LocalizarContainer localizar = new PatioA(new PatioB(new PatioC(null)));
					Container containerA = localizar.encontrar("p1");
					System.out.println("Container de codigo: " + containerA.getCodigo() + " - Tipo do Container: "
							+ containerA.getTipo());

					Container containerB = localizar.encontrar("y67");
					System.out.println("Container de codigo: " + containerB.getCodigo() + " - Tipo do Container: "
							+ containerB.getTipo());

					Container containerC = localizar.encontrar("ck8");
					System.out.println("Container de codigo: " + containerC.getCodigo() + " - Tipo do Container: "
							+ containerC.getTipo());

					Container containerD = localizar.encontrar("h000");
					System.out.println("Container de codigo: " + containerD.getCodigo() + " - Tipo do Container: "
							+ containerD.getTipo());

				} catch (RuntimeException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Proxy and Decorator\n");
				PatioDAOInterface patioDAO = new DecoratorDAO();
				patioDAO.newPatio("PatioA1");
				PatioDAO patio = patioDAO.recuperaPatio("PatioA1");
				System.out.println(patio.getNome());

				patioDAO.removePatio("PatioA1");
				System.out.println(patioDAO.recuperaPatio("PatioA1"));
				break;
			}
			break;
		case 3:
			System.out.println("TRABALHO 3\n");
			System.out.println(
					"SELECIONE O DESIGN PATTERN DESEJADO: \n1- Fluent Interfaces \n2- Command Pattern \n3- Double Dispatch \n4- Facade \n5- Flyweight \n");
			switch (new Scanner(System.in).nextInt()) {
			case 1:
				System.out.println("Fluent Interfaces\n");
				CaminhaoFI caminhao = new CaminhaoFI().comPlaca("HJK4930");
				Motorista motorista = new Motorista().chamado("Wilson").comCPF("10253230926").donoDoCaminhao(caminhao);
				System.out.println("Motorista: " + motorista.getNome() + ", com CPF: " + motorista.getCpf()
						+ " e dono do caminhao de placa: " + motorista.getCaminhao().getPlaca());
				break;
			case 2:
				System.out.println("Command Pattern\n");
				
				String eventos = "";
				ExecutorDeComandos executor = new ExecutorDeComandos();
				
				eventos = executor.fazer(new Evento(eventos, "PRÉ-AVISADA "));
				System.out.println("1- "+ eventos);
				
				eventos = executor.fazer(new Evento(eventos, "INBOUND "));
				System.out.println("2- "+ eventos);
				
				eventos = executor.desfazer();
				System.out.println("3- "+ eventos);
				
				eventos = executor.desfazer();
				System.out.println("4- "+ eventos);
				
				eventos = executor.refazer();
				System.out.println("5- "+ eventos);
				
				eventos = executor.fazer(new Evento(eventos, "INBOUND "));
				System.out.println("6- "+ eventos);
				
				eventos = executor.fazer(new Evento(eventos, "INWARD "));
				System.out.println("7- "+ eventos);
				break;
			case 3:
				System.out.println("Double Dispatch\n");
				
				break;
			case 4:
				System.out.println("Facade\n");
				new Fachada(0, "gerente");
				new Fachada(0, "nota");
				new Fachada(1, "Descarga");
				new Fachada(1, "Carga");
				new Fachada(0, "Carga");
				new Fachada(1, "nota");
				break;
			case 5:
				System.out.println("Flyweight\n");
					
				break;
			}
		}
	}	
}
