package javaCoding;

import java.util.Scanner;

public class ScannerExample {
	public static void main (String ar[]) {
		 Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();

	        // Write your code here.
	        
	      double d= scan.nextDouble();
	      scan.nextLine(); 
	      String s= scan.nextLine();
	      
	      scan.close();
	       
	       
	       
	 
	       System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	
	
	}

}
