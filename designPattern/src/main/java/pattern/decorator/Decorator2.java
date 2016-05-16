package pattern.decorator;

public class Decorator2 implements Sourceable{
	Sourceable source;
	
	public Decorator2(Sourceable source) {
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("Decorator2 before");
		source.method();
		System.out.println("Decorator2 after");
	}

}
