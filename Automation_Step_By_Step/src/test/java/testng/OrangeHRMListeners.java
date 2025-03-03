package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//@Listeners(testng.MyListener.class)

public class OrangeHRMListeners {
	WebDriver driver;
	
	@BeforeClass
	
	void setup() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority=1)
	void testLogo() {
		boolean staus= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(staus, true);
	}
	@Test(priority=2)
	void testAppurl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com");
	}
	
	@Test(priority=3, dependsOnMethods= {"testAppurl"})
	void testHomepageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	}
	
	
	
	


