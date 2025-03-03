package collections;

import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {

TreeSet s= new TreeSet();
s.add("21");
s.add("22");
s.add("26");
s.add("29");

System.out.println(s);

System.out.println(s.first());// returns lowest element
System.out.println(s.last());// returs highest elemt
System.out.println(s.headSet("D"));// Returns a view of the portion of the set whose elements are strictly less than the specified toElement.
System.out.println(s.tailSet("A"));//Returns a view of the portion of the set whose elements are greater than or equal to the specified fromElement.
System.out.println(s.ceiling("29"));//Returns the least element in the set that is greater than or equal to the specified element.
System.out.println(s.floor("21"));
	}

}
