package PackageStrg;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String st= sc.next();
		
		String rev= "";
		
		for(int i =0; i<st.length();i++) {
			
			rev= st.charAt(i)+rev;
			
		}
		System.out.print(rev);
		
}
}