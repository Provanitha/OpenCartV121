package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
       // WebElement copy= driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
        
        
        Actions act1= new Actions(driver);
        //Right click
        act1.contextClick(button).perform();
        //click on copy
        Thread.sleep(5000);
         driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
         // close alert box
      driver.switchTo().alert().accept();
        
        
	}

}
