package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraystoAL {

	public static void main(String[] args) {
		String s[]= {"abc", "happy", "hello"};
		
		for(String values:s) {
			System.out.println(values);
		}
		
		ArrayList a1= new ArrayList(Arrays.asList(s));
		System.out.println(a1);

	}

}
