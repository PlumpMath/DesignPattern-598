package pattern.facade;

public class FacadeTest {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.MethodA();
		System.out.println("#######################");
		facade.MethodB();
	}
}
