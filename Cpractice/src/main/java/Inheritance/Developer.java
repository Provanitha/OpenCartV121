package Inheritance;

public class Developer extends Guest {
	public void write() {
	super.read();// it will access parent class properties
		System.out.println("write option is available");
	}
	public void read() {
		System.out.println("read avilable");
		}

	
}
