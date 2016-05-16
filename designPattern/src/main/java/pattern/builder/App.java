package pattern.builder;

import pattern.builder.Car.CarBuilder;

public class App {
	
	public static void main(String[] args) {

		CarBuilder builder = new CarBuilder("greatengine");
		builder.wheel("roundwheel").color("green");
		
		Car car = builder.build();
		System.out.println(car.toString());
		
	}

}
