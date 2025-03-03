package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
     
        Actions act1= new Actions(driver);
        //Right click
     Action  action= act1.contextClick(button).build(); //building/ creating action and stroing into variable
     
     action.perform();// we are performing/completing action

	}

}
