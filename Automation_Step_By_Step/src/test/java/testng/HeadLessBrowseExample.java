package testng;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
public class HeadLessBrowseExample {
	
	@Test
	public void headlessBrowser() {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\driver\\chromedriver.exe");
//	ChromeOptions options= new ChromeOptions();
//options.setHeadless(true);
//	
//	WebDriver driver =new ChromeDriver(options);
//	driver.get("https://www.google.com/");
//	
//	driver.findElement(By.name("q")).sendKeys("selenium methods");
//	
	
		
		        // Set the ChromeDriver path
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\driver\\chromedriver.exe");

		        // Create an instance of ChromeOptions
		        ChromeOptions options = new ChromeOptions();

		        // Enable headless mode
		       // options.setHeadless(true);
		        options.addArguments("--headless");
		        options.addArguments("--disable-gpu");

		        // Initialize WebDriver with the ChromeOptions
		        WebDriver driver = new ChromeDriver(options);

		        // Navigate to Google
		        driver.get("https://www.google.com/");

		        // Search for "selenium methods"
		        driver.findElement(By.name("q")).sendKeys("selenium methods");
		        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		        // Print the title of the page
		        System.out.println("Page title is: " + driver.getTitle());

		        // Close the browser
		        driver.quit();
		    }
		
	

}
