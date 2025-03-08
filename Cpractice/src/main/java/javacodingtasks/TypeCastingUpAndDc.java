package javacodingtasks;

public class TypeCastingUpAndDc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p= new Child(); //Up-casting
		p.name= "hello";
		System.out.println(p.name);
		p.method();
		
		Child c=(Child)p;
		c.id=9;
		System.out.println(c.id);
		System.out.println(c.name);
		c.method();
		

	}

}
