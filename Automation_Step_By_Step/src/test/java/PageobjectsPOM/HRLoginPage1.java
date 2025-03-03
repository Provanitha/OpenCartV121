package PageobjectsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRLoginPage1 {
WebDriver driver;

HRLoginPage1(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(name="username")
WebElement txt_username;

@FindBy(name="password")
WebElement txt_password;


@FindBy(xpath="//button[@type='submit']")
WebElement button_login;


public void SetUsername(String user) {
	txt_username.sendKeys(user);
}
public void Setpassword(String Password) {
	txt_password.sendKeys(Password);
}

public void click_login() {
	button_login.click();
}

}
