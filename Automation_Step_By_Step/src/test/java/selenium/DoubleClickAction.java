package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.w3schools.com./tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // switch to the frame
        
        driver.switchTo().frame("iframeResult");
        WebElement box1= driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2= driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
    
        box1.clear();// clears box
        box1.sendKeys("Welcome");
        
        
        // double click on the box
        Actions act1= new Actions(driver);
        act1.doubleClick(button).perform();
          //getText() --> it will copy inner text
        String text=box2.getAttribute("value");
        System.out.println("captured text is:"  + text);
        
       if(text.equals("Welcome")) {
    	   System.out.println("Text copied");
       }else {
    	   System.out.println("Text not copied properly");
       }
        
        driver.close();
        
        

	}

}
