package Constructor;

public class Default123 {
	int id; // declaration
	String name;
	void display() {
		System.out.println("display the values:"+id+ " "+name);
	}
	

	public static void main(String[] args) {
		Default123 ob1= new Default123();
		ob1.display();
	}

}

// here the use of Default constuctor is i have not provided  explicitly values , but by default values are given depends on 
//what data type int-->0, string-->null