package State;

public class GateFree implements GateState {

	@Override
	public GateState free() {
		System.out.println("GREEN (GateFree)");
		return this;
	}

	@Override
	public GateState busy() {
		System.out.println("RED (GateFree)");
		return new GateBusy();
	}

	@Override
	public GateState closed() {
		System.out.println("BLACK (GateFree)");
		return new GateClosed();
	}

}
