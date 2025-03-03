
public class Sentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Profinch in Bangalore";

		String sp[] = s1.split(" ");

		String reverseString ="";

		for(String w: sp){
        String revWords="";
		for(int i=w.length()-1; i>=0; i--){
		 revWords = revWords+w.charAt(i);
		
		}
		reverseString = reverseString+revWords+" ";
		}
		System.out.println(reverseString);
		

	}
	

}
