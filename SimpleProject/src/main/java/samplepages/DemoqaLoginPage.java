package samplepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaLoginPage {
	
	private WebDriver driver;
	
	@FindBy(id="userName")
	private WebElement txtusername;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement lgnbutton;
	
	
	public DemoqaLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void username(String Username) {
		txtusername.sendKeys(Username);
	}
	public void Password(String password) {
		txtusername.sendKeys(password);
	}
	public void clicklogin() {
		lgnbutton.click();
	}
	

}
