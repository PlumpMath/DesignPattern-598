package pattern.template;

public class TemplateTest {
	public static void main(String[] args) {
		Template easyTemplate = new EasyStepTwo();
		
		Template hardTemplate = new HardStepTwo();
		
		easyTemplate.steps();
		
		hardTemplate.steps();
		
	}
}
