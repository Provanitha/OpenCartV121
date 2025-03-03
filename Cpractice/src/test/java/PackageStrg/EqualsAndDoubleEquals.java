package PackageStrg;

public class EqualsAndDoubleEquals {
	public static void main(String[] args) {
		String s= ""; // store in String constant pool
		String s1= new String("he");
		String s2= new String("he");// it will store in heap memory
		String s4= "";
	
//		System.out.println(s==s1); == it will compare address
//		System.out.println(s==s4);
//		System.out.println(s1==s2);
		
		
		System.out.println(s.equals(s4)); // equals it will compare data
		System.out.println(s.equals(s2));
		System.out.println(s1.equals(s2));
	}

}
