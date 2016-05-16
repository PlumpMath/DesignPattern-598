package pattern.state;

public class Light {
	private LightState state;
	
    public static final LightState OFF = new Off();
    public static final LightState ON = new On();
	
	public Light(LightState state) {
		this.state = state;
	}
	
	public void pressSwitch() {
		state.pressSwitch(this);
	}

	public LightState getState() {
		return state;
	}

	public void setState(LightState state) {
		this.state = state;
	}
	
}
