package pattern.bridge;

public class ConcreteImplementorB extends Implementor {

	@Override
	public void operationImpl() {
		System.out.println("B is doing things.");
	}

}
