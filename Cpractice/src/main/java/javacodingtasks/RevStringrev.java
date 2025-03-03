package javacodingtasks;

public class RevStringrev {

	public static void main(String[] args) {
//		String s="Vanitha";
//		String rev=" ";
//		for(int a=0; a<s.length(); a++) {
//		
//		rev= s.charAt(a)+rev;
//		
//
//	}
//		System.out.println(rev);
 
String s1= "name";
String reverse="";

// Iterate through each character in the input string starting from the last character  
for(int i=s1.length()-1;i>=0;i--) {
	reverse += s1.charAt(i);
}System.out.println(reverse);
		
}
}