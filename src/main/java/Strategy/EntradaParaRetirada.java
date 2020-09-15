package Strategy;

import java.util.Random;

public class EntradaParaRetirada implements Entrada{
	public Random random = new Random();
	
	@Override
	public int opEntrada() {
		int i = random.nextInt(10);
		
		if(i <= 5) {
			System.out.println("Retirada no Patio A");
		}else {
			System.out.println("Retirada no Patio B");
		}
		return i;
	}


}
