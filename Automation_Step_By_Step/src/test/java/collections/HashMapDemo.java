package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

    // Declaration
		
		//HashMap hm= new HashMap();
		//Map hm= new HashMap();
		HashMap<Integer,String>hm= new HashMap<Integer, String>();
		
		// adding elements 
		
		hm.put(10, "Ram");
		hm.put(11, "Syam");
		hm.put(12, "Gopal");
		hm.put(11, "Govind");
		hm.put(13, "Krish");
		//hm.put(null, null);
		
		
		
		
		System.out.println(hm);// {null=null, 10=Ram, 11=Govind, 12=Gopal}
		
		
		// size of hashmap
		
		System.out.println(hm.size());// 4
		
		// remove pair
		System.out.println(hm.remove(10));
		// access pair
		System.out.println(hm.get(11));
		
		//get all the keys from hashmap
		System.out.println(hm.keySet());
		
		//get all the values from hashmap
		System.out.println(hm.values());
		
		// with key and values
		
		System.out.println(hm.entrySet());
		
		// Reading data from HashMap
		// using for each ...
		
//		for(int k:hm.keySet()) {
//			System.out.println(k+ "  "+hm.get(k));
//		}
//		
		
		
		Iterator <Entry <Integer, String>> it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry <Integer, String> entry= it.next();
			System.out.println(entry.getKey()+ "="+entry.getValue());
		}
	}
		

	}


