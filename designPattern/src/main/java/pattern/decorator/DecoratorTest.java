package pattern.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		Sourceable source = new Source();
		
		Sourceable decorator = new Decorator(source);
		
		Sourceable decorator2 = new Decorator2(decorator);
		
		decorator2.method();
	}
}
