package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class Actions1 {

	public static void main(String[] args) {

WebDriver driver= new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\driver\\chromedriver.exe");
driver.get("http://demo.guru99.com/test/newtours/");
driver.manage().window().maximize();

WebElement link_home= driver.findElement(By.linkText("Home"));
WebElement td_home = driver.findElement(By.xpath("//html/body/div"+
"/table/tbody/tr/td" + "/table/tbody/tr/td" + "/table/tbody/tr/td" + "/table/tbody/tr/td"));
Actions ac=new Actions(driver);
Actions mouseOverHome = (Actions) ac.moveToElement(link_home);

String bg_color= td_home.getCssValue("background-color");
System.out.println("Before hover:"+ bg_color );
mouseOverHome.perform();

bg_color= td_home.getCssValue("background-color");
System.out.println("After hover:"+ bg_color );

driver.close();
	}

}
