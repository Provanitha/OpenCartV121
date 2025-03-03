package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Cpractice\\src\\drivers\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.browserstack.com/users/sign_up");
		
		driver.findElement(By.xpath("//input[@id='user_full_name']")).sendKeys("Vanitha");
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("happy@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("happy@123");
		driver.findElement(By.xpath("//input[@id='user_submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='tnc_checkbox']")).click();

Thread.sleep(5000);
		
		Alert alert= driver.switchTo().alert();
		
		String alertmsg= driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		Thread.sleep(4000);
		alert.accept();
	}

}
