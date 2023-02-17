package Projectwings_engine;

public class TestCar {

	public static void main(String[] args) {
		
		Engine engine = new Engine(1.2f,1200,4);
		car car1 = new car("KIA",engine,2022);
		
		System.out.println(car1);
	}
	
}
