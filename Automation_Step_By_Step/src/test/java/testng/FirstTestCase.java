package testng;

import org.testng.annotations.Test;

public class FirstTestCase {
	@Test(priority=1)
	
	void Openapp() {
		System.out.println("opening Application....");
	}
	
	@Test(priority=2)
	void Login() {
		System.out.println("login Application....");
	}
	@Test(priority=3)
	void Logout() {
		System.out.println("logout Application....");
	}

}
