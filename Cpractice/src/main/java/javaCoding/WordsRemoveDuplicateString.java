package javaCoding;

public class WordsRemoveDuplicateString {

	public static void main(String[] args) {
		
		
		String name = "Vanitha in   Bangalore Bangalore";
		//Vanitha in Bangalore;
		int input= name.lastIndexOf("Bangalore");
		 String s= name.substring(0,input);
		 System.out.println(s);
		
		
		
		
		
		
	}}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		System.out.println(removeDuplicates(name));

	}
	public static String removeDuplicates(String name) {
		String r="";
		for(int i=0; i<name.length()-9; i++) {
			//char currentChar =name.charAt(i);
			//if(r.indexOf(currentChar) == -1) {
			r= r+name.charAt(i);
			}
		
		return r;
	}}*/
		
	/*	boolean isDuplicate = true;
		
		for(int i=0; i<name.length; i++) {
			for (int j=i+1; j<name.length; j++) {
				if(name[i] == name[j]) {
					System.out.println("Duplicates found:"+ name[i]);
					
					isDuplicate = true;
				}
			}
			if(isDuplicate==false) {
				System.out.println("no duplicates");
			}
		}

}}
*/


