package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	
	
	
	@Test(groups= {"Regression", "Master"})
	public void verify_account_registration() {
		
		logger.info("********** Starting TC001_AccountRegistrationTest *********");
		
		try {
			
		
		HomePage hm= new HomePage(driver);
		hm.clickMyAccount();
		logger.info("Clicked on MyAccount Link... ");
		hm.clickRegister();
		logger.info("Clicked on Register Link... ");
		
		AccountRegistrationPage repage = new AccountRegistrationPage(driver);
		logger.info("Providing customer details......");
		repage.setFirstNmae(randomString().toUpperCase());
		repage.setLastNmae(randomString());
		repage.setEmail( randomString() + "@gmail.com");
		repage.setPhoneNum(randomNumeric());
		
		String password= randomAlphaNumeric();
		repage.setPassword(password);
		repage.setConfirmpwd(password);
		
		repage.clickPolicyButn();
		repage.clickContinuebtn();
		
		logger.info("Validating expected message..");
		
	String conmsg = repage.msgConfirmation();
	
	if(conmsg.equals("Your Account Has Been Created!")) {
		Assert.assertTrue(true);
	}else {
		logger.error("Test failed");
		logger.debug("debug logs...");
		Assert.assertTrue(false);
	}
	//Assert.assertEquals(conmsg, "Your Account Has Been Created!!!");
		}catch (Exception e) {
			
			Assert.fail();
			
		}
		
		logger.info("********** Finished TC001_AccountRegistrationTest *********");
		
	}
	
	
	
	

}
