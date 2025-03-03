package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshotpage {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");


// 1. fullpage screen shot
/*TakesScreenshot ts= (TakesScreenshot)driver;
 File sourcefile=ts.getScreenshotAs(OutputType.FILE);
 File targetdfile= new File(System.getProperty("user.dir") + "\\Screenshot\\fullpage.png");
 sourcefile.renameTo(targetdfile);
driver.close(); */

// capture the scrren shot of specific section


/* WebElement featured_products= driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
File sourcefile=featured_products.getScreenshotAs(OutputType.FILE);
File targetedfile=new File(System.getProperty("user.dir") + "\\Screenshot\\Feature_product.png");
sourcefile.renameTo(targetedfile);
driver.close(); 

*/


// webelement


WebElement build_own_computer= driver.findElement(By.xpath("//img[@title='Show details for Build your own computer']"));
File sourcefile=build_own_computer.getScreenshotAs(OutputType.FILE);
File targetedfile=new File(System.getProperty("user.dir") + "\\Screenshot\\computer.png");
sourcefile.renameTo(targetedfile);
driver.close();

	}

}
