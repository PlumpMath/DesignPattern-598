package pattern.observer;

public class ObserverTest {
	public static void main(String[] args) {
		Observer observerOne = new ObserverOne();
		Observer observerTwo = new ObserverTwo();
		
		Subject subject = new Subject();
		
		subject.addObserver(observerOne);
		subject.addObserver(observerTwo);
		
		subject.update();
	}
}
