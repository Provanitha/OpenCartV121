package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LList {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<>();
		
	/*	Add Elements
		add(E e) – Adds an element at the end of the list.
		add(int index, E element) – Adds an element at a specific index.*/
		 list.add("A");            
	        list.add("B");
	        list.add(1, "C"); 
		System.out.println("List"+ list);
		
		System.out.println(list.get(1));
		
	/*	Peek Elements
		peek() – Retrieves, but does not remove, the first element of the list. */
		 
		System.out.println(list.peek());
		
	/*	Poll Elements
		poll() – Retrieves and removes the first element of the list, or returns null if the list is empty */
	
		System.out.println(list.poll());
		
	/*	Iterate through List
		iterator() – Returns an iterator over the elements in the list.*/
		
		Iterator<String> it= list.iterator();
		
		while(it.hasNext()) {
			System.out.println("element:"+ it.next());
		}
		
		System.out.println(list.clone());
		
		


	}

}
