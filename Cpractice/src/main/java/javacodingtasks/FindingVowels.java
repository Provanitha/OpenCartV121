package javacodingtasks;



public class FindingVowels {

	public static void main(String[] args) {
		String st= "programming";
		boolean foundVowels=false;
		for (int i=0; i<st.length();i++) {
			if(st.charAt(i) == 'a' || st.charAt(i)== 'e' || st.charAt(i)== 'i' || st.charAt(i) == 'o' ||
					st.charAt(i) == 'u') {
				 System.out.println("Given string contains vowel: " + st.charAt(i) + " at the index: " + i);
				//System.out.print("Given String contains:" + st.charAt(i)+"at the index:"+ i);
				foundVowels= true;
				//System.out.print("Given string contains vowels:"+st.charAt(i));
				
				}}if(!foundVowels) {
					System.out.println("Given string not conatins vowels");
				}
		

	}}

//String st= "programming";
//
//for (int i=0; i<st.length();i++) {
//	if(st.charAt(i) == 'a' || st.charAt(i)== 'e' || st.charAt(i)== 'i' || st.charAt(i) == 'o' ||
//			st.charAt(i) == 'u') {
//		 System.out.println("Given string contains vowel: " + st.charAt(i) + " at the index: " + i);
//		
//	}}
//

	