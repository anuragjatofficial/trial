package day_0_practice;

//it is a dependent class	
public class Travel {
	Vehicle v; // dependency
//setter injectoion point

	public void setV(Vehicle v) {
		this.v = v;
	}

	public void journey() {
		v.go();
		System.out.println("journey started...........!");
	}
}
