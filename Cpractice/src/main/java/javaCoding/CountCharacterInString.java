package javaCoding;

public class CountCharacterInString {

	public static void main(String[] args) {
		  String s = "Testinggi";

	        // Loop through each character in the string
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            int count = 0;
	            boolean alreadyCounted = false;

	            // Check if the character has already been counted earlier
	            for (int k = 0; k < i; k++) {
	                if (s.charAt(k) == c) {
	                    alreadyCounted = true;
	                   // break;
	                }
	            }

	            // If character was not counted earlier, count its occurrences
	            if (!alreadyCounted) {
	                for (int j = 0; j < s.length(); j++) {
	                    if (s.charAt(j) == c) {
	                        count++;
	                    }
	                }
	                System.out.println(c + " = " + count);
	            }
	        }
	    }
	}

