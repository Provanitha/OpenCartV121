package collections;

public class stringhjdsfj {

	public static void main(String[] args) {
		String s= "java is a good programming language";

		String a[]=s.split(" ");
		String reverseString="";
		for(String w:a) {
		String revesreword="";
       for(int i=w.length()-1; i>=0; i--){
			revesreword+= w.charAt(i);
		}
		reverseString=reverseString+revesreword+" ";
	
		}
System.out.println(reverseString);

}
}