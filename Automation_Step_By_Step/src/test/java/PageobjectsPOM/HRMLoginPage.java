package PageobjectsPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRMLoginPage {
	WebDriver driver;
	//Constructor -->  it will initiate the browser
	HRMLoginPage(WebDriver driver){
		this.driver=driver;
	}
	//Locators
	By txt_username= By.name("username");
	By txt_password= By.name("password");
	By button_login= By.xpath("//button[@type='submit']");
	//Action Methods
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	
	public void SetUsername(String user) {
		driver.findElement(txt_username).sendKeys(user);
	}
	public void Setpassword(String Password) {
		driver.findElement(txt_password).sendKeys(Password);
	}
	
	public void click_login() {
		driver.findElement(button_login).click();
	}

}
