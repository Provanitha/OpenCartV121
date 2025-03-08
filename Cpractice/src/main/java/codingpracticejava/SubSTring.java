package codingpracticejava;

import java.util.Scanner;

public class SubSTring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String S= sc.next();
		
		int start=sc.nextInt();
		int end=sc.nextInt();
	       System.out.println(S);
	       System.out.println("Total length:" + S.length());
	        System.out.println(start + " " +end);
	        System.out.println(S.substring(start));
	        System.out.println(S.substring(end));
	  
	        
	        System.out.println(S.substring(start,end));

	}

}
