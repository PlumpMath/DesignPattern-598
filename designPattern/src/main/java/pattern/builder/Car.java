package pattern.builder;

public class Car {
    private String engine;
    private String wheel;
    private String color;
    
    public Car(String engine, String wheel, String color) {
    	this.engine = engine;
    	this.wheel = wheel;
    	this.color = color;
    }
    
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheel=" + wheel + ", color="
				+ color + "]";
	}
	
	public static class  CarBuilder {
	    private String engine;
	    private String wheel;
	    private String color;
	    
		public CarBuilder(String engine) {
			this.engine = engine;
		}
		
		public CarBuilder engine(String engine) {
			this.engine = engine;
			
			return this;
		}
		
		public CarBuilder wheel(String wheel) {
			this.wheel = wheel;
			
			return this;
		}
		
		public CarBuilder color(String color) {
			this.color = color;
			
			return this;
		}
		
		public Car build() {
			return new Car (this.engine, this.wheel, this.color);
		}
		
	}
	
}
