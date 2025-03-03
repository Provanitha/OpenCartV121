package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseHoverActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement desktops= driver.findElement(By.xpath("//a[text()='Desktops']"));
        WebElement mac= driver.findElement(By.xpath("//a[text()='Mac (1)']"));
        
        
        Actions act1= new Actions(driver);
        //mouse hover action
   
        act1.moveToElement(desktops).moveToElement(mac).build().perform();
driver.close();
	}

}
