package pattern.bridge;

public class ConcreteImplementorA extends Implementor {

	@Override
	public void operationImpl() {
		System.out.println("A is doing things.");
	}

}
