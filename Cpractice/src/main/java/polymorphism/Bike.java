package polymorphism;

// child class
public class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is running Safely");
	}

	public static void main(String args[]) {
				Bike ob = new Bike();
	            ob.run();
	}
}
// overiding the sub class here it will print child class