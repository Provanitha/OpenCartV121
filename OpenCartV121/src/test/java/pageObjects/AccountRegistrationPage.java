package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage{
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastname;
	
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtphone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtconfirmpwd;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement checkedpolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebtn;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void setFirstNmae(String firstname) {
		txtfirstname.sendKeys(firstname);
	}
	public void setLastNmae(String Lastname) {
		txtlastname.sendKeys(Lastname);
	}
	 public void setEmail(String email) {
		 txtemail.sendKeys(email);
 }
	 public void setPassword(String password) {
		 txtpassword.sendKeys(password);
	 }
	 
	 public void setPhoneNum(String phonenum) {
		 txtphone.sendKeys(phonenum);
}
	 public void setConfirmpwd(String confirmpwd) {
		 txtconfirmpwd.sendKeys(confirmpwd);
	 }
	 public void clickPolicyButn() {
		 checkedpolicy.click();
	 }
	 public void clickContinuebtn() {
		 continuebtn.click();
		 // sometime click method it won't work
	// 1. sol	 continuebtn.submit();
		 
//	2. sol	 Actions ac= new Actions(driver);
//		 ac.moveToElement(continuebtn).click().perform();
		 
		 
//	3. sol	 JavascriptExecutor j= (JavascriptExecutor)driver;
//		    j.executeScript("arguments[0], click();", continuebtn);
//		 
		// sol 4. continuebtn.sendKeys(Keys.RETURN);
		 
//	sol5.	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//		 wait.until(ExpectedConditions.elementToBeClickable(continuebtn));
		 
	 }
	 public String msgConfirmation() {
		 try {
		return (msgConfirmation.getText());
	 }catch(Exception e) {
		 return (e.getMessage());
	 }
	
	 }}
