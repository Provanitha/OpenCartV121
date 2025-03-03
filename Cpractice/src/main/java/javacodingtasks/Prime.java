package javacodingtasks;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true; */
		
		int n=83;
		boolean isPrime= true;
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}}
		if(isPrime) {
				 System.out.println(n + " is prime number");
	        }
	        else{
	            System.out.println(n + " is a non-prime number");
			}
		}
		
    }

	


