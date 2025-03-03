package stepDefinitions;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utility.DriverFactory;
import org.openqa.selenium.WebElement;

public class LoginSteps {
	WebDriver driver= DriverFactory.getDriver();
	LoginPage loginpage= new LoginPage(driver);
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
	    
	}

	@When("I enter {string} as username and {string} as password")
	public void i_enter_as_username_and_as_password(String username, String password) {
		loginpage.enterUsename(username);
		loginpage.enterpwd(password);
		loginpage.clickloginbutton();
	}


	@Then("I should be redirected to the Bookspage")
	public void i_should_be_redirected_to_the_Bookspage() throws InterruptedException {
//		Thread.sleep(3000);
//	    assertTrue(driver.getCurrentUrl().contains("Books"));
		System.out.println(driver.getTitle());
	}
	

@Then("I click on logoutbutton")
public void i_click_on_logout() throws InterruptedException {
//	WebDriverWait wait =new WebDriverWait(driver,30);
//	wait.until(ExpectedConditions.elementToBeClickable(loginpage.clicklogout()));
	Thread.sleep(3000);
	
	loginpage.clicklogout();
	System.out.println("successfully logout");

}


//	@Then("I should see an error message {string}")
//	public void i_should_see_an_error_message(String errormessage) throws InterruptedException {
//		Thread.sleep(3000);
//		assertTrue(driver.getPageSource().contains("errormessage"));
//	   
//	}
//	



	

}
