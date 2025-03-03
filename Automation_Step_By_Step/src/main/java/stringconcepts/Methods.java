package stringconcepts;

public class Methods {

	public static void main(String[] args) {
		String s1= "Hai";
		String s2=s1.intern();
		System.out.println(s2);
		// Returns a canonical representation of the string (adds it to the string pool if not already present).
		String A1= new String ("Ha");
		String a2=A1.intern();
		System.out.println(a2);
		
		   System.out.println("1===========================================");  
		   
		   
		//Format
		String s = String.format("Name: %s, Age: %d", "John", 25);
		System.out.println(s);
		// Output: "Name: John, Age: 25"
		
		   System.out.println("2===========================================");
	
		String s3 = String.join(",", "one", "two", "three"); // Output: "one,two,three"
		System.out.println(s3);
		
		   System.out.println("3===========================================");
		
		String s4 = "hello123"; 
	System.out.println(s4.matches("\\w+"));	 // Output: true
	
	   System.out.println("4===========================================");
	
	String s5 = "hello"; 
	String s6 = "yellow"; 
	System.out.println(s5.regionMatches(0, s6, 1, 3)); // Output: true (compares "ell" in both strings)
//	System.out.println(s5.codePointAt(0));
	
	   System.out.println("5===========================================");
	
	String s7 = "hello"; 
	byte[] bytes = s7.getBytes();// converting bytes
	for(byte b: bytes) {
		System.out.println(b);
		
	}
	
	   System.out.println("6===========================================");
	
	String q= "happy";
	System.out.println(q.codePointAt(0));
	System.out.println(q.codePointBefore(2));
	System.out.println(q.codePointCount(1, 4));
	System.out.println(q.offsetByCodePoints(1, 3));
	
	   System.out.println("7===========================================");
	
	char[] charArray = {'J', 'a', 'v', 'a', ' ', 'R', 'o', 'c', 'k', 's'};
    
    // Create a string from the char array using copyValueOf
    String str = String.copyValueOf(charArray);
    System.out.println(str);
    
    System.out.println("8===========================================");
	
    String str1 = "Hello, World!";
    
    // Create a character array of sufficient size
    char[] charArray1 = new char[20];
    
    // Copy characters from index 7 to 12 from the string "Hello, World!" to charArray starting at index 5
    str1.getChars(7, 12, charArray1, 5);
    
    // Print the contents of the charArray
    System.out.println(charArray1);
	
    System.out.println("9===========================================");
    
    
    String st= "Hello, 😊 World!";
    
    // Find the index 2 code points ahead of the starting index 7 (which is the comma in "Hello, 😊 World!")
    int index = st.offsetByCodePoints(7, 2);

    
    System.out.println("Original String: " + st);
    System.out.println("Character at index 7: " + st.charAt(7));
    System.out.println("New index after moving 2 code points: " + index);
    System.out.println("Character at the new index: " + st.charAt(index));
	}
	

}
