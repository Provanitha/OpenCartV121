package javaCoding;

public class SplitMethod {

	public static void main(String[] args) {
		String s1= "Bangalore is tech hub";
		String [] w= s1.split(" ");
		for(String f: w) {
			System.out.println(f);
		}
	}

}
