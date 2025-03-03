package Testing;

public class Swapping2numbers {
	public static void main(String ar[]) {
		int a= 10;
		int b=20;
		System.out.print("Before swapping:"  +a+ " " +b);
		
		a= a+b;
		b= a-b;
		a=a-b;
		
		System.out.print("After swapping:" +a+ " "  +b);
		
			
		
	}

}
