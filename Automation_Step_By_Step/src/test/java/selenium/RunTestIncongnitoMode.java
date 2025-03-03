package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIncongnitoMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://expired.badssl.com/");                     // Privacy error
		System.out.println("title of the page: " + driver.getTitle()); // expired.badssl.com
      driver.close();
	}

}
