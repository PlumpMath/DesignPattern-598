package pattern.proxy;

public class Proxy implements Sourceable {
    private Sourceable source;
    
    public Proxy () {
    	this.source = new Source();
    }
	@Override
	public void method() {
		before();
		this.source.method();
		after();
	}
	
	private void before() {
		System.out.println("Proxy before");
	}
	
	private void after() {
		System.out.println("Proxy after");
	}

}
