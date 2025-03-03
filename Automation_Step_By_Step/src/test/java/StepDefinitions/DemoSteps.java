package StepDefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSteps {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("Browser open")
	public void browser_open() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}

	@And("user click on Register button")
	public void user_entered_login_page() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	   
	}

	@When("user filled Register details")
	public void user_is_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.id("customer.firstName")).sendKeys("Vani");
		driver.findElement(By.id("customer.lastName")).sendKeys("Das");
		driver.findElement(By.id("customer.address.street")).sendKeys("room no.1, Mahendra Service centre, Long Boat Pub");
		driver.findElement(By.id("customer.address.city")).sendKeys("Bangalore");
		driver.findElement(By.id("customer.address.state")).sendKeys("Karnataka");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("Karnataka");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("+91 7892043937");
		driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");
		Thread.sleep(2000);
	WebElement username =	driver.findElement(By.id("customer.username"));
	username.sendKeys("vanidas");
	WebElement password=	driver.findElement(By.id("customer.password"));
	password.sendKeys("dasari@123");
	Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("dasari@123");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		
	    
	}
	
	@When("user enter username and password")
	public void user_enter_username_and_password() throws InterruptedException {
		WebElement username1 =	driver.findElement(By.name("username"));
		username1.sendKeys("vanidas");
		WebElement password1=	driver.findElement(By.name("password"));
		password1.sendKeys("dasari@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
	
	}

	@Then("user getting Error!")
	public void user_getting_error() {
	    driver.getPageSource().contains("Error!");
	    System.out.println("User is on error page ");
	    
	    driver.close();
	}






}
