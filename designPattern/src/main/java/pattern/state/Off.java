package pattern.state;

public class Off implements LightState {

	@Override
	public void pressSwitch(Light light) {
		System.out.println("Turn on the light");
		light.setState(Light.ON);
	}
}
