package Selenium;
import org.openqa.selenium.chrome.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Conditionalstatements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.nopcommerce.com/register");
		driver.findElement(By.xpath("//span[text()='Verify you are human']")).click();
//		Thread.sleep(3000);
		WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce']"));
		System.out.print("Dispaly status of logo" + logo.isDisplayed());
		driver.close();
	}
}
