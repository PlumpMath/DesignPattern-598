package pattern.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject {
	private List<Observer> list = new LinkedList<Observer> ();
	
	public void update() {
		System.out.println("Subject update");
		notifyObservers();
	}
	
	private void notifyObservers() {
		for (Observer obs : list) {
			obs.update();
		}
	}
	
	public void addObserver(Observer obs) {
		this.list.add(obs);
	}
}
