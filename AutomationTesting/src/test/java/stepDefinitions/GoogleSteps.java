package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {
	WebDriver driver= null;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open");
		System.setProperty("webdriver.chrome.driver", "E:\\PracticeAT\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		System.out.println("Inside step - user is on google search page");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside step - user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside step - hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated tosearch results")
	public void user_is_navigated_tosearch_results() {
		System.out.println("Inside step - user is navigated tosearch results");
		driver.getPageSource().contains("Online Courses");
		driver.close();
	}

}
