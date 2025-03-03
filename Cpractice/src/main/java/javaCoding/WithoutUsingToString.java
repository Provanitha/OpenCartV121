package javaCoding;

public class WithoutUsingToString {
	int rollno;  
	 String name;  
	 String city;  
	  
	 WithoutUsingToString(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public static void main(String args[]){  
		 WithoutUsingToString s1=new WithoutUsingToString(101,"Raj","lucknow");  
		 WithoutUsingToString s2=new WithoutUsingToString(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	}  