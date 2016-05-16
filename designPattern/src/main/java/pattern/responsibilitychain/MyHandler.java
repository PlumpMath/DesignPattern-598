package pattern.responsibilitychain;

public class MyHandler extends AbstractHandler implements Handler  {
	private String name;
	
	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void process() {
		System.out.println(name + " deal!");
		if (getHandler() != null) {
			getHandler().process();
		}
	}
}
