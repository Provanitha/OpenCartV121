package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleWindowsorTabs {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.naukri.com/");
		String parent_windowhandle= driver.getWindowHandle();
		
	}

}
