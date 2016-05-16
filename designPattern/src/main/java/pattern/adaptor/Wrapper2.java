package pattern.adaptor;

public class Wrapper2 implements Sourceable{

	@Override
	public void method1() {
		System.out.println("wrapper2 method1");
	}

	@Override
	public void method2() {
		System.out.println("wrapper2 method2");
	}

}
