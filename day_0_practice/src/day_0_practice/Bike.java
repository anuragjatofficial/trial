package day_0_practice;

public class Bike implements Vehicle{
	
	public void startBike() {
		System.out.println("bike started wrmmm...........");
	}
	@Override
	public void go() {
		 startBike();
	}

}
