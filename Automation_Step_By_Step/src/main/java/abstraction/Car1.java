package abstraction;

public class Car1 implements Movable, Stoppable {

	
	public void stop() {
		System.out.println("car is stopped");
		
	}


	public void move() {
		System.out.println("car is moved");
		
	}
	
	

}
