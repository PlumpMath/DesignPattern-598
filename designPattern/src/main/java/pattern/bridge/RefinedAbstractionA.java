package pattern.bridge;

public class RefinedAbstractionA extends Abstraction {
	
	public void operation() {
		System.out.println("A before");
		super.operation();
		System.out.println("A after");		
	}

}
