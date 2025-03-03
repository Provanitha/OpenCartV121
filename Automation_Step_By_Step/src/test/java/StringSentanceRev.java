
public class StringSentanceRev {

	public static void main(String[] args) {
		String input= "Profinch in Bangalore";
		String s[]= input.split(" ");
		
		String reverseString="";
		
		for(String w:s) {
			String revwords="";
			for(int i=w.length()-1; i>=0; i--) {
				revwords += w.charAt(i);
				
			}
			
			reverseString =reverseString+revwords+" ";
			
		}
	
		System.out.println(reverseString);
	}

}