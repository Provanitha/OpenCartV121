package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement myregister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement mylogin;
	
	
	public void clickMyAccount() {
		myaccount.click();
	}
	public void clickRegister() {
		myregister.click();
	}
	public void clickLogin() {
		mylogin.click();
	}
	
	

}
