package testCases;

import java.util.Properties;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	

	@Test(groups= {"Sanity", "Master"})
	public void verify_login() {
		logger.info("***** Starting TC002_LoginTest ****");
		
		// HomePage
		try {	
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login Page
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage macc= new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
		Assert.assertTrue(targetPage);
		}catch (Exception e) {
			Assert.fail();
		}
		
		
		
		logger.info(" ***** Finished TC002_LoginTest **** ");
		
		
	}
	

}
