package stringconcepts;

public class CharAtExample {

	public static void main(String[] args) {
		String a= "JavaProgram";
//		char c= a.charAt(5);
//		System.out.println(c);
		
		int alength= a.length();
		System.out.println(alength);
		// 1st index
		System.out.println("Character at 0 index:"+ a.charAt(0));
		// last index
		System.out.println("Character at last index:" + a.charAt(alength-1));
		
		
	}

}
