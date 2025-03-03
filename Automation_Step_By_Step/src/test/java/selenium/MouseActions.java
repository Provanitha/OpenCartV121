package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\driver\\chromedriver.exe");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
	        
/*	        try {
	            // Open the URL
	            driver.get("https://demo.nopcommerce.com/");

	            // Find the element you want to hover over (for example, the "Computers" menu)
	            WebElement computersMenu = driver.findElement(By.linkText("Computers"));
	            
	            // Create an instance of Actions class
	            Actions actions = new Actions(driver);
	            
	            // Perform the hover over action
	            actions.moveToElement(computersMenu).perform();
	            
	            // Wait for a while (optional, for visual observation)
	            Thread.sleep(2000);
	            
	            // Now click on a submenu (for example, "Desktops")
	            WebElement desktopsOption = driver.findElement(By.linkText("Desktops"));
	            actions.moveToElement(desktopsOption).click().perform();
	            
	            // Wait to observe the action (optional)
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        } */
	    
	
	// doubleclick()
	        
	        driver.get("https://demo.nopcommerce.com");
	
	  WebElement sourceElement = driver.findElement(By.id("source"));
	  WebElement targetElement = driver.findElement(By.id("target"));
	  Actions actions = new Actions(driver);
	  actions.dragAndDrop(sourceElement, targetElement).perform();

	}
}

