package Selenium;
import org.openqa.selenium.chrome.*;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SeleniumWaits {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		String windowid=driver.getWindowHandle();	
		System.out.println(windowid);
		
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			
			Set<String> ids= driver.getWindowHandles();
			System.out.println(ids);
			
			List<String> Windowids= new ArrayList(ids);
		String parentid= Windowids.get(0);
		String childid=	Windowids.get(1);
			
			System.out.println(parentid);
			System.out.println(childid);
		
		driver.close();
		//driver.quit();

}
}