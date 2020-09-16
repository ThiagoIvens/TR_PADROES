package Flyweight;

public class CorTU {
	private final static String cores[] = {"AZUL","AMARELO","PRETO","BRANCO","CREME","VERDE","CINZA","VERMELHO"};
	
	public static String getCorDoTU() {
		return cores[(int)(Math.random()*cores.length)];
	}
}
