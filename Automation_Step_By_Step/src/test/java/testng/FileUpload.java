package testng;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FileUpload {
	
	@Test
	
	public void initialization() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		Robot robo= new Robot();
		driver.get("https://www.freepdfconvert.com/word-to-pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	StringSelection s= new StringSelection("C:\\Users\\vanitha.d\\Desktop\\RTF_TrRptr.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	
	driver.findElement(By.xpath("//a[@class='btn-wrapper upload-btn']")).click();
	
	
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_V);
	
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);	
	
//	if(s.equals(robo)) {
//		System.out.println("file uploaded");
//	}else {
//		System.out.println("not uploaded");
//	}
		
		//driver.close();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
//		Thread.sleep(3000);
//	WebElement e=driver.findElement(By.xpath("//a[@class='btn-wrapper upload-btn']"));
//	e.sendKeys("E://E-text.docx");
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn-wrapper upload-btn']")));
//   element.click();
//    
//    element.sendKeys("E://E-text.docx");
	}

}
