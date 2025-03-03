package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        
        Thread.sleep(3000);
        // drag and drop1
        WebElement rome= driver.findElement(By.xpath("//div/child::div[@id='box6']"));
        WebElement italy= driver.findElement(By.xpath("//div/child::div[@id='box106']"));
      
        Actions act= new Actions(driver);
        act.dragAndDrop(rome, italy).perform();
        
        WebElement washington= driver.findElement(By.xpath("//div/child::div[@id='box3']"));
        WebElement us= driver.findElement(By.xpath("//div/child::div[@id='box103']"));	
        Thread.sleep(3000);
        act.dragAndDrop(washington, us).perform();
        
        
        WebElement oslo= driver.findElement(By.xpath("//div/child::div[@id='box1']"));
        WebElement norway= driver.findElement(By.xpath("//div/child::div[@id='box101']"));	
        Thread.sleep(3000);
        act.dragAndDrop(oslo, norway).perform();
        
        WebElement stockholm= driver.findElement(By.xpath("//div/child::div[@id='box2']"));
        WebElement sweden= driver.findElement(By.xpath("//div/child::div[@id='box102']"));	
        act.dragAndDrop(stockholm, sweden).perform();
        
        WebElement copenhagen= driver.findElement(By.xpath("//div/child::div[@id='box4']"));
        WebElement denmark= driver.findElement(By.xpath("//div/child::div[@id='box104']"));	
        act.dragAndDrop(copenhagen, denmark).perform();
        
        
        
        boolean isRomeDropped=italy.findElement(By.xpath("//div/child::div[@id='box6']")).isDisplayed();
        boolean isWashingtonDropped=us.findElement(By.xpath("//div/child::div[@id='box3']")).isDisplayed();
        boolean isOsloDropped=norway.findElement(By.xpath("//div/child::div[@id='box1']")).isDisplayed();
        boolean isStockholmDropped=sweden.findElement(By.xpath("//div/child::div[@id='box2']")).isDisplayed();
        boolean isCopenhagenDropped=denmark.findElement(By.xpath("//div/child::div[@id='box4']")).isDisplayed();
        
        
        System.out.println("Rome dropped in Italy: " + isRomeDropped);
        System.out.println("Washington dropped in US: " + isWashingtonDropped);
        System.out.println("Oslo dropped in Norway: " + isOsloDropped);
        System.out.println("Stockholm dropped in Norway: " + isStockholmDropped);
        System.out.println("Copenhagen dropped in Norway: " + isCopenhagenDropped);
        
        
        driver.quit();

}
}