package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ALCollectionsSort {

	public static void main(String[] args) {
ArrayList a= new ArrayList();
		
		a.add("A");
		a.add("S");
		a.add("B");
		a.add("C");
		a.add("D");
		ArrayList a1= new ArrayList();	
		a1.addAll(a);
		System.out.println("Arraylist elements:"+ a1);
		
//		a1.removeAll(a);
//		System.out.println("After removing all elemts:"+ a1);
		
		//sorting
		
	Collections.sort(a1);
	System.out.println("After sorting :"+ a1);
		
	
	Collections.sort(a1, Collections.reverseOrder());
	System.out.println("After sorting reverse order:"+ a1);
	
	Collections.shuffle(a1);
	System.out.println("After Shuffling :"+ a1);
	

	}

}
