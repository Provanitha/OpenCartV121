package PageobjectsPOM;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class HRMLoginTest {
	 static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
	}
     @Test
public 	void testlogin() {
    	 HRLoginPage1 lg = new HRLoginPage1(driver);
    	 lg.SetUsername("admin");
    	 lg.Setpassword("admin123");
    	 lg.click_login();
    	 
    	//Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    	 System.out.println(driver.getTitle());
		
	}
	
     @AfterClass
public static	void tearDown(){
    	 driver.quit();
		
        }
}
