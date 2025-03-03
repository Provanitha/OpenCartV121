package com.TDD.TestCases;

import static org.testng.Assert.assertEquals;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.TDD.Base.BaseTest;

public class Test1 extends BaseTest{

	public WebDriver driver;
	
	@Test
    public void validCredentials() throws InterruptedException {       		
		driver.get("https://admin-demo.nopcommerce.com/login?");
        driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(70));
    	System.out.println("Page Title is :" + driver.getTitle()+" from chrome");
    	driver.findElement(By.xpath("//input[@name='Email']")).clear();
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin@yourstore.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='Password']")).clear();
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("admin");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        String actualPageTitle = driver.findElement(By.xpath("//div[@class='content-header']//h1")).getText().trim();
        System.out.println("Page title is:" + actualPageTitle);
        assertEquals(actualPageTitle,"Dashboard");
    }
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		driver = initializeBrowser("chrome");
	
	}
	
	@AfterMethod
	public void tearDown() {		
		driver.quit();
	}
	
	
}
