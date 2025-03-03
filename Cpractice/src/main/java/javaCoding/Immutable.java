package javaCoding;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* why string is immutable? 
		 * below i written one reference variable i.e., s --? by using concat i gave some data,  
		 *  If one reference variable changes the value of the object,
		 * it will be affected by all the reference variables.
		 * That is why String objects are immutable in Java
		 */
		String s="hi";
		s.concat("hello");
		s.concat("hiii");
		s.concat("done");
		System.out.println(s);
		
		// below i'm explicitly assign it to the reference variable
//		
		s=s.concat("how are you?");
		System.out.println(s);

	}

}
