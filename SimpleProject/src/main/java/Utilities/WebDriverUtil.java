package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {

	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if (driver==null) {
			System.setProperty("webdriver.driver.chromedriver", "C://Users//vanitha.d//eclipse-workspace//SimpleProject//src//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		return driver;
		
	}
	
	public static void closeDriver() {
		if(driver != null) {
			driver.quit();
		}
	}
}
