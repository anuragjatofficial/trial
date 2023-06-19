package day_0_practice;

public class A { // dependent
	B b1 = new B(); // dependency

	public void methodA() {
		System.out.println("Inside methodA of A");
		b1.methodB();
	}
}

// it is reperesenting tight coupling that if we make any change in dependency class then we have to change dependent class also 
//dependency class

// one more Example-- 

class Cars {

	
	public void start() {  
		System.out.println("Car started...");
	}
}


//dependent on the car class
 class Travell {
	
	Cars c=new Cars();
	
	public void journey() {
		c.start();  
		System.out.println("Jounrney started...");
	}

}