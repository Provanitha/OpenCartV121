package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(id="userName")
	WebElement txtusername;
	
	
	@FindBy(id="password")
	WebElement txtpwd;
	
	@FindBy(id="login")
	WebElement lgnbttn;
	
	@FindBy(id="submit")////button[text()='Log out']
	WebElement logutbutton;
	
	
	
	public void enterUsename(String username) {
	
		txtusername.sendKeys(username);
	}
	
	public void enterpwd(String Password) {
		txtpwd.sendKeys(Password);
	}
	
	public void clickloginbutton() {
		lgnbttn.click();
	}
	
	public void clicklogout() {
		logutbutton.click();
	}
	
	
	
}
