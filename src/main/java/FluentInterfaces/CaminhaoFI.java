package FluentInterfaces;

public class CaminhaoFI {
	private String placa;

	public CaminhaoFI comPlaca(String placa) {
		this.placa = placa;
		return this;
	}

	public String getPlaca() {
		return placa;
	}

}
