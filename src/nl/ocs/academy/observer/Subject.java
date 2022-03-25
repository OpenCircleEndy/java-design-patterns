
package nl.ocs.academy.observer;

import java.util.ArrayList;
import java.util.List;

class Subject {

	private final List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) { observers.add(observer); }

	public void stateChange(String state) { notify(state); }

	private void notify(String event) {
		observers.forEach(observer -> observer.update(event));
	}
}


