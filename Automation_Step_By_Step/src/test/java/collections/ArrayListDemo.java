package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList mylist = new ArrayList();
//		List m1= new ArrayList();
//		ArrayList<Integer> a1= new ArrayList<Integer>(); --> store only Integer data 
		
		mylist.add(26);
		mylist.add("Ram");
		mylist.add('Z');
		mylist.add(123.67f);
		mylist.add(85678.8475);
		mylist.add(null);
		mylist.add(null);
		mylist.add("Ram");
		mylist.ensureCapacity(5);
		
		for(int i=0; i<=5; i++) {
			mylist.add(i);
		}
		System.out.println("increasing size of mylist: " +mylist);
		
	System.out.println(mylist.clone());	
	System.out.println(mylist.contains(123));
	System.out.println(mylist.containsAll(mylist));
	System.out.println(mylist.equals(mylist));
	
		
		System.out.println("The Size of mylist is:"+ mylist.size());
		System.out.println("Printing data from ArrayList:"+ mylist);
		
//		
//		// remove --> based on the index we can remove
//		mylist.remove(1);
//		System.out.println("After removing:"+ mylist);
//		
//		// Insert element in the array
//		
//		mylist.add(2,"Sita");
//		System.out.println("After inserting element in th Arraylist:"+ mylist);
//		
//		//modify element in the ArrayList(replace/change/modify)
//		
//		mylist.set(2, "Hanuman");
//		System.out.println("AFter modifing the element:"+ mylist);
//		
//		// access specific element in AL
//		System.out.println(mylist.get(4));
//		
//		// Reading all the elements from the ArrayList
//		
//		// using normal for loop
//		
//		/*for(int i=0;i<mylist.size();i++) {
//			System.out.println(mylist.get(i));
//		}
//		*/
//		
//		// using for each loop
//		
//		/*for(Object a:mylist) {
//			System.out.println(a);
//		}
//		*/
//		
//		// using Iterator --> related to collections only
//		Iterator it=mylist.iterator();// homogenious data means Iterator <String> it=  mylist.iterator();
//		while( it.hasNext()) {  // hasnext it will check existing values
//		 System.out.println(it.next()); // print the values
//		 
//		 // checking array list empty or not
//		 
//		 System.out.println("Array list is it empty?:"+mylist.isEmpty());
//		 
//		 
//		 // remove multiple elements randomly
//		 
//		 ArrayList<Object> m1=new ArrayList<Object>();
//		 m1.add(26);
//		 m1.add('Z');
//		 
//	mylist.removeAll(m1);
//	System.out.println("After removing multiple elements:"+ mylist);
//		 
//		 // remove all elements from AL
//		 
//	// 	mylist.clear();
//		
//		
		
		}

	}


