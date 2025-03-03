package testng.grouping;
import org.testng.annotations.Test;

public class LoginTests {
	
	@Test(priority=1, groups= {"sanity"})
	void LoginByEmail() {
		System.out.println("This is login by email....");
	}
	
	@Test(priority=2, groups= {"sanity"})
	void LoginByFaceBook() {
		System.out.println("This is login by facebook....");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void LoginByTwitter() {
		System.out.println("This is login by Twitter....");
	}

}
