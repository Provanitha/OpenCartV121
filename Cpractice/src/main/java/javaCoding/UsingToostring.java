package javaCoding;

public class UsingToostring {

	 int rollno;  
	 String name;  
	 String city;  
	  
	 UsingToostring(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  
	 public static void main(String args[]){  
		 UsingToostring s1=new UsingToostring(101,"Raj","lucknow");  
		 UsingToostring s2=new UsingToostring(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	}  


