package javacodingtasks;

public class Polindrome {

	public static void main(String[] args) {
	String str= "Radar";
	String reverse="";
	 for (int i=str.length()-1;i>=0;i--) {
		 reverse= reverse+str.charAt(i);
	 }
	 if(str.toLowerCase().equals(reverse.toLowerCase())) {
		 System.out.println("Given string is Polindrome:"+ str);
	 }
	 else {
		 System.out.println("Given String is not Polindrome:"+ str);
	 }

	}

}
