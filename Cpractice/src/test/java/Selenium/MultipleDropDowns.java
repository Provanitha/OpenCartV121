package Selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.*;

public class MultipleDropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Cpractice\\src\\drivers\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
	WebElement statedrpdwn=	driver.findElement(By.xpath("//div[@id='state']"));
	statedrpdwn.click();
//	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//	wait.until(ExpectedConditions.elementToBeClickable(statedrpdwn));
	Select drpdwn= new Select(statedrpdwn);
	drpdwn.selectByIndex(1);
//	drpdwn.selectByVisibleText("Uttar Pradesh");
//	WebElement optionUP = driver.findElement(By.xpath("//div[@class=' css-11unzgr']/div[text()='Uttar Pradesh']"));
//    optionUP.click();
	driver.close();
		

	}

}
