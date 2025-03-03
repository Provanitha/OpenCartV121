package testng;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

	
		WebDriver driver;

		@BeforeClass
		@Parameters({"browser", "url"})
		void setup(String br, String url) {
			switch(br.toLowerCase()) {
			case "chrome": driver = new ChromeDriver();
			break;
			case "edge": driver = new EdgeDriver();
			break;
			case "firefox": driver = new FirefoxDriver();
			break;
			}
			
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		@Test()
		
		void testLogin() throws InterruptedException {
			
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

	}


