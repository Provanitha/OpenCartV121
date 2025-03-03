import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTablesS {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/WebTable/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		// how many rows in a table
		WebElement search_globalsearch=driver.findElement(By.xpath("//input[@type='search' and @placeholder='global search']"));
		search_globalsearch.sendKeys("PolGermain@whatever.com");
		search_globalsearch.sendKeys(Keys.ENTER);
		
	List<WebElement> row =driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
	
	List<String> rowdata =new ArrayList<>();
	        for(int i=0;i<row.size();i++){
	            List<List<String>> webRows = new ArrayList<>();
	            List<WebElement> values = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr["+(i+1)+"]/td"));
	            for(int j=0;j<values.size();j++){
	                rowdata.add(values.get(j).getText());
	            }
	            System.out.println("rowdata--"+rowdata);
	            webRows.add(rowdata);
	        }
	
	}

}
