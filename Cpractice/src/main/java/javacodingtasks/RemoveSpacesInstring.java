package javacodingtasks;

public class RemoveSpacesInstring {

	public static void main(String[] args) {
		
		// trim --> it will remove spaces beginning and ending of the string
		String spce= " Hi Hellow how are   you   ";
		System.out.println(spce.trim());
		
		// replaceAll method it will remove all spaces in the String
		String spces= " Hell o' s i am fine ";
		String removing_spaces= spces.replaceAll("\\s", "");
		System.out.println(removing_spaces);

	}

}
