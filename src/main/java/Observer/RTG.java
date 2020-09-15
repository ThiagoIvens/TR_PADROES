package Observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class RTG implements Observer {

	@Override
	public void update(Observable caminhao, Object estado) {
		if (caminhao instanceof CaminhaoRTG) {
			if (estado.equals("Caminhao a caminho!")) {
				System.out.println((String) estado);
				System.out.println("RTG se preparando para retirada!");
			}
			if (estado.equals("Caminhao pronto!")) {
				System.out.println((String) estado);
				System.out.println("RTG iniciando retirada de container!");
			}
		}
	}

}
