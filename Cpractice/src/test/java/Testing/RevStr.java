package Testing;

public class RevStr {

	public static void main(String[] args) {
		String aam= "prilims";
		String rev= "";
		
		for(int i=0; i<aam.length(); i++) {
			rev= aam.charAt(i)+rev;
			
		}
		System.out.print(rev);

	}

}
