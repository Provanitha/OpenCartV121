package keywords;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Inside try block");
			int d=25/0;
			System.out.println(d);
		}catch(Exception e){
			System.out.println("Exception handled");
			System.out.println(e);
			
		}finally {
			System.out.println("finally block executed");
			
		}
		System.out.println("rest of the code---");

	}

}
