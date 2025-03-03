package WrapperClassesDemo;

public class DataConversionMethods {

	public static void main(String[] args) {
//		String s1= "Welcome";
//		System.out.println(Integer.parseInt(s1)); Exception in thread "main" java.lang.NumberFormatException: For input string: "Welcome"
		
	/*	String s1= "1089";
		String s2= "1998";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		int i=10;
		System.out.println(String.valueOf(i));
	
		
		String s1= "10.67";
		String s2= "16.9";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
			*/
		
		String s1= "true";// other than true, if you pass any string that will return false.
		System.out.println(Boolean.parseBoolean(s1));
	}

}
