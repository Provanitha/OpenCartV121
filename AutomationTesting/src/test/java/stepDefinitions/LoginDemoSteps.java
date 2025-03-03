package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\AutomationTesting\\target\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@And("user is on login page")
	public void user_is_on_google_search_page() throws InterruptedException {
		System.out.println("Inside step - user is on google search page");
		driver.navigate().to("https://affiliate.flipkart.com/login");
		Thread.sleep(2000);
	}
	

@When("user enters (.*) and (.*)")
public void user_enters_vanitha_and(String email, String password) {
	
	driver.findElement(By.id("inputEmail")).sendKeys("vanithadasari98@gmail.com");
	driver.findElement(By.id("inputPassword")).sendKeys("dasari@123");
   
}
@When("user clicks on login")
public void user_clicks_on_login() {
	driver.findElement(By.id("submitLogin")).click();
    
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	driver.close();
    
}

}
