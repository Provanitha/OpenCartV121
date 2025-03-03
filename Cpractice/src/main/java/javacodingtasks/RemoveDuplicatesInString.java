package javacodingtasks;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
	String s= "Programming, hii, hello";
	System.out.println(s.length());
	System.out.println(removeDuplicates(s));

	}

	public static String removeDuplicates(String s) {
		String r="";// it will store the result
		for (int i=0; i<s.length(); i++) {
			char currentChar = s.charAt(i);
			
			if(r.indexOf(currentChar) == -1) {
				r = r+currentChar;// -->0+p=p
			}
		}
		return r;
	}
}
