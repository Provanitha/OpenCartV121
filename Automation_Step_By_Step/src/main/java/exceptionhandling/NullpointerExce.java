package exceptionhandling;

public class NullpointerExce {
	// unchecked exception/ run time
	public static void main(String[] args) {
		String s=null;
		
		
		try {
			int s1=s.length();
			System.out.println("length of the string:" +s1);
		}catch(NullPointerException e) {
			System.out.println("Null reference encountered");
		}finally {
			System.out.println("this block execute");
		}
	}

}
