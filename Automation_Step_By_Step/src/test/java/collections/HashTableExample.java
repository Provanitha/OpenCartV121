package collections;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
	Hashtable<Integer,String> ht= new Hashtable<Integer,String>();
	
	ht.put(10, "ram");
	ht.put(11, "sam");
	ht.put(12, "you");
	ht.put(13, "ywllow");

	System.out.println("inital table: "+ht);
	System.out.println(ht.getOrDefault(11, "Not exist"));
	
	ht.putIfAbsent(14, "p");
	ht.putIfAbsent(15, "h");
	System.out.println("updated table: "+ ht);
	
	
System.out.println(ht.get(10));
System.out.println(ht.containsKey(10));
System.out.println(ht.containsValue("you"));

System.out.println(ht.keySet());
System.out.println(ht.values());



for(int k:ht.keySet()) {
	
	System.out.println(ht+ "  "+ht.get(ht));
}
	}

}
