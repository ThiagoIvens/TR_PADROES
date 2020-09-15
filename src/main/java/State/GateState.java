package State;

public interface GateState {
	GateState free();
	GateState busy();
	GateState closed();
}
