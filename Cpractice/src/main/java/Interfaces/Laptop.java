package Interfaces;

public interface Laptop {
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	// java 1.8 / 8 onwards we can implemet methods using static and default
	
	default void security() {
		commoncode();
		System.out.println("Laptop security ccode");
	}
	static void audio() {
		commoncode();
		System.out.println("audio code");
	}
	
	// java 1.9 onwards introduced private methods to maintain code reusability
	 static void commoncode() { // we have to use same method in static methods have to use static keyword
		 System.out.println("common code for Laptop");
		
	}
	

}
