package Encapsulation;

public class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name= name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>=0) {
			this.age=age;
		}else {
			System.out.println("Age can not be negative");
		}
	}
	
	public static void main (String ar[]) {
		Person p= new Person();
		
	p.setName("ram");
	p.setAge(25);
	
	System.out.println("Nmae: "+ p.getName());
	System.out.println("age: "+p.getAge());
	System.out.println(p.getClass());
	
	p.setAge(-25);
	
	System.out.println("age is: "+ p.getAge());
	
	}

}
