package pattern.proxy;

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("I am the source");
	}

}
