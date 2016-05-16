package pattern.state;

public class On implements LightState {

	@Override
	public void pressSwitch(Light light) {
		System.out.println("Turn off the light");
		light.setState(Light.OFF);
	}

}
