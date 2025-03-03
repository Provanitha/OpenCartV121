package javaCoding;

import java.util.Arrays;

public class SortingOrder {

	public static void main(String[] args) {
		String s= "zzdffjsffghurw";
		char [] ch= s.toCharArray();
		Arrays.sort(ch);
		String ss= new String(ch);
		System.out.print(ss);
	}

}
