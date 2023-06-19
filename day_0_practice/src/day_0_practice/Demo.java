package day_0_practice;

public class Demo {
	//driver code 
	public static void main(String[] args) {
		Travel tr = new Travel();
		// changing dependency accordingly
		
		//good example of loose coupling
		
		tr.setV(new Car());
		tr.journey();
		System.out.println("********************************"); // seperator 
		tr.setV(new Bike());
		tr.journey();
	}
}
