package State;

public class GateClosed implements GateState {

	@Override
	public GateState free() {
		System.out.println("GREEN  (GateClosed)");
		return new GateFree();
	}

	@Override
	public GateState busy() {
		System.out.println("RED  (GateClosed)");
		return new GateBusy();
	}

	@Override
	public GateState closed() {
		System.out.println("BLACK  (GateClosed)");
		return null;
	}

}
