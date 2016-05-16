package pattern.memento;

public class Test {
	public static void main(String[] args) {
		Original origi = new Original("egg");
		Storage storage = new Storage(origi.createMemento());
		
		System.out.println("Initialization: " + origi.getValue());
		origi.setValue("niu");
		System.out.println("Modified: " + origi.getValue());
		
		origi.restoreMemento(storage.getMemento());
		System.out.println("Recovered: " + origi.getValue());
	}

}
