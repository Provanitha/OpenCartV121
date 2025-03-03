package selenium;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensuionsAtRunTime {

	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
		File file= new File("E:\\Automation testing\\crx file-selectorhub\\SelectorsHub.crx");
		options.addExtensions(file);
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://text-compare.com/");
//System.out.println(driver.getTitle());


	}

}
