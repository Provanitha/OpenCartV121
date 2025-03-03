package javaCoding;

public class NonprimitiveDataTypes {
	public static void main (String ar[]) {
	
	String s1 ="dshgfdsh";

	String str= "";

	for (int i = 0; i<s1.length(); i++)
	{

	    str= s1.charAt(i)+str;
	    
	}
	System.out.println(str);
	

}
}