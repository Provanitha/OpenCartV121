package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;

By sign_button = By.xpath("(//span[text()='Sign in'])[2]");
By email_id    =   By.id("identifierId");
By next_button = By.xpath("//span[text()='Next']");
By password = By.name("name");

public LoginPage(WebDriver driver) {
	this.driver = driver;
}

public void clickSignInButoon() {
	driver.findElement(sign_button).click();
}

public void email(String username) {
	driver.findElement(email_id).sendKeys(username);
	
}
 
public void click_next() {
	driver.findElement(next_button).click();
}

public void enter_password(String passwrd) {
	driver.findElement(password).sendKeys(passwrd);
	
}


}
