package codingpracticejava;

import java.util.Scanner;

public class Solution {

	/*Given two strings of lowercase English letters,  and , perform the following operations:
		Sum the lengths of  and .
		Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
		Capitalize the first letter in  and  and print them on a single line, separated by a space. */
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
		String A= sc.next();
	String B= sc.next();
		
		// finding length of A & B
		
	System.out.println(A.length() + B.length());
	System.out.println(A.compareTo(B));
		if(A.compareTo(B) > 0) {
			System.out.println("Yes");
		}else {
		System.out.println("No");
		}
	A= (A.substring(0,1).toUpperCase()+A.substring(1));
	B= (B.substring(0,1).toUpperCase()+B.substring(1));
	System.out.println(A + " " + B);
	
	
	//compareTo
	
//	String a= "hello";
//	String b= "java";
//	
//	System.out.println(b.compareTo(a));
//	
//	if(a.compareTo(b) > 0) {
//		System.out.println("a is big");
//	}
//	else {
//		System.out.println(" b is big");
//	}

}}
