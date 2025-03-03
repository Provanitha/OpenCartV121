package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HandleSSL {

	public static void main(String[] args) {


		ChromeOptions op= new ChromeOptions();
		op.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://expired.badssl.com/");                     // Privacy error
		System.out.println("title of the page: " + driver.getTitle()); // expired.badssl.com

	}

}
