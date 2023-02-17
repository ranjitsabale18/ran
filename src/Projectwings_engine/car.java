package Projectwings_engine;

public class car {
	
	String Company;
	Engine engine;
	int model;
	
	public car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public car(String company, Engine engine, int model) {
		super();
		Company = company;
		this.engine = engine;
		this.model = model;
	}

	@Override
	public String toString() {
		return "car [Company=" + Company + ", engine=" + engine + ", model=" + model + "]";
	}
	
	

}
