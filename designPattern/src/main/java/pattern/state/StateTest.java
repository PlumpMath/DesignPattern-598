package pattern.state;

public class StateTest {
	public static void main(String[] args) {
		Light light = new Light(Light.OFF);
		
		light.pressSwitch();
		
		light.pressSwitch();
		
		light.pressSwitch();
		
		light.pressSwitch();
	}
}
