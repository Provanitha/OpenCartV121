package testng;


import org.testng.annotations.Test;

public class FactoryA {
	
	public String param;
	public FactoryA(String param) {
		this.param=param;
	}
	@Test
	public void testMethod() {
		System.out.println("test method executed with param:" + param);
	}
	
	
	

}
