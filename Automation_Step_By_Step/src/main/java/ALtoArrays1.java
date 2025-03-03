import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ALtoArrays1 {

	public static void main(String[] args) {
		/*ArrayList <Integer> a1= new ArrayList<Integer> ();

		a1.add(25);
		a1.add(35);
		a1.add(45);
		a1.add(75);
		a1.add(95);
		System.out.println(a1);*/

//		System.out.println("Converting ArrayList to Array:");
//		for(int i=0; i<a1.size(); i++){
//		System.out.println(a1);

//HashMap<Integer, String> h1= new HashMap<Integer, String>();
//
//h1.put(1, "Happy");
//h1.put(2, "java");
//h1.put(3, "python");
//h1.put(4, "c++");
//
//
//
//System.out.println(h1);
//
//
//
//Iterator <Entry<Integer,String>>it = h1.entrySet().iterator();
//
//while(it.hasNext()) {
//	<Entry<Integer,String>> = it.next();
//	
		
		ArrayList al= new ArrayList();
		
		al.add(5);
		al.add(9);
		al.add(3);
		al.add(4);
		System.out.println("Before sorting: "+ al);
		Collections.sort(al);
		System.out.println("After sorting: "+ al);
		
		
}


	

	}





