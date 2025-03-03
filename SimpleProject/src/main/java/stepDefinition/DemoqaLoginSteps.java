package stepDefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import Utilities.WebDriverUtil;
import io.cucumber.java.en.*;
import samplepages.DemoqaLoginPage;


public class DemoqaLoginSteps {

	WebDriver driver;
	DemoqaLoginPage lginpage;
		
		@Given("I navigate to the login page")
		public void i_navigate_to_the_login_page() {
			driver=WebDriverUtil.getDriver();
		   driver.get("https://demoqa.com/login");
		   driver.manage().window().maximize();
		}

		@When("I enter {string} as username and {string} as password")
		public void i_enter_as_username_and_as_password(String username, String password) {
			lginpage.username(username);
			lginpage.Password(password);
			lginpage.clicklogin();
		}

		@Then("I should be logged into the login page")
		public void i_should_be_logged_into_the_login_page() {
			assertTrue(driver.getCurrentUrl().contains("dashboard"));
		   
		}

		@Then("I should be able see error as Invalid username or password!")
		public void i_should_be_able_see_error_as_invalid_username_or_password(String errormessage) {
		assertTrue(driver.getPageSource().contains(errormessage));
		driver.quit();
		    
		}

	}


