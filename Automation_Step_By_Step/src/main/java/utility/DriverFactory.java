package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\PageObjectModel\\driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		return driver;
		
	}
	
	public static void closeDriver() {
		if(driver != null) {
			driver.quit();
			driver=null;
		}
		
	}

}
