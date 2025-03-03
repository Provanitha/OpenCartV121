package javacodingtasks;

public class programms {

//	public static void main(String[] args) {
		//1. reverse string
		/*String s= "hi how are you?";
		String rev="";
		for(int i= s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
			}
		System.out.println("Reverse string:" + rev);
		}*/
		
		//2.How do you swap two numbers without using a third variable in Java?
		
	/*	int a=2, b=3;
		 System.out.println("before swapping:"+ "a="+ a+ "b="+ b);
		 
		 a= a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("After swapping:"+ "a="+ a+ "b="+ b);*/
		
		//3.Write a Java program to check if a vowel is present in a string.
		
	/*	String s= "hello i'm fine";
		boolean vowel= false;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)== 'i' || 
					s.charAt(i)=='o' || s.charAt(i)=='u') {
				System.out.println("Given string contains vowels:"+ s.charAt(i) + "at the index:" + i);
			vowel=true;
		}if(!vowel) {
				System.out.println("Given string not contains vowels");
			}
		} */
		
		// 4.Write a Java program to check if the given number is a prime number.
		
	/*	int n=23;
		boolean isPrime= true;
		
		for(int i=2; i<=n/2; i++) {
			if(i%2==0) {
				isPrime= false;
			}}if(!isPrime) {
				System.out.println(n + " is a prime number");
			}else
				System.out.println(n + " is not a prime number"); */
		
		//5.Write a Java program to print a Fibonacci sequence using recursion.
		
/*static int fib(int n) {
		
		if(n<=1) 
		return n;
		
		return fib(n-1) + fib(n-2);
		
	}
		
		public static void main(String args[]) {
			int N=10;
			for(int i =0; i<N; i++) {
				System.out.print(fib(i)+" ");
			} */
	
	//6. How do you check if a list of integers contains only odd numbers in Java?
	
/*	public static void main(String args[]) {	
		int a[]= {1,7, 5, 3,11, 33,23};
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println("Given array contains odd numbers" );
			}
			else {
				System.out.println("Given array  contains only odd numbers:" + a[i]);
			}
		}
		} */
	
	//7.How do you check whether a string is a palindrome in Java?
	/*public static void main(String args[]) {	
	String s1= "madam";
	String m1="";
	for(int i=s1.length()-1; i>=0; i--) {
		m1=m1+s1.charAt(i);
	}if(s1.toLowerCase().equals(m1.toLowerCase())) {
		System.out.println("given string is polindrome: " + s1);
	}else {
		System.out.println("given string is not polindrome:"+ s1);
	}
}} */
	
	//8.How do you remove spaces from a string in Java?
/*	public static void main(String args[]) {
	String s= " hi hello how are u ? ";
	String space= s.replaceAll("\\s", "");
	System.out.println(space);
	}}	*/
	
	//9.How do you sort an array in Java?
	
/*	public static void main(String args[]) {
		
		int a[] = {5,1,0,7,9,3,2,0,4};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				int temp=0;
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
				
			}
			System.out.println(a[i]);
		}
	}} */
	
	// 10.How can you find the factorial of an integer in Java?
/*	public static void main(String args[]) {
		
	int fact=1;
	for (int i=1; i<=5; i++) {
		fact = fact*i;
	}
	System.out.println(fact);
	}} */
	
	
	// 11. How do you get the sum of all elements in an integer array in Java?
	
/*	public static void main(String ar[]) {
		int n [] = {8,9,7,65,9};
		int sum=0;
		for(int i=0; i<n.length; i++) {
			sum = sum+n[i];
			
		}
		System.out.println(sum);
		
	}} */
	
	// 12.How do you find the second largest number in an array in Java?
	/*
	public static int get2ndLargestNum(int a[], int total) {
		
		
		for(int i=0; i<total; i++) {
			for(int j=i+1; j<total; j++) {
				int temp;
				if(a[i]>a[j]) {
					 temp= a[i];
					 a[i]=a[j];
					 a[j]=temp;
					 
				}
			}
			
		}
		return a[total-2];
		
		
	}
	public static void main(String ar[]) {
		int a[]= {7,8,9,67, 56};
		int b[]= {9,8,9,6, 90};
		System.out.println(get2ndLargestNum(a,5));
		System.out.println(get2ndLargestNum(b,5));
	}
		
	} */
	
	// 13.Count words in string?
/*	public static void main(String ar[]) {
		
		String a= "hi how are you ? ";
		
		int count=1;
		for(int i=0; i<a.length()-1; i++) {
			if((a.charAt(i) == ' ') && (a.charAt(i+1)!= ' ')) {
				count++;
			}
		}
		System.out.println("given string contains no.of words are: " + count);
	
}}*/
	
	// 14. Count the number of repeated and single character in a string
	
/*	public static void main(String ar[]) {
		String d="Hellomam";
		
		
		for(int i=0; i<d.length(); i++) {
			char currentChar = d.charAt(i);
			int count=0;
			
			for(int j=0; j<d.length(); j++) {
				if(d.charAt(j) == currentChar) {
					count++;
				}
				
			}
			System.out.println(currentChar + " = "+ count);
		}
		}
	*/
	
	// 15.Remove the repeated character in a string
	
/*	public static void main(String ar[]) {
		String in= "Vanitha";
		System.out.println(removeDuplicates(in));
	}	
		public static String removeDuplicates(String in) {
		String r= "";
		
		for(int i =0; i<in.length(); i++) {
			char currentChar = in.charAt(i);
			
			if(r.indexOf(currentChar) == -1) {
				r = r+currentChar;
			}
		}
		return r;
	}*/
	
}