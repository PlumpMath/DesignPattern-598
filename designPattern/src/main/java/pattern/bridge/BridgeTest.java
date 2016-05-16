package pattern.bridge;

public class BridgeTest {
	public static void main(String[] args) {
        Abstraction absA = new RefinedAbstractionA();
        Abstraction absB = new RefinedAbstractionB();
        
        Implementor impA = new ConcreteImplementorA();
        Implementor impB = new ConcreteImplementorB();
        
        absA.setImpl(impA);
        absA.operation();
        absA.setImpl(impB);
        absA.operation();
        
        absB.setImpl(impA);
        absB.operation();
        absB.setImpl(impB);
        absB.operation();
	}
}
