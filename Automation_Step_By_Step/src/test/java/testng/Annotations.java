package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*Login
 * search
 * logout
 * Login
 * Adv search
 * logout
 */
public class Annotations {
	
	@BeforeTest
	void login() {
		System.out.println("login into app...");
	}
	
	@Test
	void search() {
		System.out.println("search ...");
	}
	@AfterTest
    void logout() {
    	System.out.println("logout app");
    }
    
	@Test
    void advsearch() {
    	
    	System.out.println("adv search...");
    	
    }
    
    
}
