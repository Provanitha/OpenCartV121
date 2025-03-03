package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declaration
		//HashSet myset =new HashSet();
		//Set myset =new HashSet();
		//HashSet<String> myset =new HashSet<String>();
		
		HashSet myset =new HashSet();
		
		myset.add(100);
		myset.add("Say hellow");
		myset.add(null);
		myset.add(null);
		myset.add(100);
		myset.add("Java");
		myset.add('A');
		
		
		
		
		
		System.out.println(myset);	// [null, Java, A, 100, Say hellow]--> order not followed
		
		// size of hashset
		System.out.println(myset.size());
		
		// removing element
		
		myset.remove(100);
		System.out.println("After removing element:"+ myset);
		
		// Inserting element is not possible
		
		// Access specific element -- Not Possible
		
		// Converting Hashset to ArrayList-->we can access specific element
		
		ArrayList al= new ArrayList(myset);
		
	     System.out.println(al);
	     System.out.println(al.get(2));
		
	     // read all the elements by using for each loop
	     
	     // bcos for loop is req index, so we are using for each loop
	     
//	     for(Object x:myset) {
//	    	 System.out.println(x);
//	     }
	     
	     // using Itertaor
	     
	     Iterator it= myset.iterator();
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }
	     
	     // removing all the elements
	     
	     myset.clear();
	     System.out.println(myset.isEmpty());
	     
     }
}
