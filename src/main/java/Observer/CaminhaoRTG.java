package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class CaminhaoRTG extends Observable {
	private List<Observer> observers = new ArrayList<>();

	public void addEstado(String estado) {
		notifyObservers(estado);
	}

	public void notifyObservers(String estado) {
		for (Observer observer : this.observers) {
			observer.update(this, estado);
		}
	}

	public void registrar(Observer observer) {
		observers.add(observer);
	}

}
