package abstraction;

public class MainIn {

	public static void main(String[] args) {
		Vehicle v= new Car();
		v.start();
		v.stop();
		
		Vehicle v1= new Bike();
		v1.start();
		v1.stop();
		

	}

}
