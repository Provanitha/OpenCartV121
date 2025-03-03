package keywords;

public class Finalize {

	public static void main(String[] args) {
		Finalize fin =new Finalize();
		System.out.println("Hashcode"+ fin.hashCode());
        fin=null;
         System.gc();
         System.out.println("End of the garbage collection");
	}
	protected void finalize() {
		System.out.println("calling the finalize method");
	}

}
