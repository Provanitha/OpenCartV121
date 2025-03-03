package exceptionhandling;

public class NumberFormatExcep {

	public static void main(String[] args) {
		String s="abc";
//		int a=Integer.parseInt(s);
//		System.out.println("Parsed number:"+ a);--> throw NumberFormatException
		try {
			int a=Integer.parseInt(s);
			System.out.println("Parsed number:"+ a);
		}catch(NumberFormatException e) {
			System.out.println("Error: unable to parse the string an integer");
		}

	}

}
