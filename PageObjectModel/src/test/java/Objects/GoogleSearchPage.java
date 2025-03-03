package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver drive) {
		
		this.driver= driver;
		}
	
	By serachbox= By.xpath("//textarea[@name='q']");
	
	public void searchgoogle(String Searchinput) throws InterruptedException {
		driver.findElement(serachbox).sendKeys(Searchinput);
		Thread.sleep(5000);
		
	}

}
