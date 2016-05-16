package pattern.observer;

public class ObserverOne implements Observer {

	@Override
	public void update() {
		System.out.println("Observer One Update.");
	}

}
