package Projectwings_engine;

public class Engine {
	
	float capacity;
	int Power;
	int NoOfCylinder;
	
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(float capacity, int power, int noOfCylinder) {
		super();
		this.capacity = capacity;
		Power = power;
		NoOfCylinder = noOfCylinder;
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", Power=" + Power + ", NoOfCylinder=" + NoOfCylinder + "]";
	}
	
	
	
	
	

}
