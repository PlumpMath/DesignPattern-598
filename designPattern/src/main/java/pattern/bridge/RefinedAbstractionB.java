package pattern.bridge;

public class RefinedAbstractionB extends Abstraction {
	
	public void operation() {
		System.out.println("B before");
		super.operation();
		System.out.println("B after");	
	}
}
