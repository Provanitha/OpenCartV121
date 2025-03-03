package javacodingtasks;

public class InStringRemoveDuplicates {

	public static void main(String[] args) {
	/*	String input = "Programming";
	     System.out.println(removeDuplicates(input));
	    }

	    public static String removeDuplicates(String input) {
	        char[] result = new char[input.length()];
	        int index = 0;

	        // Loop through each character in the input string
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            boolean isDuplicate = false;

	            // Check if the character has already been added to the result
	            for (int j = 0; j < index; j++) {
	                if (currentChar == result[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // If it's not a duplicate, add the character to the result array
	            if (!isDuplicate) {
	                result[index] = currentChar;
	                index++;
	            }
	        }

	        // Manually construct the final string from the result array
	        String finalResult = "";
	        for (int i = 0; i < index; i++) {
	            finalResult += result[i];
	        }

	        return finalResult; */
		
		
		
		String input= "happy Automation";
		System.out.println(removeDuplicates(input));
	}
		public static String removeDuplicates(String input) {
			String u="";
			
			for(int i=0; i<input.length(); i++) {
			char cuurentChar= input.charAt(i);
			// For each character, the program checks whether it has already been added to the result string.
			//This is done using the indexOf() method, which checks if the character already exists in result. If indexOf() returns -1, it means the character is not in result.
			if(u.indexOf(cuurentChar) == -1) {
				//Adding Unique Characters:

//If the character is not found in the result string, it is added. 
//This ensures that each character is only included once.
				u=u+cuurentChar;
			}
		}
		
		
		return u;
		
	    }

	}


