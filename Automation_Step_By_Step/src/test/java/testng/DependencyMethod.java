package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(false);
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login() {
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(false);	
	}
	
	@Test(priority=4,dependsOnMethods= {"search"})
	void advsearch() {
		Assert.assertTrue(false);
	}
	
	@Test(priority=5)
	void logout() {
		Assert.assertTrue(false);
	}

}
