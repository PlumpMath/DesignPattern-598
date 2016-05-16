package pattern.template;

public abstract class Template {
	
	void steps() {
		stepOne();
		stepTwo();
		stepThree();
	}
	
	void stepOne() {
		System.out.println("Step One");
	}
	
	abstract void stepTwo();
	
	void stepThree() {
		System.out.println("Step Three");
	}

}
