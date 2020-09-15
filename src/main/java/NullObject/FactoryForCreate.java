package NullObject;

public class FactoryForCreate {

	public static ContainerNullObject container(String codigo, SeguroDoContainer seguro) {
		ContainerNullObject container = new ContainerNullObject(codigo);

		if (seguro == null) {
			container.setSeguro(new SeguroNull());
		} else {
			container.setSeguro(seguro);
		}

		return container;
	};
}
