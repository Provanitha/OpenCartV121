package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Cpractice\\src\\drivers\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement java = driver.findElement(
	            By.xpath(""));
	       
	        // Create a reference
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	       
	        // Call the JavascriptExecutor methods
	        js.executeScript("arguments[0].click();", java);

	}

}
