package collections;
import java.util.*;
public class ALWithMethods {

	public static void main(String[] args) {
		
//		ArrayList <Integer> a1= new ArrayList();
//		List a2= new ArrayList();
		
		ArrayList a= new ArrayList();
		
		a.add('A');
		a.add("S");
		a.add(12);
		a.add(true);
		a.add(12.6);
		
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.remove(0));
	a.add(1, "ABC");
	
	System.out.println("after adding:"+ a);
	
	System.out.println(a.get(2));
	
	a.set(1, "Java1");
	System.out.println("After changing element: "+ a); // change element
	
	System.out.println(a.contains(12)); // search : true /false
	
	System.out.println(a.containsAll(a));
	
	System.out.println(a.isEmpty()); // true/ false
	
	
	/*want to read data from arraylist
	multiple approaces are there
	1. for loop, 2. for Each, 3. iterator */

//System.out.println("Reading elements from arraylist: ");
//
//for(int i=0; i<a.size(); i++) {
//	System.out.println(a.get(i)); // i repeate
//}

	
	
//	System.out.println("Reading elements using for each loop:");
//	
//	for(Object e: a) {
//		System.out.println(e);
//	}
	
	System.out.println("Reading elements using iterator: ");
	
	Iterator it= a.iterator();
	while(it.hasNext()) { // it will check the elements if elements are there means written true or false
System.out.println(it.next());
	}
	}

}
