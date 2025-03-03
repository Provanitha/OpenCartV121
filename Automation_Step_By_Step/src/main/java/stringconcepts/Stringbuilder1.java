package stringconcepts;

public class Stringbuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        // Insert a string at a specific position
        sb.insert(5, " Java");

        // Replace part of the string
        sb.replace(0, 5, "Hi");

        // Reverse the string
        sb.reverse();

        // Convert StringBuilder to a String
        String result = sb.toString();

        // Print the result
        System.out.println(result);
    }


	}


