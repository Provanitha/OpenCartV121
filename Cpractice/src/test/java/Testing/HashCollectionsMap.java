package Testing;

import java.util.HashMap;

public class HashCollectionsMap {

	public static void main(String[] args) {
		HashMap <Integer, String> hm= new HashMap<>();
		// adding elements
		hm.put(null, null);
		hm.put(1, "vanitha");
		hm.put(2, "habadri");
		hm.put(2, "vanitha");
		hm.put(3, "sam");
		hm.put(4, "james");
		
		System.out.println("adding keyvalues"+ hm);
		// change the value
		hm.put(2, "ram");
		
		System.out.println("changing values"+ hm);
		
		// remove the value
		
		hm.put(2, "vanitha");
		System.out.println("removed values"+ hm);
		
	}

}
