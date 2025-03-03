package keywords;

public class FinalKeyword {
	final int age=10;
	void display() {
	//	age=18; // compile time error 
	}

	public static void main(String[] args) {
		FinalKeyword obj= new FinalKeyword();
		obj.display();

	}

}
