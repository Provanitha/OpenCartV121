package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass{
	
	@Test(dataProvider="LoginData",  dataProviderClass=DataProviders.class, groups= "Datadriven")// getting data provider from diff class
	public void verify_login(String email, String pwd, String exp)  {
		
		logger.info("-------Starting TC003_LoginDDT---------");
		// HomePage
	try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login Page
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		
		MyAccountPage macc= new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
		
		/* Data is valid--> login success--> passes-- logout
		  Data is valid--> login unsuccess--> failed

		Data is invalid--> login success--> failed -- logout
		Data is invalid--> login unsuccess--> passed */

		
		if(exp.equalsIgnoreCase("Valid")) {
			if(targetPage==true) {
				
				macc.linklogout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}	}
		
		if(exp.equalsIgnoreCase("InValid")) {
			if(targetPage==true) {
				
				macc.linklogout();
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
			}
		}
	}catch(Exception e) {
			Assert.fail();
}finally {
		logger.info("-------Starting TC003_LoginDDT---------");
		
}
}
}