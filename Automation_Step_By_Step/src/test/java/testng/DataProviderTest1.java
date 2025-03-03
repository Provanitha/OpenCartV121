package testng;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
public class DataProviderTest1 {
	WebDriver driver;

	@BeforeClass
	
	void setup() {
		driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="db")
	
	void testLogin(String email, String pwd) throws InterruptedException {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys("vanithadasari98@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("dasari@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		boolean status= driver.findElement(By.xpath("//span[text()='My Account']")).isDisplayed();
		if(status == true) {
			
			driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
		
	}
	@AfterClass
	
	void tearDownn() {
		driver.quit();
		
	}
	
	@DataProvider(name ="db")
	Object [][]  loginData(){
		
		Object datac [][]  = {
			    {"abc@gmail.com", "test@123"},
				{"happy@gmail.com", "bh@123"},
				{"abx@yahho.com", "sos@345"},
				{"happymail@gmail.com", "hau@123"},
				{"lkjjpos@gmai.com" , "djkh@14"},
				
				};
				
		return datac;
		
		
		
	}

}
