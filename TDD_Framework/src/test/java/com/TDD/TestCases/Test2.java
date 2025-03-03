package com.TDD.TestCases;

import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.TDD.Base.BaseTest;

public class Test2 extends BaseTest{

	public WebDriver driver;
	
	@Test
    public void invalidCredentials() throws InterruptedException {
         
		driver.get("https://admin-demo.nopcommerce.com/login?");	
        driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(70));
    	System.out.println("Page Title is :" + driver.getTitle()+" from Firefox");	
    	driver.findElement(By.xpath("//input[@name='Email']")).clear();
    	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("hello@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='Password']")).clear();
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("12342");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText().trim();
        System.out.println("Actual ErrorMessage :" + actualErrorMessage);
        if(actualErrorMessage.contains("Login was unsuccessful")) {
        	System.out.println("Error Message displayed for unsuccessful login");
        }
		
		

    }
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		driver = initializeBrowser("firefox");

        
	}
	
	@AfterMethod
	public void tearDown() {		
		driver.quit();
	}
	
	
}
