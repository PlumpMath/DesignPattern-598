package pattern.bridge;

public abstract class Abstraction {
	protected Implementor imp;
	
	public void setImpl(Implementor imp) {
		this.imp = imp;
	}
	
	public void operation() {
		imp.operationImpl();
	}
}
