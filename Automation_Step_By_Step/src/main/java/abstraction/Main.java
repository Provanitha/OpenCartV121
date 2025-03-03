package abstraction;

public class Main {

	public static void main(String[] args) {
	
		Animal dog= new Dog();
		dog.sleep();
		dog.sound();
		
		Animal cat = new Cat();
		cat.sound();
		cat.sleep();

	}

}
