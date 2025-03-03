package TestScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	
	
	WebDriver driver;
	GoogleSearchPage page= new GoogleSearchPage(driver);
	
	@BeforeTest
	
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.google.com/");
		
	}
	
   @Test
   
   public void SearchOperation() throws InterruptedException {
	   page.searchgoogle("flipkart");
	  
   }
   
   @AfterTest
   
   public void aftertest() {
	   driver.quit();
   }
   


	
	
	

}
