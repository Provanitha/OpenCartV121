package Testing;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
//		int n, a=0, b=1, c, count=0;
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter value of n:");
//		 n = sc.nextInt();
//	        System.out.print("Fibonacci Series:");
//	        while(count<n)
//	        {
//	            a = b;
//	            b = a;
//	           c = a + b;
//	           
//	        }
//	        System.out.print(a+" ");
		int n=10, t1=0, t2=1;
		System.out.println("Fibonacci Series of " + n + " terms:");
		for(int i=1; i<=n; i++) {
		
			System.out.println(t1 + " , ");
			
			int  sum= t1+t2;
			t1= t2;
			t2= sum;
			
		}

	}

	    }
		
	


