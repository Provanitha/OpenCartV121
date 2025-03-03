package collections;

import java.util.*;

public class ConvertALtoArrays {

	public static void main(String[] args) {

		  List<Integer> al = new ArrayList<Integer>();
	        al.add(10);
	        al.add(20);
	        al.add(30);
	        al.add(40);
	        
	        Object[] objects= al.toArray();
	        for(int a1 : al) 
	        System.out.println(a1);

	

}
}