package State;

public class GateBusy implements GateState {

	@Override
	public GateState free() {
		System.out.println("GREEN  (GateBusy)");
		return new GateFree();
	}

	@Override
	public GateState busy() {
		System.out.println("RED  (GateBusy)");
		return this;
	}

	@Override
	public GateState closed() {
		System.out.println("BLACK  (GateBusy)");
		return new GateClosed();
	}

}
