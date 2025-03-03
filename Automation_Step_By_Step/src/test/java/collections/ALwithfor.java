package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ALwithfor {

	public static void main(String[] args) throws InterruptedException {
		List<String> m1= new ArrayList<String>();
            
		 m1.add("Volvo");
		    m1.add("BMW");
		    m1.add("Ford");
		    m1.add("Mazda");
Collections.sort(m1);
		 //   m1.wait(2000);
		  for(String s:m1) {
			  System.out.println(s);
		  }
		  
		
//		for(int i=0; i<m1.size(); i++) {
//			System.out.println(m1.get(i));
//		}
	}

}
