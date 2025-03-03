package collections;

public class TestGarbage1 {

	public void finalize() {
		System.out.println("object is garbage collected:");
	}
	public static void main(String[] args) {
		TestGarbage1 t1= new TestGarbage1();
		TestGarbage1 t2 = new TestGarbage1();
		
//		t1=null;  // By nulling a reference:
//		t2=null;
		
		t1=t2; //By assigning a reference to another:
		System.gc();
		}

}
