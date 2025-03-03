package PackageStrg;

public class ReverseEachWord {

	public static void main(String[] args) {
//	String s= "automation test vs manual test";
//	String [] words= s.split(" ");
//	String reversestring= "";
//	
//	for(String w:words) {
//		String reverseword= "";
//		for(int i=w.length()-1; i>=0; i--) {
//			reverseword= reverseword+w.charAt(i);
//		}
//		
//		reversestring= reversestring+reverseword+" ";
//		
//	}
//	
//	System.out.print(reversestring);
//
//	}

		// using String Builder
		
		String s= "java is a test program";
		
		String [] words= s.split("//s");
		
		String reverseword= "";
		
		for(String w: words) {
			
			
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			reverseword= reverseword+sb.toString()+" ";
		}
		
		System.out.print(reverseword);
		
}
}