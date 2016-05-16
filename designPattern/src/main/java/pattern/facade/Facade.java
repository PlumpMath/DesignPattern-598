package pattern.facade;

public class Facade {
	private SubsystemOne subOne = new SubsystemOne();
	private SubsystemTwo subTwo = new SubsystemTwo();
	private SubsystemThree subThree = new SubsystemThree();
	private SubsystemFour subFour = new SubsystemFour();
	
	
	
	public void MethodA() {
		
		subOne.subsystemOne();
		subTwo.subsystemTwo();
		subThree.subsystemThree();
		subFour.subsystemFour();
		
	};
	
	public void MethodB() {
		subOne.subsystemOne();
		subTwo.subsystemTwo();
	};

}
