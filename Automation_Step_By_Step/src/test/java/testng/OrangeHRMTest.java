package testng;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	
	WebDriver driver;
	@Test(priority=1)
	void openapp() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=2)
	void testLogo() throws InterruptedException {
		Thread.sleep(3000);
	boolean status=	driver.findElement(By.xpath("//img[@alt='orangehrm-logo']")).isDisplayed();
	System.out.println("Logo is displayed:"+ status);
	}
	
	@Test(priority=3)
	void loginHRM() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority=4)
	void CloseApp() {
		driver.quit();
		
	}

}

