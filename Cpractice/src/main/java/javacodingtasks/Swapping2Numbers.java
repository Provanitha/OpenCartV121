package javacodingtasks;

import java.util.Scanner;

public class Swapping2Numbers {

	public static void main(String[] args) {
		// without using third variable
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y= sc.nextInt();
		System.out.println("before swappinf of:"+x+ " "+y);
		
	 x = x+y;
	 y=x-y;
	 x=x-y;
	 
	 System.out.println("After swapping of:"+x+" "+y);
		

		
		int a= 2;
		int b=3;
System.out.println("before swapping:"+ "a="+ a + "b="+ b);


a=a+b;
b=a-b;
a=a-b;

System.out.println("after swapping:"+"a="+ a + "b="+ b);

// using third variable

int d=10,e=20,h=50;
d=e;
e=h;
h=d;

System.out.println(e+" "+h);


	}

}
