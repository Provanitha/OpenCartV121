
public class VowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input =  "Vanitha";

		Boolean foundVowel = false;

		for (int i=0; i<input.length(); i++){

		if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){

		System.out.println("found vowels:"+ input.charAt(i)+ "at the index of:" + i);
		foundVowel=true;

		}
		}
		if(!foundVowel){
			System.out.println("not found vowels");
	}

}
}