package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Welcome1");
		
		driver.switchTo().defaultContent();
		
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.name("mytext2")).sendKeys("Selenium");
    	driver.switchTo().defaultContent();
    	
    	
   WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
   driver.switchTo().frame(frame3);//mytext3
   driver.findElement(By.name("mytext3")).sendKeys("Playwright");
   
   driver.switchTo().defaultContent();


    	
       driver.quit();
}
}