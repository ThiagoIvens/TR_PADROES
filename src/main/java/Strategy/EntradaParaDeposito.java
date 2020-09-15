package Strategy;
import java.util.Random;

public class EntradaParaDeposito implements Entrada{
	public Random random = new Random();
	
	@Override
	public int opEntrada() {
		int i = random.nextInt(10);
		if(i <= 5) {
			System.out.println("Deposito no Patio C");
		}else {
			System.out.println("Deposito no Patio D");
		}
		return i;
	}

}
