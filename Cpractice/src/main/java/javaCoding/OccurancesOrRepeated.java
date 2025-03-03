package javaCoding;

public class OccurancesOrRepeated {

	public static void main(String[] args) {
		String s= "Hellow World";
		int total_count= s.length();
		int before_removingl= s.replace("l", "").length();
		int count= total_count-before_removingl;
		
		System.out.println(count);

	}

}
