package Flyweight;

import java.util.HashMap;

public class TUFabrica {
	private final static HashMap<String, ContainerInf> mapa = new HashMap<String, ContainerInf>();

	public static ContainerInf getTU(String cor) {
		ContainerInf tu = (ContainerInf) mapa.get(cor);

		if (tu == null) {
			tu = new ContainerInf(cor);
			mapa.put(cor, tu);
		}

		return tu;
	}

}
