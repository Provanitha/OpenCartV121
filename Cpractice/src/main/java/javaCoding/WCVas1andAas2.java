package javaCoding;

public class WCVas1andAas2 {

	public static void main(String[] args) {

String a= "Syama";
 // Iterate over each character in the string
for (int i=0; i<a.length(); i++) {
	char currentChar= a.charAt(i);
	int count=0;
	   // Count occurrences of currentChar in the string
	for (int j=0; j<a.length(); j++) {
		if(a.charAt(j)== currentChar) {
			count++;
		}
	}
	  // Print the character and its count
	System.out.println(currentChar + "="+count );
	  // Replace the character with a non-alphabet character to avoid counting it again
//	a=a.replace(currentChar, '*');
}

	}

}
