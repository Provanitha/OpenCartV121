import java.util.HashMap;

public class HashMapA {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm= new HashMap();

		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "A");

		System.out.println(hm.entrySet());
		
//		
//		1=A
//		2=B
//		3=C
//		4=A
//		

	}

}
